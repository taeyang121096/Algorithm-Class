package structure

fun graphSample () {
    // Create a graph with adjacency list representation
    val graph = mutableMapOf<Int, MutableList<Int>>()
    graph[0] = mutableListOf(1, 2)
    graph[1] = mutableListOf(0, 2)
    graph[2] = mutableListOf(0, 1, 3)
    graph[3] = mutableListOf(2)
    println("Initial graph: $graph")

    // Access elements
    println("Neighbors of vertex 2: ${graph[2]}")

    // Remove elements
    graph.remove(2)
    println("Graph after removing a vertex: $graph")

    // Add elements
    graph[2] = mutableListOf(0, 1, 3)
    println("Graph after adding a vertex: $graph")

    // Iterate over the graph using a for loop
    println("Iterating over the graph:")
    for ((vertex, neighbors) in graph) {
        println("Vertex $vertex has neighbors: $neighbors")
    }

    // Clear the graph
    graph.clear()
    println("Graph after clearing all vertices: $graph")

    // Check if the graph is empty
    println("Is the graph empty? ${graph.isEmpty()}")

    // Check the size of the graph
    println("Number of vertices in the graph: ${graph.size}")
}

fun main () {
    graphSample()
}
