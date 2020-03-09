package hu.bme.mit.train.system;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Tacho {

    public Table<String, String, Integer> table;


    public void testsetup() {
     table =HashBasedTable.create();
     table.put("0.0.0", "0.0", 100);
    }

}
