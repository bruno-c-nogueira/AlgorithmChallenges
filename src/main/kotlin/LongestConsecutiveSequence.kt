class LongestConsecutiveSequence {
    fun longestConsecutive(nums: IntArray): Int {
        var result = 1
        var currentResult = 1
        if (nums.isEmpty()) return 0
        val numSorted = nums.sortedArray()
        for (i in 1 until numSorted.size) {
            if (numSorted[i - 1] + 1 == numSorted[i]) {
                currentResult++
            } else {
                if (currentResult > result) {
                    result = currentResult
                }
                currentResult = 1
            }
        }
        return maxOf(result, currentResult)
    }
}