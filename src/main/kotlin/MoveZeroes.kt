import java.util.Collections

//https://leetcode.com/problems/move-zeroes/submissions/882130784/
class MoveZeroes {
    fun moveZeroes(nums: IntArray): Unit {

        var i = 0
        var j = 0
        for (j in 1 until nums.size){
            if (nums[i] == 0){
                if (nums[j] != 0) swap(nums, i++, j)
            }else{
                i++
            }
        }
    }
    fun swap(list: IntArray, i: Int, j :Int){
        val temp = list[i]
        list[i] = list[j]
        list[j] = temp
    }
}

fun main() {
    MoveZeroes().moveZeroes(intArrayOf(0, 1, 0, 3, 12))
}