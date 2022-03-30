//https://leetcode.com/problems/implement-strstr/
class ImplementstrStr {
    fun strStr(haystack: String, needle: String): Int {
        if(needle.isNullOrEmpty()) return 0
        if(haystack == needle) return 0
        if(haystack.contains(needle)){
            return haystack.indexOf(needle)
        }else{
            return -1
        }
    }
}