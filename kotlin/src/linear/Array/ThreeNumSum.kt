package linear.Array


// nums = [-1, 0, 1, 2, -1, -5] 배열을 입력 받아 합으로 0 을 만들 수 있는 3개의 엘리먼트를 출력하라

// -5, -1, -1, 0, 1, 2


fun threeSum(nums: IntArray): List<List<Int>> {
    var left: Int
    var right: Int
    var sum: Int
    val result: MutableList<List<Int>> = mutableListOf()
    nums.sort()

    for (i in 0 until nums.size - 2) {

        if (i > 0 && nums[i] == nums[i - 1]) continue

        left = i + 1
        right = nums.size - 1

        while (left < right) {
            sum = nums[i] + nums[left] + nums[right]
            if (sum < 0)
                left += 1
            else if (sum > 0)
                right -= 1
            else {

                result.add(listOf(nums[i], nums[left], nums[right]))

                while (left < right && nums[left] == nums[left +1])
                    left += 1
                while (left < right && nums[right] == nums[right - 1])
                    right -= 1

                left += 1
                right -= 1

            }
        }
    }

    return result
}



fun main() {
    print("test")

    val nums = intArrayOf(-1,0,1,2,-1,-5)
    print(threeSum(nums))
}
