package com.github.harryssuperman.genpro.entities;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

@Entity
public class GenProConfig {
    private Long id;
    private String param;
    private String value;

    public GenProConfig(String param, String value) {
        this.id = getId();
        this.param = param;
        this.value = value;
    }

    public GenProConfig(long id) {
        this.id = id;
    }

    public GenProConfig() {

    }

    public void setId(Long id) {
        this.id = id;
    }

    @Id
    @SequenceGenerator(name = "GenProConfigSequence")
    public Long getId() {
        return id;
    }

    public String getParam() {
        return param;
    }

    public void setParam(String param) {
        this.param = param;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }
}
