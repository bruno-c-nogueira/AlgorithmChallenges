class BinarySearch: Binary {
    override fun findByBinarySearch(array: Array<Int>, target: Int): Int {
        var middlePosition = array.size / 2
        var leftPointer = 0
        var rightPointer = array.size - 1
        // time O(log(n))
        while (array.size > middlePosition) {
            val middleElement = array[middlePosition]

            if (middleElement == target) return middlePosition

            if (target < middleElement) {
                rightPointer = middlePosition - 1
            }
            if (target > middleElement) {
                leftPointer = middlePosition + 1
            }
            if (leftPointer > rightPointer) {
                return -1
            }

            middlePosition = (leftPointer + rightPointer).div(2)
        }
        return -1
    }
}

