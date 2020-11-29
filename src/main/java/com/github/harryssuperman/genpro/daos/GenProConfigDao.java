package com.github.harryssuperman.genpro.daos;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.github.harryssuperman.genpro.entities.GenProConfig;

@Repository
public class GenProConfigDao {

    @PersistenceContext
    private EntityManager entityManager;

    public GenProConfig getGenProConfigById(long id) {
        return entityManager.find(GenProConfig.class, id);
    }
}
