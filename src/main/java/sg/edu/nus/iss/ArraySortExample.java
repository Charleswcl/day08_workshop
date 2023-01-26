package sg.edu.nus.iss;

import java.util.Arrays;

public class ArraySortExample {

    public void example() {

        // custom array with data (name)
        String name[] = { "darry1", "elain", "james", "zoanne", "chris", "mark", "sophia", "asher", "brandon", "helen",
                "daniel", "marcus" };

        // print out unsorted array
        System.out.println("Unsorted arr: " + Arrays.toString(name));
        
        // sort the array in ascending order
        Arrays.sort(name); 
    }
}
