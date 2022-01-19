package net.bdavies.fizzbuzz;

import lombok.extern.slf4j.Slf4j;

/**
 * @author ben.davies
 */
@Slf4j
public class FizzBuzz {
    public String getFizzBuzz(int number) {
        var str = "";
        if (isAMultipleOfThree(number))
            str += "Fizz";
        if (isAMultipleOfFive(number))
            str += "Buzz";

        return str.length() > 0 ? str : String.valueOf(number);
    }

    private boolean isAMultipleOfThree(int number) {
        return number % 3 == 0;
    }

    private boolean isAMultipleOfFive(int number) {
        return number % 5 == 0;
    }
}
