package sg.edu.nus.iss;

import java.util.Enumeration;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapExample {
    public void exmaple() {
        Map<String, Integer> laptops = new ConcurrentHashMap<>();
        laptops.put("Acer", 5);
        laptops.put("Asus", 10);
        laptops.put("Lenova", 6);
        laptops.put("Hp", 3);
        laptops.put("Apple", 15);

        // get the total size of the map objects.
        System.out.println("Total laptops: " + laptops.size());

        // iterate through the Map (laptops), use keySet method
        for (String key : laptops.keySet()) {
            System.out.println(key + " - " + laptops.get(key));
        }

        String searchString = "Asus";
        if (laptops.containsKey(searchString)) {
            System.out.println(searchString + " - " + laptops.get(searchString));
        }

        Enumeration<Integer> elems = ((ConcurrentHashMap<String, Integer>) laptops).elements();
        while(elems.hasMoreElements()) {
            System.out.println(elems.nextElement());
        }

        Integer retValue = laptops.putIfAbsent("Apple", 25);
        if (retValue != null) {
            System.out.println("Item found." + retValue);
        }
    }

    
    
}
