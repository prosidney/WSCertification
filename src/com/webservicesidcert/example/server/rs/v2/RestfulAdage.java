package com.webservicesidcert.example.server.rs.v2;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by Sidney on 16-12-17.
 */
@ApplicationPath("/resourcesA")
public class RestfulAdage extends Application {
    @Override
    public Set<Class<?>> getClasses() {
        Set<Class<?>> set = new HashSet<Class<?>>();
        set.add(Adages.class);
        return set;
    }
}