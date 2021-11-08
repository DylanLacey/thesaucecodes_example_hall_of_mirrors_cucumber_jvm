package com.saucelabs.examples.resources;

import com.codahale.metrics.annotation.Timed;
import com.saucelabs.examples.api.Sauce;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicLong;

@Path("/sauce")
@Produces(MediaType.APPLICATION_JSON)
public class SauceResource {
    private final String template = "%s's favourite sauce is %s";
    private final String defaultUserName;
    private final String defaultUserSauce;
    private final AtomicLong counter;

    public SauceResource(String defaultUserName, String defaultUserSauce) {
        this.defaultUserName = defaultUserName;
        this.defaultUserSauce = defaultUserSauce;
        this.counter = new AtomicLong();
    }

    @GET
    @Timed
    public Sauce getFavouriteSauce(@QueryParam("name") Optional<String> name, @QueryParam("sauce") Optional<String> sauce) {
        final String sauceLover = name.orElse(defaultUserName);
        final String sauceLoved = sauce.orElse(defaultUserSauce);
        return new Sauce(counter.incrementAndGet(), sauceLover, sauceLoved);
    }
}
