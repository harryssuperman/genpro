package com.github.harryssuperman.genpro.parser;

import org.springframework.stereotype.Component;

@Component
public class GenProConsoleParser implements GenProParser {

    @Override
    public GenProParserValues parse(String[] args) {
        final GenProParserValues genProParserMapValues = new GenProParserValues();
        if (parseMainOperation(genProParserMapValues, args)) {
            if (parseOperationObjects(genProParserMapValues, args)) {
                parseRestValues(genProParserMapValues, args);
            }
        }
        return new GenProParserValues();
    }
}
