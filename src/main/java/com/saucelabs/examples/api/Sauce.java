package com.saucelabs.examples.api;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Sauce {
    private long id;

    private String displayName;
    private String userName;

    public Sauce(long id, String name, String userName) {
        this.id = id;
        this.displayName = name;
        this.userName = userName;
    }

    @JsonProperty
    public String getName() {
        return displayName;
    }

    @JsonProperty
    public String getUserName() {
        return userName;
    }

    @JsonProperty
    public long getId() {
        return id;
    }
}
