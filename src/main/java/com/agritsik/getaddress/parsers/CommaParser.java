package com.agritsik.getaddress.parsers;

import com.agritsik.getaddress.Address;
import org.apache.commons.lang3.math.NumberUtils;

public class CommaParser implements Parser {

    public Address parse(String address) {
        String[] split = address.split(",");
        if (split.length != 2) {
            throw new IllegalArgumentException("Address should contain a `comma` in the middle");
        }

        String beforeComma = split[0].trim();
        String afterComma = split[1].trim();

        if (NumberUtils.isDigits(beforeComma)) {
            return new Address(afterComma, beforeComma);
        } else if (NumberUtils.isDigits(afterComma)) {
            return new Address(beforeComma, afterComma);
        } else {
            throw new IllegalArgumentException("Address should contain a number");
        }

    }

}
