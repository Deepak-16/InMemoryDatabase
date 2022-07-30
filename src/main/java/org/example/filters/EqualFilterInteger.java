package org.example.filters;

import org.example.Pair;

import java.util.List;

public class EqualFilterInteger extends Filter {

    int val;

    public EqualFilterInteger(String columnName, int val){
        super(columnName);
        this.val = val;
    }

    @Override
    public boolean check(List<Pair> record) {
        for(Pair pair : record){
            if(pair.key.equals(key)){
                Integer curVal = (Integer)pair.value;
                return curVal!= null && curVal.equals(val);
            }
        }

        return false;
    }
}
