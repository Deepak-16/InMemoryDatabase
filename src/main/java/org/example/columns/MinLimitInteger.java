package org.example.columns;

import org.example.Pair;

public class MinLimitInteger implements Constraint {

    @Override
    public void validate(Pair pair) {
        Integer val = (Integer) pair.value;
        if(val != null && val<-1024){
            throw new IllegalArgumentException("Integer should be greater than -1024");
        }
    }
}
