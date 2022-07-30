package org.example;

import org.example.columns.Data;
import org.example.filters.Filter;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class Table {

    String name;
    Map<String, Data> tableDefinition;

    List<List<Pair>> data;

    public Table(String name, Map<String, Data> tableDefinition){
        this.name = name;
        this.tableDefinition = tableDefinition;
        this.data = new ArrayList<>();
    }

    public void insert(List<Pair> record){

        for(Pair pair : record){
            this.tableDefinition.get(pair.key).validate(pair);
        }

        this.data.add(record);
    }

    public List<List<Pair>> filter(List<Filter> filters){

        List<List<Pair>> sol = new ArrayList<>();

        for(List<Pair> record : this.data){

            boolean allow = true;
            for(Filter filter : filters){
                if(!filter.check(record)){
                    allow = false;
                }
            }

            if(allow){
                sol.add(record); // immutable
            }
        }

        return sol;
    }

    public void print(){
        print(this.data);
    }

    public void print(List<List<Pair>> records){
        for(List<Pair> record : records){
            System.out.println(record);
        }
        System.out.println("--------------");
    }
}
