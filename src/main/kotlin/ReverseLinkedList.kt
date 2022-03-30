class ReverseLinkedList {
    fun reverseNode( node: ListNode?): ListNode? {
        var prev: ListNode? = null
        var current = node
        var next: ListNode? = null

        while (current != null){
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }
}
