import org.junit.Assert.*
import org.junit.Test

class Search2DMatrixIITest {

    @Test
    fun `test case 1`() {
        assert( Search2DMatrixII().searchMatrix(
            arrayOf(
                intArrayOf(1, 4, 7, 11, 15),
                intArrayOf(2, 5, 8, 12, 19),
                intArrayOf(3, 6, 9, 16, 22),
                intArrayOf(10, 13, 14, 17, 24),
                intArrayOf(18, 21, 23, 26, 30)
            ), 5
        ))
    }

    @Test
    fun `test case 2`() {
        assert(
            !Search2DMatrixII().searchMatrix(
                arrayOf(
                    intArrayOf(1, 4, 7, 11, 15),
                    intArrayOf(2, 5, 8, 12, 19),
                    intArrayOf(3, 6, 9, 16, 22),
                    intArrayOf(10, 13, 14, 17, 24),
                    intArrayOf(18, 21, 23, 26, 30)
                ), 20
            )
        )
    }
}