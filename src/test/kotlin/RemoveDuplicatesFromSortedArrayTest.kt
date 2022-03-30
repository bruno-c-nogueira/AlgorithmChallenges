import org.junit.Test

class RemoveDuplicatesFromSortedArrayTest{

    @Test
    fun `test int array remover`(){
        val duplicateArray = intArrayOf(1,1,2)
        val removedArray = RemoveDuplicatesFromSortedArray().removeDuplicates(duplicateArray)
        assert(removedArray == 2)
    }
}