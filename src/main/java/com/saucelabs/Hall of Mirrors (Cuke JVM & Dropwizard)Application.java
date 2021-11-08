package com.saucelabs;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class Hall of Mirrors (Cuke JVM & Dropwizard)Application extends Application<Hall of Mirrors (Cuke JVM & Dropwizard)Configuration> {

    public static void main(final String[] args) throws Exception {
        new Hall of Mirrors (Cuke JVM & Dropwizard)Application().run(args);
    }

    @Override
    public String getName() {
        return "Hall of Mirrors (Cuke JVM & Dropwizard)";
    }

    @Override
    public void initialize(final Bootstrap<Hall of Mirrors (Cuke JVM & Dropwizard)Configuration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final Hall of Mirrors (Cuke JVM & Dropwizard)Configuration configuration,
                    final Environment environment) {
        // TODO: implement application
    }

}
