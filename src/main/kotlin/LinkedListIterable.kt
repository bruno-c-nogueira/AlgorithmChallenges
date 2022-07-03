class LinkedListIterable<T>(private val list: LinkedList<T>) : MutableListIterator<T> {

    private var index = 0
    private var lastNode: Node<T>? = null
    override fun add(element: T) {
        TODO("Not yet implemented")
    }

    override fun hasNext(): Boolean {
        return index < list.size
    }

    override fun hasPrevious(): Boolean {
        TODO("Not yet implemented")
    }

    override fun next(): T {
        if (index >= list.size) throw IndexOutOfBoundsException()

        lastNode = if (index == 0) {
            list.nodeAt(0)
        } else {
            lastNode?.next
        }

        index++
        return lastNode!!.value
    }

    override fun nextIndex(): Int {
        TODO("Not yet implemented")
    }

    override fun previous(): T {
        TODO("Not yet implemented")
    }

    override fun previousIndex(): Int {
        TODO("Not yet implemented")
    }

    override fun remove() {
        if (index == 0) {
            list.pop()
        }else{
            val prevNode = list.nodeAt(index - 2) ?: return

            list.removeAfter(prevNode)
            lastNode = prevNode
        }
        index--
    }

    override fun set(element: T) {
        TODO("Not yet implemented")
    }
}