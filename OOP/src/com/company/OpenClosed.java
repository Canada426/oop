package com.company;

public class OpenClosed implements Principle{
    @Override
    public boolean IsUsed() {
        System.out.println("    Open for extension, but closed for modification");
        return true;
    }
}
