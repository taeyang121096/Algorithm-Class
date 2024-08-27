package structure

fun dequeSample () {
    // Create a deque of integers
    val numbers = ArrayDeque<Int>()
    numbers.addFirst(1)
    numbers.addLast(2)
    numbers.addLast(3)

    println("Initial deque: $numbers")

    // Access elements
    println("First element: ${numbers.first()}")
    println("Last element: ${numbers.last()}")

    // Add elements
    numbers.addFirst(4)
    numbers.addLast(5)
    println("Deque after adding elements: $numbers")

    // Iterate over the deque using a for loop
    println("Iterating over the deque:")
    for (number in numbers) {
        println("Number: $number")
    }

    // Use built-in deque functions
    println("Deque size: ${numbers.size}")
    println("Deque contains 2: ${numbers.contains(2)}")
}

fun main () {
    dequeSample()
}
