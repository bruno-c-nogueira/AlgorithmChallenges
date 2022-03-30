import org.junit.Test

import org.junit.Assert.*

class SearchInsertPositionTest {

    @Test
    fun searchInsert() {
        val searchInsertPosition = SearchInsertPosition()
        assert(searchInsertPosition.searchInsert(intArrayOf(1,3,5,6), 5) == 2)
        assert(searchInsertPosition.searchInsert(intArrayOf(1,3,5,6), 2) == 1)
        assert(searchInsertPosition.searchInsert(intArrayOf(1,3,5,6), 7) == 4)
    }
}