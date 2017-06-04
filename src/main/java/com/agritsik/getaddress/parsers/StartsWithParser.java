package com.agritsik.getaddress.parsers;

import com.agritsik.getaddress.Address;
import org.apache.commons.lang3.math.NumberUtils;

import java.util.Arrays;
import java.util.stream.Collectors;

public class StartsWithParser implements Parser {
    public Address parse(String address) {

        String[] split = address.split(" ");

        if (!NumberUtils.isDigits(split[0]))
            throw new IllegalArgumentException("Address should start with number");

        String street = Arrays.stream(split).skip(1).collect(Collectors.joining(" "));
        return new Address(street, split[0]);
    }
}
