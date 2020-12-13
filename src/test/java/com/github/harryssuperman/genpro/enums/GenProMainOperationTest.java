package com.github.harryssuperman.genpro.enums;

import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

class GenProMainOperationTest {

    @Test
    void testGenProMainOperationAddToString() {
        assertTrue("ADD".equalsIgnoreCase(GenProMainOperation.ADD.toString()));
    }
}