/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.resteasy.examples.guice.user;

import com.google.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;

/**
 *
 * @author dherik
 */
@Path("user")
public class UserResource 
{
    private final IUserService userService;

   @Inject
   public UserResource(final IUserService userService)
   {
      this.userService = userService;
   }

   @GET
   @Path("{name}")
   public String hello(@PathParam("name") final String name) {
      return userService.getUser(name);
   }
}
