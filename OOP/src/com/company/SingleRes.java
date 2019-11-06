package com.company;

public class SingleRes implements Principle {
    @Override
    public boolean IsUsed() {
        System.out.println("    A class should only have a single responsibility");
        return true;
    }
}
