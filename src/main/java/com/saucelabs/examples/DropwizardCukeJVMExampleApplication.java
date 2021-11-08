package com.saucelabs.examples;

import com.saucelabs.examples.api.Sauce;
import com.saucelabs.examples.health.StupidHealthCheck;
import com.saucelabs.examples.resources.SauceResource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class DropwizardCukeJVMExampleApplication extends Application<DropwizardCukeJVMExampleConfiguration> {

    public static void main(final String[] args) throws Exception {
        new DropwizardCukeJVMExampleApplication().run(args);
    }

    @Override
    public String getName() {
        return "DropwizardCukeJVMExampleApplication";
    }

    @Override
    public void initialize(final Bootstrap<DropwizardCukeJVMExampleConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final DropwizardCukeJVMExampleConfiguration configuration,
                    final Environment environment) {
        final SauceResource resource = new SauceResource(
                configuration.getDefaultUserName(),
                configuration.getDefaultUserName()
        );

        final StupidHealthCheck healthCheck =
                new StupidHealthCheck();
        environment.healthChecks().register("stupid",healthCheck);
        environment.jersey().register(resource);
    }

}
