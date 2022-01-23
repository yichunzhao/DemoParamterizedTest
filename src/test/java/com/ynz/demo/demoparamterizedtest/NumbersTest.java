package com.ynz.demo.demoparamterizedtest;


import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class NumbersTest {

    @ParameterizedTest
    @ValueSource(ints = {1, 3, 5, -3, 15, Integer.MAX_VALUE})
    void shouldBeAbleToIdentifyOddNumbers(int number) {
        assertTrue(Numbers.isOdd(number));
    }
}