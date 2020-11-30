package com.github.harryssuperman.genpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.harryssuperman.genpro.parser.GenProParser;
import com.github.harryssuperman.genpro.parser.GenProParserValues;
import com.github.harryssuperman.genpro.service.GenProService;

@Component
public class GenProController {

    private GenProParser genProParser;
    private GenProService genProService;

    @Autowired
    public GenProController(GenProParser genProParser, GenProService genProService) {
        this.genProParser = genProParser;
        this.genProService = genProService;
    }

    public boolean isGenProCallExecuted(String[] args) {
        final GenProParserValues genProParserValues = genProParser.parse(args);
        return genProParserValues.isParsed() ? genProService.executedGenProCall(genProParserValues) : false;
    }
}
