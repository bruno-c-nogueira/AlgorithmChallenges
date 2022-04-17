//https://leetcode.com/problems/concatenation-of-array/
class ConcatenationOfArray {
    fun getConcatenation(nums: IntArray): IntArray {
        val numsCopy : MutableList<Int> = nums.toMutableList()
        numsCopy.addAll(nums.asList())
        return numsCopy.toIntArray()
    }
}