package linear.Array

// 배열을 입력받아 output[i] 가 자신을 제외한 나머지 모든 요소의 곱셈 결과가 되도록 출력하라
// [1,3,5,7]
// [105,35,21,15]
fun main() {
    val nums = intArrayOf(1, 3, 5, 7)
    print(exclusiveSelfProduct(nums).contentToString())
}


fun exclusiveSelfProduct(nums: IntArray): IntArray {

    val result = IntArray(nums.size)

    var p = 1

    for(i in nums.indices){
        result[i] = p
        p *= nums[i]
    }

    p = 1

    for (i in nums.indices.reversed()) {
        result[i] *= p
        p *= nums[i]
    }

    return result
}
