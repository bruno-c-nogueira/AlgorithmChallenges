//https://leetcode.com/problems/remove-element/
class RemoveElement {
    fun removeElement(nums: IntArray, `val`: Int): Int {
        if (nums.isEmpty()) return 0
        var result = 0

        for (i in nums.indices){
            if (nums[i] != `val`){
                nums[result] = nums[i]
                result ++
            }
        }
        return  result
    }
}