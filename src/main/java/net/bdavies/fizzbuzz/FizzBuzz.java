package net.bdavies.fizzbuzz;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ben.davies
 */
@Slf4j
public class FizzBuzz {
    public String getFizzBuzz(int number) {
        if (number % 3 == 0 && number % 5 == 0)
            return "FizzBuzz";
        if (number % 5 == 0)
            return "Buzz";
        if (number % 3 == 0)
            return "Fizz";

        return String.valueOf(number);
    }
}
