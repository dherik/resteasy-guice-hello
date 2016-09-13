package org.jboss.resteasy.examples.guice.hello;

import com.google.inject.Binder;
import com.google.inject.Module;
import org.jboss.resteasy.examples.guice.user.IUserService;
import org.jboss.resteasy.examples.guice.user.UserService;

public class HelloModule implements Module
{
   public void configure(final Binder binder)
   {
//      binder.bind(HelloResource.class);
      binder.bind(IGreeterService.class).to(GreeterService.class);
      
//      binder.bind(UserResource.class);
      binder.bind(IUserService.class).to(UserService.class);
   }
}
