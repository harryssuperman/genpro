package com.github.harryssuperman.genpro.service;

import java.nio.file.Path;
import java.util.List;
import java.util.Map;
import java.util.Properties;

import com.github.harryssuperman.genpro.dtos.Environment;

public interface IGenProProperty {
    List<Properties> getPropertyList(Environment environment);

    boolean loadPropertyFile(Path path, Environment environment);

    boolean addProperty(Properties properties, Environment environment);

    Map<Environment, List<Properties>> getAllProperties();

    boolean deleteAllProperties(Properties properties);

    boolean deleteProperty(Properties property, Environment environment);

}
