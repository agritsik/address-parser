package com.agritsik.getaddress;

import com.agritsik.getaddress.parsers.*;
import org.apache.commons.lang3.math.NumberUtils;

public class AddressParser {

    /**
     * Parses an address line. Supports different strategies.
     *
     * @param address an address line
     * @return an Address object
     */
    Address parse(String address){
        return createParser(address).parse(address);
    }

    /**
     * Creates a concrete parser according to the rules and priority
     *
     * @param address an address line
     * @return an Address object
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
