package collection;

import java.util.*;

public class sortedset {
    public static void main(String[] args) {

        // Create SortedSet (TreeSet)
        TreeSet<Integer> s = new TreeSet<>();

        // 🔹 1. Insertion
        s.add(40);
        s.add(10);
        s.add(30);
        s.add(20);

        System.out.println("After Insertion (Sorted): " + s);

        // 🔹 2. Searching
        int key = 20;
        if(s.contains(key)) {
            System.out.println("Element " + key + " found");
        } else {
            System.out.println("Element not found");
        }

        // 🔹 3. Deletion
        s.remove(30);
        System.out.println("After Deletion: " + s);

        // 🔹 4. Update (remove + add)
        if(s.contains(40)) {
            s.remove(40);
            s.add(50);
        }
        System.out.println("After Update (40 -> 50): " + s);

        // 🔹 5. Traversal
        System.out.println("Traversal:");
        for(int x : s) {
            System.out.print(x + " ");
        }
    }
}