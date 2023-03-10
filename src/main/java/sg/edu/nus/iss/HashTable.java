package sg.edu.nus.iss;

import java.io.Console;
import java.util.Hashtable;
import java.util.Map;

public class HashTable {
    public void exmaple() {
        Map<String, Integer> phones = new Hashtable<>();

        phones.put("iPhone,", 10);
        phones.put("Hwawei", 2);
        phones.put("Samsung", 3);
        phones.put("Oppo", 4);

        System.out.println("Total phone types: " + phones.size());

        for (String key : phones.keySet()) {
            System.out.println(key + " - " + phones.get(key));
        }

        String searchString = "";
        Console con = System.console();

        while (!searchString.equals("quit")) {
            searchString = con.readLine("Enter searchString: ");

            if (phones.containsKey(searchString)) {
                System.out.println(searchString + " - " + phones.get(searchString));
            } else {
                System.out.println("Items not found.");
            }

        }
        // remove all the map data
        phones.clear();

        // check the size of map after clear()
        System.out.println("Total phone types: " + phones.size());
    }
}
