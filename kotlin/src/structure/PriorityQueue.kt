package structure

import java.util.*

fun priorityQueueSample () {
    // Create a priority queue of integers
    val numbers = PriorityQueue<Int>()
    numbers.offer(3)
    numbers.offer(1)
    numbers.offer(2)
    println("Initial priority queue: $numbers")

    // Access elements
    println("First element: ${numbers.peek()}")

    // Remove elements
    numbers.poll()
    numbers.offer(1)
    println("Priority queue after removing an element: $numbers")

    // Add elements
    numbers.offer(4)
    println("Priority queue after adding an element: $numbers")

    // Iterate over the priority queue using a for loop
    println("Iterating over the priority queue:")
    for (number in numbers) {
        println("Number: $number")
    }

    // Use built-in priority queue functions
    println("Priority queue size: ${numbers.size}")
    println("Priority queue contains 2: ${numbers.contains(2)}")
}

fun main (){
    priorityQueueSample()
}
