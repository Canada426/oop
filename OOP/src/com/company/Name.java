package com.company;

public class Name {
    public String ClassName(Object q){
        return q.getClass().toGenericString().split("\\.")[q.getClass().toGenericString().split("\\.").length - 1];
    }
}
