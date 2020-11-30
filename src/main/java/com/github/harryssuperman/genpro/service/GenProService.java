package com.github.harryssuperman.genpro.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.harryssuperman.genpro.daos.GenProDao;
import com.github.harryssuperman.genpro.parser.GenProParserValues;

@Service
public class GenProService {

    private GenProDao genProConfigDao;

    @Autowired
    public GenProService(GenProDao genProConfigDao) {
        this.genProConfigDao = genProConfigDao;
    }

    public boolean executedGenProCall(GenProParserValues genProParserValues) {
    }
}
