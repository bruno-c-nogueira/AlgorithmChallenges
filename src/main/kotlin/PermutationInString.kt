import java.util.*

class PermutationInString {
    fun checkInclusion(s1: String, s2: String): Boolean {
        if (s1.length > s2.length){
            return false
        }
        val count1 = intArrayOf()
        s1.forEach {
            count1[it-'a']++
        }
        var count2 = intArrayOf()
        var right = 0

        while (right < s1.length){
            var current = s2[right]
            count2[current - 'a']++
            if (count1.contentEquals(count2)) return true

            right++
        }

        var left = 0
        while (right < s2.length){
            val currentCharRight = s2.charAt(right)
            count2[currentCharRight - 'a']++
            val lastCharLeft = s2[left++]
            count2[lastCharLeft-'a']
            if (count1.contentEquals(count2)) return true

            right++
        }

        return false
    }
}