package com.agritsik.getaddress.parsers;

import com.agritsik.getaddress.Address;
import org.junit.Assert;
import org.junit.Test;

public class StartsWithParserTest {

    @Test
    public void shouldParseIfStartsWithNumber() throws Exception {

        // arrange && act
        Address result = new StartsWithParser().parse("200 Broadway Av");

        // assert
        Assert.assertEquals("Broadway Av", result.getName());
        Assert.assertEquals("200", result.getNumber());
    }

    @Test(expected = IllegalArgumentException.class)
    public void shouldParseIfEndsWithNumber() throws Exception {
        new StartsWithParser().parse("Broadway Av 200");
    }

}