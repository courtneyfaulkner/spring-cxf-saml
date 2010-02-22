package org.schmoove.saml.service;

import javax.jws.WebService;

@WebService(endpointInterface = "org.schmoove.saml.service.HelloWorld", serviceName = "HelloWorldService")
public class HelloWorldImpl implements HelloWorld {

    public String sayHi(String text) {
        return "Hello " + text;
    }
}

