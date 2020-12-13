package com.github.harryssuperman.genpro.parser;

import com.github.harryssuperman.genpro.enums.GenProMainOperation;
import com.github.harryssuperman.genpro.enums.GenProOperationObject;

public class GenProParserValues {

    private boolean parsed;
    private String[] parserArgs;
    private GenProMainOperation mainOperation;
    private GenProOperationObject operationObject;
    private GenProParserVariableValues genProParserVariableValues;

    public GenProParserValues(String... parserArgs) {
        this.parsed = false;
        this.parserArgs = parserArgs;
        this.mainOperation = GenProMainOperation.LIST;
        this.operationObject = GenProOperationObject.PROPERTY;
    }

    public boolean isParsed() {
        return parsed;
    }

    public void setParsed(boolean parsed) {
        this.parsed = parsed;
    }

    public String[] getParserArgs() {
        return parserArgs;
    }

    public void setParserArgs(String[] parserArgs) {
        this.parserArgs = parserArgs;
    }

    public GenProMainOperation getMainOperation() {
        return mainOperation;
    }

    public void setMainOperation(GenProMainOperation mainOperation) {
        this.mainOperation = mainOperation;
    }

    public GenProOperationObject getOperationObject() {
        return operationObject;
    }

    public void setOperationObject(GenProOperationObject operationObject) {
        this.operationObject = operationObject;
    }

    public GenProParserVariableValues getGenProParserVariableValues() {
        return genProParserVariableValues;
    }

    public void setGenProParserVariableValues(GenProParserVariableValues genProParserVariableValues) {
        this.genProParserVariableValues = genProParserVariableValues;
    }
}
