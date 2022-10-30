//https://leetcode.com/problems/search-a-2d-matrix-ii/
class Search2DMatrixII {
    fun searchMatrix(matrix: Array<IntArray>, target: Int): Boolean {
        if (matrix.isEmpty()) {
            return false
        }
        var currentRow = 0
        var currentColumn = matrix[0].lastIndex

        while (currentRow < matrix.size && currentColumn >= 0) {
            val currentNumber = matrix[currentRow][currentColumn]
            if (currentNumber == target) return true
            if (currentNumber > target) {
                currentColumn--
            } else {
                currentRow++
            }
        }
        return false
    }
}