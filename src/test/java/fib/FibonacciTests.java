package fib;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;


import static org.junit.jupiter.api.Assertions.*;


public class FibonacciTests {

    @ParameterizedTest
    @CsvSource({"0,0", "1,1"})
    public void firstTwoNumbersAreSameIndex(int index, int expected) {
        assertEquals(expected, new Fibonacci().getNumber(index));
    }
}
