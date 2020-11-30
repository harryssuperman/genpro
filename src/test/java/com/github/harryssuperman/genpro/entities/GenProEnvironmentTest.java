package com.github.harryssuperman.genpro.entities;

import org.junit.jupiter.api.Test;

class GenProEnvironmentTest {

    @Test
    void testToString() {
        GenProEnvironment genProEnvironment = new GenProEnvironment("TestEnvironment");
        System.out.printf("result: " + genProEnvironment);
    }
}