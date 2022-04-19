import org.junit.Test

import org.junit.Assert.*

class MaximumSubarrayTest {

    @Test
    fun maxSubArray() {
        val inputArray = intArrayOf(5,4,-1,7,8)
        assert(MaximumSubarray().maxSubArray(inputArray) == 23)
    }
    @Test
    fun maxSubArray2() {
        val inputArray = intArrayOf(-2,1,-3,4,-1,2,1,-5,4)
        assert(MaximumSubarray().maxSubArray(inputArray) == 6)
    }
    @Test
    fun maxSubArray3() {
        val inputArray = intArrayOf(1)
        assert(MaximumSubarray().maxSubArray(inputArray) == 1)
    }
}