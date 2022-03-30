//https://leetcode.com/problems/roman-to-integer/
class RomanInteger {
    fun romanToInt(s: String): Int {
        val romaInteger: HashMap<String, Int> =
            hashMapOf("I" to 1, "V" to 5, "X" to 10, "L" to 50, "C" to 100, "D" to 500, "M" to 1000)
        var finalResult = 0
        for (currentRomanIndex in s.indices) {
            val current = romaInteger[s[currentRomanIndex].toString()]
            val nextNumber =
                if (currentRomanIndex != s.lastIndex) romaInteger[s[currentRomanIndex + 1].toString()] else null
            nextNumber?.let {
                if (current!! < nextNumber) {
                    finalResult -= current
                } else {
                    finalResult += current
                }
            } ?: kotlin.run {
                finalResult += current!!
            }
        }
        return finalResult
    }
}