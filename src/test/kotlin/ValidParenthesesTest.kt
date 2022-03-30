import org.junit.Test

import org.junit.Assert.*

class ValidParenthesesTest {

    @Test
    fun isValid() {
        val validParentheses = ValidParentheses()

//        assert(validParentheses.isValid("()"))
//        assert(validParentheses.isValid("()[]{}"))
//        assert(!validParentheses.isValid("(]"))
        assert(validParentheses.isValid("{()}"))
        assert(validParentheses.isValid("{[()]}"))
        assert(validParentheses.isValid("{[]}"))
        assert(!validParentheses.isValid("{[)}"))
    }
}