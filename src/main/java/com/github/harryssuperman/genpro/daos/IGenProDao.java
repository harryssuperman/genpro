package com.github.harryssuperman.genpro.daos;

import com.github.harryssuperman.genpro.entities.GenProEnvironment;
import com.github.harryssuperman.genpro.parser.GenProParserValues;

public interface IGenProDao {
    GenProEnvironment addEnvironment(GenProParserValues genProParserValues);
}
