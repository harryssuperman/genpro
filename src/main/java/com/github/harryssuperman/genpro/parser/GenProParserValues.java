package com.github.harryssuperman.genpro.parser;

import com.github.harryssuperman.genpro.enums.GenProMainOperation;

public class GenProParserValues {

    private boolean parsed;
    private String[] parserArgs;
    private GenProMainOperation mainOperation;

    public GenProParserValues() {
        this.parsed = false;
    }

    public GenProParserValues(boolean parserResult, String[] parserArgs, GenProMainOperation mainOperation) {
        this.parsed = parserResult;
        this.parserArgs = parserArgs;
        this.mainOperation = mainOperation;
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
}
