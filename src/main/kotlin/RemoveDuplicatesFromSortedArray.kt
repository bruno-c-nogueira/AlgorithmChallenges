//https://leetcode.com/problems/remove-duplicates-from-sorted-array/
class RemoveDuplicatesFromSortedArray {
    fun removeDuplicates(nums: IntArray): Int {
        if (nums.isEmpty()) return 0
        var size  = 1
        for (i in 1 until nums.size){
            if (nums[i-1] != nums[i]){
                nums[size]=nums[i]
                size++
            }
        }
        return size
    }
}