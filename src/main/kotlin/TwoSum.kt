import java.util.*

//https://leetcode.com/problems/two-sum/
class TwoSum {
    fun twoSum(nums: IntArray, target: Int): IntArray? {
        val map = HashMap<Int, Int>()
        for (i in nums.indices) {
            val complement = target - nums[i]
            if (map.containsKey(complement)) {
                return intArrayOf(map[complement]!!, i)
            }
            map[nums[i]] = i
        }
        return null
    }
}