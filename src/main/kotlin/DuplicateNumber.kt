class DuplicateNumber {

    fun findNonDuplicatedNumber(arr: IntArray): Int {
        if (arr.size == 1) return arr[0]
        arr.sort()
        for (i in arr.indices step 2) {
            if (i == arr.lastIndex || arr[i] != arr[i + 1]) return arr[i]
        }
        return arr[arr.lastIndex]
    }

    fun findNonDuplicatedNumber2(arr: IntArray): Int {
        if (arr.size == 1) return arr[0]
        val count = hashMapOf<Int, Int>()
        arr.forEach {
            count[it] = count.getOrDefault(0, it) + 1
        }
        return  arr[arr.lastIndex]
    }

    fun moveZerosToEnd(array: IntArray): IntArray{
        var movedArray = IntArray(array.size){0}
        var lastNonZeroIndex = 0
        for (element in array){
            if (element != 0) movedArray[lastNonZeroIndex++] = element
        }
        return movedArray
    }

    fun moveZerosToEnd2(array : IntArray): IntArray{
        var nextNonZeroIdx = 0
        for (nextZeroIdx in 0..array.lastIndex){
            if (array[nextNonZeroIdx] == 0){
                if (array[nextNonZeroIdx] != 0){
                    //swap(array, nextNonZeroIdx++, nextZeroIdx)
                }
            }else {
                nextNonZeroIdx++
            }
        }

        return array
    }

    fun singleNumber(nums: IntArray): Int {
        if (nums.size == 1) return nums[0]
        val count = HashMap<Int, Int>()
        nums.forEach {
            count[it] = count[it]?.run {
                this.plus(1)
            } ?: 1
        }
        var single = 0
        nums.forEach{
            if(count[it] ==1) {
                single = it
                return@forEach
            }

        }
        return single
    }

}

fun main() {
    DuplicateNumber().singleNumber(intArrayOf(2,2,1))
}