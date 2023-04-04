package com.java.unittest;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTests {

    @Test
    @DisplayName("계산기 덧셈식 검증")
    public void Sum_of_two_numbers()
    {
        // arrange
        double first = 10;
        double second = 20;
        var calculator = new Calculator();

        // act
        double result = calculator.Sum(first, second);

        // assert
        Assertions.assertEquals(30, result);
    }

}