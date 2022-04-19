//https://leetcode.com/problems/build-array-from-permutation/
class BuildArrayFromPermutation {
    fun buildArray(nums: IntArray): IntArray {
        val permutation = mutableListOf<Int>()

        for(i in nums.indices){
            permutation.add(nums[nums[i]])
        }
        return permutation.toIntArray()

    }
}