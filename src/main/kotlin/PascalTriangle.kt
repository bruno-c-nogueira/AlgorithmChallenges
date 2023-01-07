//https://leetcode.com/problems/pascals-triangle/
class PascalTriangle {
    fun generate(numRows: Int): List<List<Int>> {
        val result = arrayListOf<List<Int>>()
        result.add(listOf(1))
        if (numRows == 1)return result
        result.add(listOf(1,1))
        if (numRows == 2)return result
        for (i in 1 until numRows-1){
            val currentList = arrayListOf<Int>()
            result[i].forEachIndexed { index, j ->
                if (index ==0){
                    currentList.add(1)
                    currentList.add(result[i][index]+result[i][1])
                }else if (index == result[i].lastIndex){
                    currentList.add(1)
                }else{
                    currentList.add(result[i][index]+result[i][index+1])
                }

            }
            result.add(currentList)
        }
        return result
    }
}

fun main() {
    PascalTriangle().generate(5)
}