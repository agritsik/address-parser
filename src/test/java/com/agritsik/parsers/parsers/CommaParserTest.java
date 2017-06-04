package com.agritsik.parsers.parsers;

import com.agritsik.parsers.Address;
import org.junit.Assert;
import org.junit.Test;

public class CommaParserTest {

    @Test
    public void shouldParseIfCommaBeforeNumber() throws Exception {

        // arrange && act
        Address result = new CommaParser().parse("Calle Aduana, 29");

        // assert
        Assert.assertEquals("Calle Aduana", result.getName());
        Assert.assertEquals("29", result.getNumber());
    }

    @Test
    public void shouldParseIfCommaAfterNumber() throws Exception {

        // arrange && act
        Address result = new CommaParser().parse("4, rue de la revolution");

        // assert
        Assert.assertEquals("rue de la revolution", result.getName());
        Assert.assertEquals("4", result.getNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfNoComma() throws Exception {
        // arrange && act
        new CommaParser().parse("Calle Aduana 29");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMultipleCommas() throws Exception {
        // arrange && act
        new CommaParser().parse("Calle, Aduana, 29");
    }
}