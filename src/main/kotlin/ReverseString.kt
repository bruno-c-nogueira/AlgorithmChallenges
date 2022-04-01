//https://leetcode.com/problems/reverse-string/
class ReverseString {
    fun reverseString(s: CharArray): Unit {
        val middleArray = s.size / 2
        var index = 0
        while (index < middleArray){
            val currentValue = s[index]
            s[index] = s[s.size -1 - index]
            s[s.size  -1-index] = currentValue
            index ++
        }
    }
}