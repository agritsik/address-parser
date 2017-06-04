package com.agritsik.parsers.parsers;

import com.agritsik.parsers.Address;
import org.junit.Assert;
import org.junit.Test;

public class EndsWithParserTest {
    @Test
    public void parse1() throws Exception {

        // arrange && act
        Address result = new EndsWithParser().parse("Auf der Vogelwiese 23 b");

        // assert
        Assert.assertEquals("Auf der Vogelwiese", result.getName());
        Assert.assertEquals("23 b", result.getNumber());

    }

    @Test
    public void parse2() throws Exception {

        // arrange && act
        Address result = new EndsWithParser().parse("Auf der Vogelwiese 23");

        // assert
        Assert.assertEquals("Auf der Vogelwiese", result.getName());
        Assert.assertEquals("23", result.getNumber());

    }

}