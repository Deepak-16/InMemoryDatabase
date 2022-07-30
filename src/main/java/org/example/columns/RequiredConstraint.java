package org.example.columns;

import org.example.Pair;

public class RequiredConstraint implements Constraint{
    @Override
    public void validate(Pair pair) {
        if(pair.value == null){
            throw new IllegalArgumentException("Value cannot be null!");
        }
    }
}
