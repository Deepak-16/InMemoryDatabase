package org.example;

import java.util.HashMap;
import java.util.Map;

public class Database {
    Map<String, Table> database;

    public Database(){
        this.database = new HashMap<>();
    }

    public void createTable(Table table) {
        database.put(table.name, table);
    }

    public void deleteTable(Table table){
        database.remove(table.name);
    }
}
