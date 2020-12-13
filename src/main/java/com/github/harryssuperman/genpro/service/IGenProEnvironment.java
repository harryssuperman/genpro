package com.github.harryssuperman.genpro.service;

import java.util.List;

import com.github.harryssuperman.genpro.dtos.Environment;
import com.github.harryssuperman.genpro.parser.GenProParserValues;

public interface IGenProEnvironment {

    Environment addEnvironment(GenProParserValues genProParserValues);

    Environment createCommonEnvironment();

    List<Environment> getAllEnvironments();

    boolean deleteEnvironment(Environment environment);
}
