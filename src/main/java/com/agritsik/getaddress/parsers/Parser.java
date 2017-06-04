package com.agritsik.getaddress.parsers;

import com.agritsik.getaddress.Address;

/**
 * Parses an address line to the Address object
 */
public interface Parser {
    Address parse(String address);
}
