import java.util.Collections

class Permutations {
    fun permute(nums: IntArray): List<List<Int>> {
        if(nums.size < 2) return listOf(nums.toList())

        val result = arrayListOf<List<Int>>()
        val numsCopy = nums.copyOf().toMutableList()
        for(i in nums.indices){
            for(j in 1 until nums.size){
                Collections.swap(numsCopy,j,j-1)
                val numsBase = numsCopy.toList()
                result.add(numsBase)
            }
        }
        return result.toList()
    }

}

fun main() {
    Permutations().permute(intArrayOf(1,2,3))
}