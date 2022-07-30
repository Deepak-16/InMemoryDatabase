package org.example.columns;

import org.example.Pair;

public class MaxLimitString implements Constraint{
    @Override
    public void validate(Pair pair) {
        String val = (String) pair.value;
        if(val != null && val.length()>20){
            throw new IllegalArgumentException("String should be less than 20 chars!");
        }
    }
}
