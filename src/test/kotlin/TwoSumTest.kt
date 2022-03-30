import org.junit.Test

class TwoSumTest{
    @Test
    fun `return indices of the two numbers such that they add up`(){
        val twoSum = TwoSum().twoSum(intArrayOf(2,7,11,15), 9)
        assert(twoSum.contentEquals(intArrayOf(0,1)))
    }
}