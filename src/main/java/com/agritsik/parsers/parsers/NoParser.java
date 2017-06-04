package com.agritsik.parsers.parsers;

import com.agritsik.parsers.Address;

public class NoParser implements Parser {

    public Address parse(String address) {
        String[] split = address.split(" No ");
        if (split.length != 2) {
            throw new IllegalArgumentException("Address should contain `No` in the middle");
        }

        return new Address(split[0].trim(), "No " + split[1].trim());
    }

}
