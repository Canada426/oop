package com.company;

public class DependencyInv  implements Principle {
    @Override
    public boolean IsUsed() {
        System.out.println("    Depend upon abstractions, not concretions");
        return true;
    }
}
