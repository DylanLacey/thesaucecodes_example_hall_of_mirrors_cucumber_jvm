package com.saucelabs.examples;

import io.dropwizard.Configuration;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.constraints.NotEmpty;

public class DropwizardCukeJVMExampleConfiguration extends Configuration {
    @NotEmpty
    private String defaultUserName;

    @NotEmpty
    private String defaultUserSauce;

    @JsonProperty
    public String getDefaultUserName() {
        return defaultUserName;
    }

    @JsonProperty
    public void setDefaultUserName(String dun){
        this.defaultUserName = dun;
    }

    @JsonProperty
    public String getDefaultUserSauce() {
        return defaultUserSauce;
    }

    @JsonProperty
    public void setDefaultUserSauce(String dus){
        this.defaultUserSauce = dus;
    }
}
