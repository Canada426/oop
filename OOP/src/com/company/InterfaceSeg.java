package com.company;

public class InterfaceSeg implements Principle {
    @Override
    public boolean IsUsed() {
        System.out.println("    Many client-specific interfaces are better than one general-purpose interface");
        return true;
    }
}