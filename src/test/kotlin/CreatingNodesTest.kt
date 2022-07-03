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
        assert(linked.size == 3)
    }

    @Test
    fun `tail-end insertion`(){
    // This adds a value at the end of the list, which is known as tail-end insertion.
        val linked = LinkedList<Int>()
        linked.append(1)
        linked.append(2)
        linked.append(3)
        println(linked.toString())
        assert(linked.size == 3)
    }

    @Test
    fun `insert operations`(){
        val list = LinkedList<Int>()
        list.push(3)
        list.push(2)
        list.push(1)

        println("Before inserting: $list")
        var middleNode = list.nodeAt(1)!!
        for (i in 1..3){
            middleNode = list.insert(-1 * i, middleNode)
        }
        println("After insert $list")
    }

    @Test
    fun `pop`(){
        val list = LinkedList<Int>()

        list.push(3)
        list.push(2)
        list.push(1)
        println("Before popping list: $list")
        val poppedValue = list.pop()
        println("After popping list: $list")
        println("Popped value: $poppedValue")
        assert(list.size == 2)

    }

    @Test
    fun `remove last item in linked list`(){
        val linked = LinkedList<Int>()
        linked.append(1)
        linked.append(2)
        linked.append(3)
        println(linked.toString())
        linked.removeLast()
        println(linked.toString())
    }

    @Test
    fun `remove after node element`(){
        val linked = LinkedList<Int>()
        linked.append(1)
        linked.append(2)
        linked.append(3)
        println("Before removing $linked")
        val nodeAtIndex = linked.nodeAt(0)
        linked.removeAfter(nodeAtIndex!!)
        println("After removing $linked")
    }

    @Test
    fun `printing doubles`(){
        val list =  LinkedList<Int>()
        list.append(0)
        list.append(1)
        list.append(2)

        list.forEach {
            println("Double the linked list value $it is -> ${it * 2}")
        }
    }

    @Test
    fun `testing the collection contains in linked list`(){
        val list = LinkedList<Int>()
        list.append(1)
        list.append(2)
        list.append(3)
        list.removeLast()

        assert( list.contains(1))
        assert( list.contains(2))
        assert( !list.contains(3))
        assert(list.containsAll(listOf(1,2)))
    }
}