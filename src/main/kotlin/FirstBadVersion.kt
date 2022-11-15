//https://leetcode.com/problems/first-bad-version/
class FirstBadVersion {
    fun findFirstBadVersion(n: Int): Int{
        var start = 0
        var end = n
        var badNum = 0

        while (start <= end){
            val mid = start + ((end - start) / 2)
            if (!isBadVersion(mid)){
                start = mid +1
            }
            if (isBadVersion(mid)){
                badNum = mid
                end = mid -1
            }


        }

        return badNum
    }

    fun isBadVersion(version: Int) : Boolean {
        return (version == 4) || (version == 5)

    }


}

fun main() {
    FirstBadVersion().findFirstBadVersion(5)
}