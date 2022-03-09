import org.junit.Test

class BinarySearchTest{
    @Test
     fun `case A`(){
        val elements = arrayOf(1,2,3,4,5,6,33,45,50,80)
        val target = 80
        assert(BinarySearch().findByBinarySearch(elements, target) == 9)
    }

    @Test
     fun `case B`(){
        val elements = arrayOf(1,2,3,4,5)
        val target = 3
        assert(BinarySearch().findByBinarySearch(elements, target) == 2)
    }

    @Test
     fun `case C`(){
        val elements = arrayOf(1,2,3,4,5)
        val target = 30
        assert(BinarySearch().findByBinarySearch(elements, target) == -1)
    }

}