package baufest.devops.calculator;

import javax.validation.constraints.NotNull;

import io.dropwizard.Configuration;

import org.hibernate.validator.constraints.NotEmpty;

import com.fasterxml.jackson.annotation.JsonProperty;

public class calcConfiguration extends Configuration {
    @NotNull
    private int addend1;

    @NotNull
    private int addend2;

    @NotEmpty
    private String unit = "";

    @JsonProperty
    public int getAddend1() {
        return addend1;
    }

    @JsonProperty
    public int getAddend2() {
        return addend2;
    }

    @JsonProperty
    public void setAddend1(int addend1) {
        this.addend1 = addend1;
    }

    @JsonProperty
    public void setAddend2(int addend2) {
        this.addend2 = addend2;
    }

    @JsonProperty
    public String getUnit() {
        return unit;
    }

    @JsonProperty
    public void setUnit(String unit) {
        this.unit = unit;
    }
}
