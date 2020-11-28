package com.github.harryssuperman.genpro.parser;

import org.springframework.stereotype.Component;

@Component
public interface GenProParser {
    GenProParserMapValues parse(String[] args);
}
