package net.bdavies.fizzbuzz;

import lombok.extern.slf4j.Slf4j;
import net.bdavies.fizzbuzz.FizzBuzz;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

/**
 * @author ben.davies
 */
@Slf4j
public class FizzBuzzTest {

    private FizzBuzz fizzBuzz;

    @BeforeEach
    void setUp() {
        fizzBuzz = new FizzBuzz();
    }

    @ParameterizedTest
    @ValueSource(ints = {3, 6, 9})
    void numberX_returns_Fizz(int number) {
        Assertions.assertEquals("Fizz", fizzBuzz.getFizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {5, 10, 20})
    void numberX_returns_Buzz(int number) {
        Assertions.assertEquals("Buzz", fizzBuzz.getFizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {15, 30, 45})
    void numberX_returns_FizzBuzz(int number) {
        Assertions.assertEquals("FizzBuzz", fizzBuzz.getFizzBuzz(number));
    }

    @ParameterizedTest
    @ValueSource(ints = {1, 2, 4, 7})
    void numberX_returns_X(int number) {
        Assertions.assertEquals(String.valueOf(number), fizzBuzz.getFizzBuzz(number));
    }
}
