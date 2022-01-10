package com.reinel.javatest.util;

import org.junit.Test;

import static com.reinel.javatest.util.PasswordUtil.SecurityLevel.*;
import static org.junit.Assert.*;

public class PasswordUtilTest {

    @Test
    public void weak_when_has_less_than_8_letters() {
        assertEquals(WEAK,PasswordUtil.assesPassword("12faf!") );
    }



    @Test
    public void weak_when_has_only_letters() {
        assertEquals(WEAK,PasswordUtil.assesPassword("abdgdcg") );
    }


    @Test
    public void medium_when_has_letters_and_numbres() {
        assertEquals(MEDIUM,PasswordUtil.assesPassword("abdgdcg124") );
    }


    @Test
    public void strong_when_has_letters_numbres_symbols() {
        assertEquals(STRONG,PasswordUtil.assesPassword("abdgdcg124!") );
    }
}