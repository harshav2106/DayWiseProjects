package com.wipro.test;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class ParameterizedTestDemo {

	@ParameterizedTest
    @ValueSource(strings = {"hello", "harsha"})
    void Test(String input) {
        assertTrue(input.equals(input.toLowerCase()));
    }

}
