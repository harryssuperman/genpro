package com.github.harryssuperman.genpro.service;

import java.nio.file.Path;
import java.util.Collection;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.github.harryssuperman.genpro.daos.GenProDao;
import com.github.harryssuperman.genpro.dtos.Environment;
import com.github.harryssuperman.genpro.parser.GenProParserValues;

@Service
public class GenProService implements IGenProFiles, IGenProProperty, IGenProEnvironment {

    private GenProDao genProConfigDao;

    @Autowired
    public GenProService(GenProDao genProConfigDao) {
        this.genProConfigDao = genProConfigDao;
    }

    public boolean executeGenProCall(GenProParserValues genProParserValues) {
        //TODO implement
        return false;
    }

    @Override
    public Environment addEnvironment(GenProParserValues genProParserValues) {
        return null;
    }

    @Override
    public Environment createCommonEnvironment() {
        return null;
    }

    @Override
    public List<Environment> getAllEnvironments() {
        return null;
    }

    @Override
    public boolean deleteEnvironment(Environment environment) {
        return false;
    }

    @Override
    public Collection<Path> generatePropertyFiles() {
        return null;
    }

    @Override
    public List<Properties> getPropertyList(Environment environment) {
        return null;
    }

    @Override
    public boolean loadPropertyFile(Path path, Environment environment) {
        return false;
    }

    @Override
    public boolean addProperty(Properties properties, Environment environment) {
        return false;
    }

    @Override
    public Map<Environment, List<Properties>> getAllProperties() {
        return null;
    }

    @Override
    public boolean deleteAllProperties(Properties properties) {
        return false;
    }

    @Override
    public boolean deleteProperty(Properties property, Environment environment) {
        return false;
    }
}
