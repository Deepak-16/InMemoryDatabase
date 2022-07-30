package org.example.columns;

import org.example.Pair;

import java.util.ArrayList;
import java.util.List;

public class IntegerData extends Data{

    public IntegerData() {
        this.addConstaints(new MaxLimitInteger());
        this.addConstaints(new MinLimitInteger());
    }
}
