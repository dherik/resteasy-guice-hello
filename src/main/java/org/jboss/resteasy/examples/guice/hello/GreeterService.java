package org.jboss.resteasy.examples.guice.hello;

public class GreeterService implements IGreeterService
{
   public String greet(final String name)
   {
      return "Hello " + name;
   }
}
