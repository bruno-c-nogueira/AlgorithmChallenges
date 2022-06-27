import org.junit.Test
//https://www.raywenderlich.com/books/data-structures-algorithms-in-kotlin/v1.0/chapters/3-linked-list
class CreatingNodesTest {

    @Test
    fun creatingNodesSimple() {
        val node1 = Node(1)
        val node2 = Node(2)
        val node3 = Node(3)

        node1.next = node2
        node2.next = node3
        println(node1)
    }

    @Test
    fun `head-first insertion`() {
        //Adding a value at the front of the list is known as a push operation.
        // This is also known as head-first insertion.
        val linked = LinkedList<Int>()
        linked.push(1)
        .push(2)
        .push(3)
        println(linked.toString())
    }

    @Test
    fun `tail-end insertion`(){
    // This adds a value at the end of the list, which is known as tail-end insertion.
        val linked = LinkedList<Int>()
        linked.append(1)
        linked.append(2)
        linked.append(3)
        println(linked.toString())
    }
}