import org.junit.Assert.*
import org.junit.Test

class PlusOneTest {
    @Test
    fun case1() {
        val result = PlusOne().plusOne(intArrayOf(1, 2, 3))
        assert(result.contentEquals(intArrayOf(1, 2, 4)))
    }
}