import org.junit.Test

import org.junit.Assert.*

class ReverseStringTest {

    @Test
    fun reverseString() {
        val reversed = ReverseString()
        var str = "hello".toCharArray()
        var str2 = "Hannah".toCharArray()
        var str3 = "Bruno".toCharArray()

        reversed.reverseString(str3)
    }
}