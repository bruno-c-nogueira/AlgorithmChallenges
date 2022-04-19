import org.junit.Test

internal class ConcatenationOfArrayTest {

    @Test
    fun getConcatenation() {
        assert(ConcatenationOfArray().getConcatenation(intArrayOf(1,2,1)).contentEquals(intArrayOf(1,2,1,1,2,1)))
    }

    @Test
    fun getConcatenation2() {
        assert(ConcatenationOfArray().getConcatenation(intArrayOf(1,3,2,1)).contentEquals(intArrayOf(1,3,2,1,1,3,2,1)))
    }
}