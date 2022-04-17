import org.junit.Test

internal class BuildArrayFromPermutationTest {

   @Test
    fun buildArray() {
        assert(BuildArrayFromPermutation().buildArray(intArrayOf(0,2,1,5,3,4)).contentEquals(intArrayOf(0,1,2,4,5,3)))
    }
}