class LinkedList<T>: Iterable<T> {
    var head : Node<T>? = null
    var tail: Node<T>? = null
    var size = 0
        private set

    fun isEmpty() = size == 0

    override fun iterator(): Iterator<T> {
        return LinkedListIterable(this)
    }

    override fun toString(): String {
        return if (isEmpty()) {
            "Empty list"
        } else {
            head.toString()
        }
    }

    fun push(value: T): LinkedList<T>{
        head = Node(value = value,next = head)
        if (tail == null){
            tail = head
        }
        size++
        return this
    }

    fun append(value: T){
        if (isEmpty()){
            push(value)
            return
        }

        tail?.next = Node(value)

        tail = tail?.next
        size ++
    }

    fun nodeAt(index: Int): Node<T>? {
        var currentNode = head
        var currentIndex = 0
        while(currentNode != null && currentIndex < index){
            currentNode = currentNode.next
            currentIndex++
        }
        return currentNode
    }

    fun insert(value: T, afterNode: Node<T>): Node<T>{
        if (tail == afterNode){
            append(value)
            return tail!!
        }
        val newNode = Node(value, afterNode.next)
        afterNode.next = newNode
        size ++
        return newNode
    }

    fun pop(): T?{
        if(!isEmpty()){
            size --
        }
        val result = head?.value
        head = head?.next
        if (isEmpty()){
            tail = null
        }
        return result
    }

    fun removeLast(): T?{
        val head = head ?: return null

        if(head.next == null){
            return pop()
        }

        size--

        var prev = head
        var current = head
        var next = current.next

        while (next != null){
            prev = current
            current = next
            next = current.next
        }
        prev.next = null
        tail = prev
        this.head
        return current.value
    }

    fun removeAfter(node: Node<T>): T?{
        val result = node.next?.value

        if (node.next == tail) {
            tail = node
        }

        if (node.next != null) {
            size--
        }

        node.next = node.next?.next
        return result
    }
}