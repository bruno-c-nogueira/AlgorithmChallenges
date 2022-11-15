import org.junit.Test

class Solution {
    fun smallerNumbersThanCurrent(nums: IntArray): IntArray {
        val minCounters = mutableListOf<Int>()

        for(i in 0 .. nums.lastIndex){
            var currentMin: Int = 0
            for(j in 0 ..nums.lastIndex) {
                if(nums[i] > nums[j]){
                    currentMin++
                }
            }
            minCounters.add(currentMin)
        }
        return minCounters.toIntArray()
    }

    @Test
    fun `test case 1`() {
        assert(Solution().smallerNumbersThanCurrent(intArrayOf(8,1,2,2,3) ).contentEquals(intArrayOf(4,0,1,1,3)))
    }
}

