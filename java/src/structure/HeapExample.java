package structure;

import java.util.PriorityQueue;

public class HeapExample {

    public static void main(String[] args) {

        // Integer를 저장하는 최소 힙 생성
        PriorityQueue<Integer> minHeap = new PriorityQueue<>();

        // 요소 추가
        minHeap.offer(5);
        minHeap.offer(2);
        minHeap.offer(8);
        minHeap.offer(1);

        // 최소값 확인
        int minValue = minHeap.peek();
        System.out.println("Min value: " + minValue); // Min value: 1

        // 최소값 삭제
        int deletedValue = minHeap.poll();
        System.out.println("Deleted value: " + deletedValue); // Deleted value: 1

        // 최소값 확인
        minValue = minHeap.peek();
        System.out.println("Min value: " + minValue); // Min value: 2


    }
}
