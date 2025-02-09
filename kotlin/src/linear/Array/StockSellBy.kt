package linear.Array

fun main() {

    val prices = intArrayOf(8,1,5,3,6,4)
    print(maxProfit(prices))
}

fun maxProfit(prices: IntArray): Int {
    var maxProfit = 0

    var minPrice = prices[0]

    for (price in prices) {
        minPrice = minPrice.coerceAtMost(price)
        maxProfit = maxProfit.coerceAtLeast(price - minPrice)
    }

    return maxProfit
}
