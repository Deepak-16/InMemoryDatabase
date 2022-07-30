package org.example;

import org.example.columns.*;
import org.example.filters.EqualFilterInteger;
import org.example.filters.EqualFilterString;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

        Database db = new Database();

        String s = "asd.sdf";
        String[] arr = s.split("\\.");
        for(String cur : arr){
            System.out.println(cur);
        }


        Map<String, Data> table1 = new HashMap<>();
        table1.put("col1", new IntegerData());
        table1.put("col2", new StringData());

        StringData col3 = new StringData();
        col3.addConstaints(new RequiredConstraint());
        // col3.addConstaints(new MinLimitInteger());
        table1.put("col3", col3);



        Table table = new Table("table1", table1);
        db.createTable(table);

        List<Pair> record1 = Arrays.asList(new Pair("col1", 1), new Pair("col2", "test1"));
        List<Pair> record2 = Arrays.asList(new Pair("col1", 2), new Pair("col2", "test1"));
        List<Pair> record3 = Arrays.asList(new Pair("col1", 3), new Pair("col2", "test3"), new Pair("col3", "test33"));
        // List<Pair> record4 = Arrays.asList(new Pair("col1", 4), new Pair("col3", null));

        table.insert(record1);
        table.insert(record2);
        table.insert(record3);
        // table.insert(record4);

        table.print(table.filter(Arrays.asList(new EqualFilterInteger("col1", 1))));

        table.print(table.filter(Arrays.asList(new EqualFilterString("col2", "test1"), new EqualFilterInteger("col1", 2))));

        table.print();

    }
}