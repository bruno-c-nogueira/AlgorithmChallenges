import org.junit.Test

import org.junit.Assert.*

class ImplementstrStrTest {

    @Test
    fun strStr() {
        val implementstrStr = ImplementstrStr()
        assert(implementstrStr.strStr("hello", "ll") == 2)
        assert(implementstrStr.strStr("aaaaa", "bba") == -1)
        assert(implementstrStr.strStr("", "") == 0)
    }
}