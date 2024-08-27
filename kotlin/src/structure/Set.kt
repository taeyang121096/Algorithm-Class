package structure

fun setSample () {
    // Create a set of integers
    val numbers = mutableSetOf<Int>()
    numbers.add(1)
    numbers.add(2)
    numbers.add(3)
    println("Initial set: $numbers")

    // Access elements
    println("Element 2 is in the set: ${numbers.contains(2)}")

    // Remove elements
    numbers.remove(2)
    println("Set after removing an element: $numbers")

    // Add elements
    numbers.add(4)
    println("Set after adding an element: $numbers")

    // Iterate over the set using a for loop
    println("Iterating over the set:")
    for (number in numbers) {
        println("Number: $number")
    }

    // Clear the set
    numbers.clear()
    println("Set after clearing all elements: $numbers")

    // Check if the set is empty
    println("Is the set empty? ${numbers.isEmpty()}")

    // Check the size of the set
    println("Size of the set: ${numbers.size}")

}

fun main () {
    setSample()
}
