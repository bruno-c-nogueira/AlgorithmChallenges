import org.junit.Test

import org.junit.Assert.*

class LongestConsecutiveSequenceTest {

    @Test
    fun longestConsecutive() {
        val result = LongestConsecutiveSequence().longestConsecutive(intArrayOf(100,4,200,1,3,2))
        assert(result == 4)
    }

    @Test
    fun longestConsecutive2() {
        val result = LongestConsecutiveSequence().longestConsecutive(intArrayOf(0,3,7,2,5,8,4,6,0,1))
        assert(result == 9)
    }
}