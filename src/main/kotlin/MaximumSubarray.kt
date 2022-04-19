class MaximumSubarray {
    fun maxSubArray(nums: IntArray): Int {
        var result = 0
        var currentSum = 0

        for (i in nums.indices) {
            currentSum = maxOf(currentSum + nums[i], nums[i])
            result = maxOf(result, currentSum)
        }
        return result
    }
}