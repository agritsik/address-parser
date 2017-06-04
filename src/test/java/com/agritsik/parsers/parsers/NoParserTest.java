package com.agritsik.parsers.parsers;

import com.agritsik.parsers.Address;
import org.junit.Assert;
import org.junit.Test;

public class NoParserTest {

    @Test
    public void shouldParseIfNumberPrefix() throws Exception {

        // arrange && act
        Address result = new NoParser().parse("Calle 39 No 1540");

        // assert
        Assert.assertEquals("Calle 39", result.getName());
        Assert.assertEquals("No 1540", result.getNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfNoNumberPrefix() throws Exception {
        // arrange && act
        new NoParser().parse("Calle 39 Nonono 1540");
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldThrowExceptionIfMultipleNumberPrefixes() throws Exception {
        // arrange && act
        new NoParser().parse("Calle No 39 No 1540");
    }
}