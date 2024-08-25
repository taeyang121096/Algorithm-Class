package structure

import java.util.*

fun listSample() {
    // Create a list of integers
    val numbers = listOf(1, 2, 3, 4, 5)
    println("Initial list: $numbers")

    // Access elements
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")

    // Modify elements
    // numbers[2] = 10 // Error: Val cannot be reassigned

    // Iterate over the list using a for loop
    println("Iterating over the list:")
    for (number in numbers) {
        println("Number: $number")
    }

    // Iterate over the list using forEach
    println("Iterating over the list using forEach:")
    numbers.forEach { number ->
        println("Number: $number")
    }

    // Use built-in list functions
    println("List size: ${numbers.size}")
    println("List contains 4: ${numbers.contains(4)}")
    println("List sum: ${numbers.sum()}")
    println("List average: ${numbers.average()}")
    println("List max: ${numbers.maxOrNull()}")
    println("List min: ${numbers.minOrNull()}")
}

fun linkedListSample() {
    // Create a linked list of integers
    val numbers = LinkedList(listOf(1, 2, 3, 4, 5))
    println("Initial linked list: $numbers")

    // Access elements
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")

    // Modify elements
    numbers[2] = 10
    println("Modified third element: ${numbers[2]}")

    // Add elements
    numbers.add(6)
    println("Linked list after adding an element: $numbers")

    // Remove elements
    numbers.remove(1) // Removes the first occurrence of 1
    println("Linked list after removing an element: $numbers")

    // Iterate over the linked list using a for loop
    println("Iterating over the linked list:")
    for (number in numbers) {
        println("Number: $number")
    }

    // Iterate over the linked list using forEach
    println("Iterating over the linked list using forEach:")
    numbers.forEach { number ->
        println("Number: $number")
    }

    // Use built-in linked list functions
    println("Linked list size: ${numbers.size}")
    println("Linked list contains 4: ${numbers.contains(4)}")
    println("Linked list sum: ${numbers.sum()}")
    println("Linked list average: ${numbers.average()}")
    println("Linked list max: ${numbers.maxOrNull()}")
    println("Linked list min: ${numbers.minOrNull()}")
}

fun main() {
    listSample()
    linkedListSample()
}
