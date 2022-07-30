package org.example.filters;

import org.example.Pair;
import org.example.columns.Data;

import java.util.List;

public abstract class Filter {

    String key;

    public Filter(String key) {
        this.key = key;
    }

    public abstract boolean check(List<Pair> record);

}
