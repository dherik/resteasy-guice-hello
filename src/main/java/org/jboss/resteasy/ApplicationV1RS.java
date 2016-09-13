/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.jboss.resteasy;

import java.util.HashSet;
import java.util.Set;
import javax.servlet.ServletContext;
import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import javax.ws.rs.core.Context;
import org.jboss.resteasy.examples.guice.hello.HelloResource;
import org.jboss.resteasy.examples.guice.user.UserResource;

/**
 *
 * @author dherik
 */
@ApplicationPath("v1")
public class ApplicationV1RS extends Application {

    private final Set<Class<?>> classes;

    public ApplicationV1RS(@Context ServletContext servletContext) {
        classes = new HashSet<Class<?>>();

        classes.add(HelloResource.class);
        classes.add(UserResource.class);
    }
    
    @Override
    public Set<Class<?>> getClasses() {
            return this.classes;
    }

}
