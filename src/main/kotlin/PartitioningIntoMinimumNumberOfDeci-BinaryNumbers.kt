//https://leetcode.com/problems/partitioning-into-minimum-number-of-deci-binary-numbers/
//https://www.youtube.com/watch?v=vPzWYjROvCI
class PartitioningIntoMinimumNumberOfDeciBinaryNumbers {
    fun minPartitions(n: String): Int {
        var m = Int.MIN_VALUE
        for (i in n.indices) {
            val b: Int = n.get(i) - '0'
            m = Math.max(m, b)
        }
        return m
    }
}
