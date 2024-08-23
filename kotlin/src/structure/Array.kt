package structure

fun arraySample() {
    // Create an array of integers
    val numbers = arrayOf(1, 2, 3, 4, 5)
    println("Initial array: ${numbers.joinToString()}")

    // Access elements
    println("First element: ${numbers[0]}")
    println("Second element: ${numbers[1]}")

    // Modify elements
    numbers[2] = 10
    println("Modified third element: ${numbers[2]}")

    // Iterate over the array using a for loop
    println("Iterating over the array:")
    for (number in numbers) {
        println("Number: $number")
    }

    // Iterate over the array using forEach
    println("Iterating over the array using forEach:")
    numbers.forEach { number ->
        println("Number: $number")
    }

    // Use built-in array functions
    println("Array size: ${numbers.size}")
    println("Array contains 4: ${numbers.contains(4)}")
    println("Array sum: ${numbers.sum()}")
    println("Array average: ${numbers.average()}")
    println("Array max: ${numbers.maxOrNull()}")
    println("Array min: ${numbers.minOrNull()}")
}

fun main() {
    arraySample()
}
