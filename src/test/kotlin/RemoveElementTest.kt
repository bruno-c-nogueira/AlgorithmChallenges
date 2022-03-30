import org.junit.Test

import org.junit.Assert.*

class RemoveElementTest {

    @Test
    fun removeElement() {
        val removeElement = RemoveElement()
        val arrays = intArrayOf(3,2,2,3)
        val target = 3
        val filterDuplicates = removeElement.removeElement(arrays, target)
        val arrays2 = intArrayOf(0,1,2,2,3,0,4,2)
        val target2 = 2
        val filterDuplicates2 = removeElement.removeElement(arrays2, target2)

        assert(filterDuplicates == 2)
        assert(filterDuplicates2 == 5)

    }
}