package com.reinel.javatest.fizzBuzz;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class FizzBuzzShould {

    @Test
    public void return_fizz_when_number_is_divisible_by_3() {
        Assert.assertEquals("fizz",FizzBuzz.fizzbuzz(3));
    }

    @Test
    public void return_buzz_when_number_is_divisible_by_5() {
        Assert.assertEquals("buzz",FizzBuzz.fizzbuzz(5));
    }

    @Test
    public void return_fizzbuzz_when_number_is_divisible_by_5_and_3() {
        Assert.assertEquals("fizzbuzz",FizzBuzz.fizzbuzz(15));
    }


    @Test
    public void return_the_same_number_when_number_is_not_divisible_by_3_or_5() {
        Assert.assertEquals("17",FizzBuzz.fizzbuzz(17));
    }
}