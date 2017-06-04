package com.agritsik.getaddress;

public class Address {

    private final String name;
    private final String number;

    public Address(String name, String number) {
        this.name = name;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getNumber() {
        return number;
    }
}
