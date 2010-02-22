package org.schmoove.saml.controller;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.schmoove.saml.service.HelloWorld;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/hello")
public class HelloController {

	@RequestMapping(method=RequestMethod.GET)
	public String getHello(Model model) {
		model.addAttribute(new Hello());
		return "hello/hello";
	}
	
	@RequestMapping(method=RequestMethod.POST)
	public String postHello(Hello hello, BindingResult result) {
		return "redirect:/hello/" + hello.getName();
	}

	@RequestMapping(value="{name}", method=RequestMethod.GET)
	public String getView(@PathVariable String name, Model model) {
		Hello hello = new Hello();
		
    	JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();

    	factory.getInInterceptors().add(new LoggingInInterceptor());
    	factory.getOutInterceptors().add(new LoggingOutInterceptor());
    	factory.setServiceClass(HelloWorld.class);
    	factory.setAddress("http://localhost:8080/server/HelloWorld");
    	HelloWorld client = (HelloWorld) factory.create();

    	hello.setResult(client.sayHi(name));
		
		model.addAttribute(hello);
		return "hello/hello";
	}
	
}
