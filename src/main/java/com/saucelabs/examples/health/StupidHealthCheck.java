package com.saucelabs.examples.health;

import com.codahale.metrics.health.HealthCheck;

public class StupidHealthCheck extends HealthCheck {

    @Override
    protected Result check() throws Exception {
        return Result.healthy();
    }
}
