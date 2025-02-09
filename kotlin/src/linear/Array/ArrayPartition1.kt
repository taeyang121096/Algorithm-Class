package linear.Array

// n개의 페어를 이용한 min(a,b)의 합으로 만들 수 있는 가장 큰 수를 출력하라
// [1,3,4,2]
// 4

fun main () {
    val nums = intArrayOf(1,3,4,2)
    print(arrayPartitionSum(nums))
}

fun arrayPartitionSum(nums: IntArray) : Int {
    nums.sort()
    var sum = 0

    for ((i, n) in nums.withIndex()) {
        if (i % 2 == 0) {
            sum += n
        }
    }

    return sum
}
