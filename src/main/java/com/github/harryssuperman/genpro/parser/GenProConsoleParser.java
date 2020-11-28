package com.github.harryssuperman.genpro.parser;

import org.springframework.stereotype.Component;

@Component
public class GenProConsoleParser implements GenProParser {

    @Override
    public GenProParserMapValues parse(String[] args) {
        return new GenProParserMapValues();
    }
}
