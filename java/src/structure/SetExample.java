package structure;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

    public static void main(String[] args) {

            // 1. Initialize a set
            Set<Integer> set = new HashSet<>();
            set.add(1);
            set.add(2);
            set.add(3);
            set.add(4);
            set.add(5);

            // 2. Access elements
            System.out.println("Set: " + set);

            // 3. Modify elements
            set.remove(4);
            System.out.println("Set after removing 4: " + set);

            // 4. Iterate through the set
            System.out.print("Set elements: ");
            for (int element : set) {
                System.out.print(element + " ");
            }
            System.out.println();

            // 5. Find the size of the set
            System.out.println("Size of the set: " + set.size());

            // 6. Check if the set contains an element
            System.out.println("Set contains 3: " + set.contains(3));

            // 7. Clear the set
            set.clear();
            System.out.println("Set is empty: " + set.isEmpty());
    }
}
