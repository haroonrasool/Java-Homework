package HashMap;

import java.util.HashMap;

public class MyHashMap {
    public static void main(String[] args) {

        // Create a HashMap object called hashMap
        HashMap<String, String> names = new HashMap<String, String>();

        // Add keys and values (Country, City)
        names.put("England", "London");
        names.put("Germany", "Berlin");
        names.put("Norway", "Oslo");
        names.put("USA", "Washington DC");

        // Access an item
        System.out.println(names.get("England"));

        // Loop through the items of a HashMap with a for-each loop.
        // Use the keySet() method if you only want the keys, and
        // use the values() method if you only want the values

        // Print keys only
        for (String i : names.keySet()) {
            System.out.println(i);
        }

        // Print values only
        for (String i : names.values()) {
            System.out.println(i);
        }

        // Print both keys and values
        for (String i : names.keySet()) {
            System.out.println(i + ", " + names.get(i));
        }
    }
}
