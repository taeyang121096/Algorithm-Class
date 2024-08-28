package structure

import java.util.*

fun main() {
    // Integer를 저장하는 최소 힙 생성
    val minHeap = PriorityQueue<Int>()

    // 요소 추가
    minHeap.offer(5)
    minHeap.offer(2)
    minHeap.offer(8)
    minHeap.offer(1)

    // 최소값 확인
    var minValue = minHeap.peek()
    println("Min value: $minValue") // Min value: 1

    // 최소값 삭제
    val deletedValue = minHeap.poll()
    println("Deleted value: $deletedValue") // Deleted value: 1

    // 최소값 확인
    minValue = minHeap.peek()
    println("Min value: $minValue") // Min value: 2
}
