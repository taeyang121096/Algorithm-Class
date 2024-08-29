package structure;

import java.util.HashMap;
import java.util.Map;

public class MapExample {

    public static void main(String[] args) {

        // 1. Initialize a map
        Map<String, Integer> map = new HashMap<>();

        // 2. Insert a new key-value pair
        map.put("a", 1);
        map.put("b", 2);
        map.put("c", 3);

        // 3. Access elements
        System.out.println("Value of key 'a': " + map.get("a"));

        // 4. Modify elements
        map.put("a", 5);
        System.out.println("Value of key 'a' after modification: " + map.get("a"));

        // 5. Find the size of the map
        System.out.println("Size of the map: " + map.size());

        // 6. Iterate through the map
        System.out.print("Map elements: ");
        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            System.out.print(entry.getKey() + "-" + entry.getValue() + " ");
        }

        // 7. Check if the map contains a key
        System.out.println("\nMap contains key 'b': " + map.containsKey("b"));

        // 8. Remove a key-value pair
        map.remove("b");

        // 9. Clear the map
        map.clear();

    }
}
