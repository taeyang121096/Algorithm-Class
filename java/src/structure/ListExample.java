package structure;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class ListExample {

    public static void main(String[] args) {

        // 1. Initialize a list
        List<Integer> numbers = new ArrayList<>();
        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);
        numbers.add(5);

        // 2. Access elements
        System.out.println("First element: " + numbers.get(0));
        System.out.println("Second element: " + numbers.get(1));

        // 3. Modify elements
        numbers.set(2, 10);
        System.out.println("Modified third element: " + numbers.get(2));

        // 4. Iterate through the list
        System.out.print("List elements: ");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // 5. Find the size of the list
        System.out.println("Size of the list: " + numbers.size());

        // 6. Declare a list
        List<Integer> list = new ArrayList<>();
        for (int index : list) {
            System.out.print(list.get(index) + " ");
        }
        System.out.println();

        // 7. Insert an element at a specific position
        numbers.add(2, 20);
        System.out.println("List after insertion: " + numbers);

        // 8. Delete an element from a specific position
        numbers.remove(3);
        System.out.println("List after deletion: " + numbers);

        // LinkedList operations
        List<Integer> linkedNumbers = new LinkedList<>();
        linkedNumbers.add(1);
        linkedNumbers.add(2);
        linkedNumbers.add(3);
        linkedNumbers.add(4);
        linkedNumbers.add(5);

        // Access elements
        System.out.println("First element (LinkedList): " + linkedNumbers.get(0));
        System.out.println("Second element (LinkedList): " + linkedNumbers.get(1));

        // Modify elements
        linkedNumbers.set(2, 10);
        System.out.println("Modified third element (LinkedList): " + linkedNumbers.get(2));

        // Iterate through the list
        System.out.print("LinkedList elements: ");
        for (int number : linkedNumbers) {
            System.out.print(number + " ");
        }
        System.out.println();

        // Find the size of the list
        System.out.println("Size of the LinkedList: " + linkedNumbers.size());

        // Insert an element at a specific position
        linkedNumbers.add(2, 20);
        System.out.println("LinkedList after insertion: " + linkedNumbers);

        // Delete an element from a specific position
        linkedNumbers.remove(3);
        System.out.println("LinkedList after deletion: " + linkedNumbers);

    }
}
