package hu.bme.mit.train.system;

import com.google.common.collect.HashBasedTable;
import com.google.common.collect.Table;

public class Tacho {

    Table<String, String, Integer> table;

    @Test
    public void test() {
     table =HashBasedTable.create();
     table.put("0.0.0", "0.0", 100);
     boolean b = table.contains("0.0.0","0.0.0");
     assertThat(b).isEqualTo(true);
    }

}
