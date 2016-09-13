# Guice Integration with Resteasy and Jetty

This project is a simple example showing the guice integration. This example was corrected and based from [this example](https://github.com/resteasy/Resteasy/tree/3.0.16.Final/jaxrs/examples/guice-hello).

## System Requirements:

Maven 2.0.9 or higher

## Building the project:

 1. In root directoy
    
       mvn clean install

 2. Run it with embedded Jetty

       mvn jetty:run
 
 3. Access the url [http://localhost:9095/v1/hello/world](http://localhost:9095/v1/hello/world), [http://localhost:9095/v1/user/john](http://localhost:9095/v1/user/john) (change to `/v2/` too)
