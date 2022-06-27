//https://leetcode.com/problems/search-insert-position/
class SearchInsertPosition {
    fun searchInsert(nums: IntArray, target: Int): Int {
        var middlePointer = nums.size / 2
        var leftPointer = 0
        var rightPointer = nums.size - 1

        if(nums.size == 1) return if(target == nums[0] || target < nums[0]) 0 else 1

        while(nums.size > middlePointer){
            val middleElement = nums[middlePointer]
            if(middleElement == target) return middlePointer

            if(target < middleElement){
                rightPointer = middlePointer - 1
            }

            if(target > middleElement){
                leftPointer = middlePointer + 1
            }

            if(leftPointer > rightPointer){
                return  if(middleElement >  target) middlePointer else middlePointer +1
            }

            middlePointer = (leftPointer + rightPointer).div(2)
        }
        return 0

    }
}