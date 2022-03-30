import org.junit.Test

import org.junit.Assert.*

class PalindromeNumberTest {

    @Test
    fun isPalindrome() {
        val notPalindrome1 = 123456
        val notPalindrome2 = 987546
        val palindrome1 = 121
        val palindrome2 = 789987
        assert(!PalindromeNumber().isPalindrome(notPalindrome1))
        assert(!PalindromeNumber().isPalindrome(notPalindrome2))
        assert(PalindromeNumber().isPalindrome(palindrome1))
        assert(PalindromeNumber().isPalindrome(palindrome2))
    }
}