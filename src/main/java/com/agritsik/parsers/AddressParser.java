package com.agritsik.parsers;

import com.agritsik.parsers.parsers.*;
import org.apache.commons.lang3.math.NumberUtils;

public class AddressParser {

    /**
     * Parses address line
     * @param address address line
     * @return Address object
     */
    Address parse(String address){
        return createParser(address).parse(address);
    }

    /**
     * Creates a concrete parser according to the priority
     * @param address address line
     * @return Address object
     */
    Parser createParser(String address) {
        if (address.contains(",")) {
            return new CommaParser();
        } else if (address.contains(" No ")) {
            return new NoParser();
        } else if (NumberUtils.isDigits(address.split(" ")[0])){
            return new StartsWithParser();
        } else {
            return new EndsWithParser();
        }
    }

}
