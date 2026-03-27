package collection;

import java.util.*;

public class map {
    public static void main(String[] args) {

        // Create Map
        HashMap<Integer, String> m = new HashMap<>();

        // 🔹 1. Insertion
        m.put(101, "Keshav");
        m.put(102, "Aman");
        m.put(103, "Rohit");
        m.put(104, "Sita");

        System.out.println("After Insertion: " + m);

        // 🔹 2. Searching
        int key = 102;
        if(m.containsKey(key)) {
            System.out.println("Key " + key + " found with value: " + m.get(key));
        } else {
            System.out.println("Key not found");
        }

        // 🔹 3. Deletion
        m.remove(103);
        System.out.println("After Deletion: " + m);

        // 🔹 4. Update
        m.put(104, "Gita");  // updates value of key 104
        System.out.println("After Update: " + m);

        // 🔹 5. Traversal
        System.out.println("Traversal:");
        for(Map.Entry<Integer, String> entry : m.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue());
        }
    }
}