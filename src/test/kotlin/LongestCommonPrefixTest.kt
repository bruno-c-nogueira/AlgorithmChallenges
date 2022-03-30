import org.junit.Test

import org.junit.Assert.*

class LongestCommonPrefixTest {

    @Test
    fun longestCommonPrefix() {

        val commonPrefix = LongestCommonPrefix()
        assert(commonPrefix.longestCommonPrefix(arrayOf("flower","flow","flight")) == "fl")
        assert(commonPrefix.longestCommonPrefix(arrayOf("dog","racecar","car")) == "")
    }
}