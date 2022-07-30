package org.example.filters;

import org.example.Pair;

import java.util.List;

public class EqualFilterString extends Filter {
    String val; // value to be matched

    public EqualFilterString(String columnName, String val) {
        super(columnName);
        this.val = val;
    }

    @Override
    public boolean check(List<Pair> record) {

        for(Pair pair : record){
            if(pair.key.equals(key)){
                String curVal = (String)pair.value;
                return curVal!= null && curVal.equals(val);
            }
        }

        return false;
    }
}
