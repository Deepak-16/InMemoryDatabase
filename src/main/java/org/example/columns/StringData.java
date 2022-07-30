package org.example.columns;

public class StringData extends Data{

    public StringData() {
        this.addConstaints(new MaxLimitString());
    }
}
