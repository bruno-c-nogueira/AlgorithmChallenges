import org.junit.Test

import org.junit.Assert.*

class RomanIntegerTest {

    @Test
    fun romanToInt() {
        val romanConverter = RomanInteger()

        assert(romanConverter.romanToInt("MMMDCCXXIV") == 3724)
        assert(romanConverter.romanToInt("XX") == 20)
        assert(romanConverter.romanToInt("IV") == 4)
    }
}