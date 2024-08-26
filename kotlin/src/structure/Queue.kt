package structure

import java.util.*

fun QueueSample() {
    // Create a queue of integers using LinkedList
    val numbers: Queue<Int> = LinkedList()
    numbers.offer(1)
    numbers.offer(2)
    numbers.offer(3)
    println("Initial queue: $numbers")

    // Access elements
    println("First element: ${numbers.peek()}")

    // Remove elements
    numbers.poll()
    println("Queue after removing an element: $numbers")

    // Add elements
    numbers.offer(4)
    println("Queue after adding an element: $numbers")

    // Iterate over the queue using a for loop
    println("Iterating over the queue:")
    for (number in numbers) {
        println("Number: $number")
    }

    // Use built-in queue functions
    println("Queue size: ${numbers.size}")
    println("Queue contains 2: ${numbers.contains(2)}")
}

fun main() {
    QueueSample()
}
