package com.agritsik.parsers;

import org.junit.Assert;
import org.junit.Test;

public class AddressParserIntegrationTest {


    @Test
    public void parse1a() throws Exception {
        // arrange && act
        Address result = new AddressParser().parse("Winterallee 3");
        // assert
        Assert.assertEquals("Winterallee", result.getName());
        Assert.assertEquals("3", result.getNumber());
    }

    @Test
    public void parse1b() throws Exception {
        // arrange && act
        Address result = new AddressParser().parse("Musterstrasse 45");
        // assert
        Assert.assertEquals("Musterstrasse", result.getName());
        Assert.assertEquals("45", result.getNumber());
    }

    @Test
    public void parse1c() throws Exception {
        // arrange && act
        Address result = new AddressParser().parse("Blaufeldweg 123B");
        // assert
        Assert.assertEquals("Blaufeldweg", result.getName());
        Assert.assertEquals("123B", result.getNumber());
    }

    @Test
    public void parse2a() throws Exception {
        // arrange && act
        Address result = new AddressParser().parse("Am Bächle 23");
        // assert
        Assert.assertEquals("Am Bächle", result.getName());
        Assert.assertEquals("23", result.getNumber());
    }

    @Test
    public void parse2b() throws Exception {
        // arrange && act
        Address result = new AddressParser().parse("Auf der Vogelwiese 23 b");
        // assert
        Assert.assertEquals("Auf der Vogelwiese", result.getName());
        Assert.assertEquals("23 b", result.getNumber());
    }

    @Test
    public void parse3a() throws Exception {
        // arrange && act
        Address result = new AddressParser().parse("4, rue de la revolution");
        // assert
        Assert.assertEquals("rue de la revolution", result.getName());
        Assert.assertEquals("4", result.getNumber());
    }

    @Test
    public void parse3b() throws Exception {
        // arrange && act
        Address result = new AddressParser().parse("200 Broadway Av");
        // assert
        Assert.assertEquals("Broadway Av", result.getName());
        Assert.assertEquals("200", result.getNumber());
    }

    @Test
    public void parse3c() throws Exception {
        // arrange && act
        Address result = new AddressParser().parse("Calle Aduana, 29");
        // assert
        Assert.assertEquals("Calle Aduana", result.getName());
        Assert.assertEquals("29", result.getNumber());
    }

    @Test
    public void parse3d() throws Exception {
        // arrange && act
        Address result = new AddressParser().parse("Calle 39 No 1540");
        // assert
        Assert.assertEquals("Calle 39", result.getName());
        Assert.assertEquals("No 1540", result.getNumber());
    }

}