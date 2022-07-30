package org.example;

import org.example.columns.Data;

public class Pair {
    public String key;
    public Object value;

    public Pair(String key, Object value) {
        this.key = key;
        this.value = value;
    }

    @Override
    public String toString() {
        return "Pair{" +
                "key='" + key + '\'' +
                ", value=" + value +
                '}';
    }
}
