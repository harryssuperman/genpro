package com.github.harryssuperman.genpro.parser;

public class GenProParserVariableValues {
    private String environment;
    private String propertyName;
    private String propertyValue;
    private String filePath;

    public GenProParserVariableValues() {
        this.environment = null;
        this.propertyName = null;
        this.propertyValue = null;
        this.filePath = null;
    }

    public String getEnvironment() {
        return environment;
    }

    public void setEnvironment(String environment) {
        this.environment = environment;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyValue() {
        return propertyValue;
    }

    public void setPropertyValue(String propertyValue) {
        this.propertyValue = propertyValue;
    }

    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }
}
