//https://leetcode.com/problems/palindrome-number/
class PalindromeNumber {
    fun isPalindrome(x:Int): Boolean{
        val currentNumber = x.toString()
        val reversedNum = x.toString().reversed()
        return currentNumber == reversedNum
    }
}