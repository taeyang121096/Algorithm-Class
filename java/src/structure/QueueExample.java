package structure;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample {
    public static void main(String[] args) {
        // 1. Initialize a queue
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(1);
        queue.offer(2);
        queue.offer(3);
        queue.offer(4);
        queue.offer(5);

        // 2. Access elements
        System.out.println("Front element: " + queue.peek());

        // 3. Modify elements
        queue.poll();
        System.out.println("Front element after dequeue: " + queue.peek());


        System.out.println();

        // 5. Find the size of the queue
        System.out.println("Size of the queue: " + queue.size());

        Queue<Integer> q = new LinkedList<>();
        q.offer(1);
        q.offer(2);
        q.offer(3);
        q.offer(4);
        q.offer(5);

        // 4. Iterate through the queue
        for (int element : q) {
            System.out.print(element + " ");
        }
    }
}
