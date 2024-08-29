package structure


fun main() {
    // 1. Initialize a map
    val map = mutableMapOf<String, Int>()

    // 2. Insert a new key-value pair
    map["a"] = 1
    map["b"] = 2
    map["c"] = 3

    // 3. Access elements
    println("Value of key 'a': ${map["a"]}")

    // 4. Modify elements
    map["a"] = 5
    println("Value of key 'a' after modification: ${map["a"]}")

    // 5. Find the size of the map
    println("Size of the map: ${map.size}")

    // 6. Iterate through the map
    print("Map elements: ")
    for ((key, value) in map) {
        print("$key-$value ")
    }

    // 7. Check if the map contains a key
    println("\nMap contains key 'b': ${map.containsKey("b")}")

    // 8. Remove a key-value pair
    map.remove("b")

    // 9. Clear the map
    map.clear()
}
