#Overview
There are a lot of choices when it comes to implementing web applications, web services and  [SAML][]. This project is a demonstration of combining [Spring][] (context and mvc), [CXF][], [WS-Security][wss], [OpenSAML][] and [Maven][].

#Running
To get things up and running:

    spring-cxf-saml $ mvn install
    spring-cxf-saml $ cd client
    client $ mvn jetty:run

In a separate shell window:

    spring-cxf-saml $ cd server
    server $ mvn jetty:run

Open http://localhost:9090/client/hello , enter values and select submit.

[saml]: http://en.wikipedia.org/wiki/Security_Assertion_Markup_Language
[opensaml]: https://spaces.internet2.edu/display/OpenSAML/Home/
[maven]: http://maven.apache.org
[wss]: http://en.wikipedia.org/wiki/WS-Security
[cxf]: http://cxf.apache.org/
[spring]: http://www.springsource.org/
