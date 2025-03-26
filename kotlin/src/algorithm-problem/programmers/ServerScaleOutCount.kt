package `algorithm-problem`.programmers


fun main() {
    val players = intArrayOf(0, 2, 3, 3, 1, 2, 0, 0, 0, 0, 4, 2, 0, 6, 0, 4, 2, 13, 3, 5, 10, 0, 1, 5)
    val m = 3
    val k = 5

    println(answer(players, m, k))
}

fun answer(players: IntArray, m: Int, k: Int): Int {
    val serverAdd = players.map { it / m }.toMutableList()

    for (i in serverAdd.indices) {
        val current = serverAdd[i]
        if (current > 0) {
            val limit = minOf(i + k, serverAdd.size)
            for (j in i + 1 until limit) {
                val updatedValue = serverAdd[j] - current
                serverAdd[j] = maxOf(updatedValue, 0)
            }
        }
    }

    return serverAdd.sum()
}