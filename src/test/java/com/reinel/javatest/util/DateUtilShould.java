package com.reinel.javatest.util;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class DateUtilShould {

    @Test
    public void return_true_when_year_is_divisible_by_400() {
        Assert.assertTrue(DateUtil.isLeapYear(2000));
    }

    @Test
    public void return_false_when_year_is_divisible_by_100_but_not_for_400() {
        Assert.assertFalse(DateUtil.isLeapYear(1900));
    }

    @Test
    public void return_true_when_year_is_divisible_by_4() {
        Assert.assertTrue(DateUtil.isLeapYear(2012));
    }


    @Test
    public void return_false_when_year_is_not_divisible_by_4() {
        Assert.assertFalse(DateUtil.isLeapYear(2019));
    }
}