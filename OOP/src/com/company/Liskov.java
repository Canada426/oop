package com.company;

public class Liskov implements Principle {
    @Override
    public boolean IsUsed() {
        System.out.println("    Implements contract");
        return true;
    }
}
