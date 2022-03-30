import org.junit.Assert.*
import org.junit.Test

class ReverseLinkedListTest{

    @Test
    fun `test if NodeList is Revert`(){
        val nod1 = ListNode(0)
        val nod2 = ListNode(4)
        val nod3 = ListNode(3)

        nod1.next = nod2
        nod2.next = nod3

        val reversedListNode = ReverseLinkedList().reverseNode(nod1)
        nod3.next = nod2
        nod2.next = nod1
        nod1.next = null
        assert(reversedListNode == nod3)
    }
}