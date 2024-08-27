package structure;

import java.util.PriorityQueue;

public class PriorityQueueExample {

    public static void main(String[] args) {

        // 1. Initialize a priority queue
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        pq.offer(3);
        pq.offer(1);
        pq.offer(2);
        pq.offer(4);
        pq.offer(5);

        // 2. Access elements
        System.out.println("Head element: " + pq.peek());

        // 3. Modify elements
        pq.poll();
        System.out.println("Head element after poll: " + pq.peek());

        // 4. Iterate through the priority queue
        System.out.print("Priority queue elements: ");
        for (int element : pq) {
            System.out.print(element + " ");
        }
        System.out.println();

        // 5. Find the size of the priority queue
        System.out.println("Size of the priority queue: " + pq.size());

    }
}
