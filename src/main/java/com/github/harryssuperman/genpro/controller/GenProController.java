package com.github.harryssuperman.genpro.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.github.harryssuperman.genpro.parser.GenProParser;

@Component
public class GenProController {

    @Autowired
    public GenProController(GenProParser genProParser) {
    }
}
