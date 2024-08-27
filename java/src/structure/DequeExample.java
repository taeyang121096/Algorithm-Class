package structure;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class DequeExample {

    public static void main(String[] args) {

        // 1. Initialize a deque
        Deque<Integer> deque = new ArrayDeque<>();
        deque.offerFirst(1);
        deque.offerFirst(2);
        deque.offerLast(3);
        deque.offerLast(4);
        deque.offerLast(5);

        // 2. Access elements
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());

        // 3. Modify elements
        deque.pollFirst();
        System.out.println("First element after poll: " + deque.peekFirst());
        deque.pollLast();
        System.out.println("Last element after poll: " + deque.peekLast());

        // 4. Iterate through the deque
        System.out.print("Deque elements: ");
        for (int element : deque) {
            System.out.print(element + " ");
        }
        System.out.println();

        Iterator<Integer> iterator = deque.iterator();
        System.out.print("Deque Iterator: ");
        while(iterator.hasNext()){
            System.out.print(iterator.next() + " ");
        }

        System.out.println();

        Iterator<Integer> descIterator = deque.descendingIterator();
        System.out.print("Deque descIterator: ");
        while(descIterator.hasNext()){
            System.out.print(descIterator.next() + " ");
        }

        System.out.println();

        // 5. Find the size of the deque
        System.out.println("Size of the deque: " + deque.size());

    }
}
