class LinkedList<T> {
    var head : Node<T>? = null
    var tail: Node<T>? = null
    private var size = 0

    fun isEmpty() = size == 0

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
}