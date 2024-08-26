package structure

import java.util.*


fun stackSample() {
    // Create a stack of integers
    val numbers = Stack<Int>()
    numbers.push(1)
    numbers.push(2)
    numbers.push(3)
    println("Initial stack: $numbers")

    // Access elements
    println("Top element: ${numbers.peek()}")

    // Remove elements
    numbers.pop()
    println("Stack after popping an element: $numbers")

    // Add elements
    numbers.push(4)
    println("Stack after pushing an element: $numbers")

    // Iterate over the stack using a for loop
    println("Iterating over the stack:")
    for (number in numbers) {
        println("Number: $number")
    }
}

fun main () {
    stackSample()
}
