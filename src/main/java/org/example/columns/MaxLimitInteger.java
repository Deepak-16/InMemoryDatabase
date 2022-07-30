package org.example.columns;

import org.example.Pair;

public class MaxLimitInteger implements Constraint{
    public void validate(Pair pair) {
        Integer val = (Integer) pair.value;
        if(val != null && val>1024){
            throw new IllegalArgumentException("Integer should be less than 1024");
        }
    }
}
