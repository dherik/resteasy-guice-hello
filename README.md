# Guice Integration with Resteasy and Jetty

This project is a simple example showing the guice integration. This example was corrected and based from [this example](https://github.com/resteasy/Resteasy/tree/3.0.16.Final/jaxrs/examples/guice-hello).

## System Requirements:

Maven 2.0.9 or higher

## Building the project:

 1. In root directoy

        mvn clean install

This will build a WAR

## Run it with embedded Jetty:

    mvn jetty:run

And use this example URL to access the resource: [http://localhost:9095/hello/world](http://localhost:9095/hello/world)
