package com.agritsik.parsers.parsers;

import com.agritsik.parsers.Address;

public interface Parser {
    Address parse(String address);
}
