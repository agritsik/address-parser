package com.agritsik.getaddress.parsers;

import com.agritsik.getaddress.Address;
import org.apache.commons.lang3.math.NumberUtils;

public class EndsWithParser implements Parser {
    @Override
    public Address parse(String address) {

        String[] split = address.split(" ");

        boolean found = false;
        StringBuilder street = new StringBuilder();
        StringBuilder number = new StringBuilder();
        for (String s : split) {
            if (NumberUtils.isDigits(s) || Character.isDigit(s.charAt(0))) found = true;

            if (found) {
                number.append(s).append(" ");
            } else {
                street.append(s).append(" ");
            }
        }

        return new Address(street.toString().trim(), number.toString().trim());
    }
}
