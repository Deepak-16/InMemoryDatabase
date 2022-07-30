package org.example.columns;

import org.example.Pair;

import java.util.ArrayList;
import java.util.List;

public abstract class Data {
    List<Constraint> constraints;

    public Data() {
        this.constraints = new ArrayList<>();
    }

    public void addConstaints(Constraint constraint){
        this.constraints.add(constraint);
    }

    public void validate(Pair pair) {
        for(Constraint constraint : this.constraints){
            constraint.validate(pair);
        }
    }
}
