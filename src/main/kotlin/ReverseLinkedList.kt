class ReverseLinkedList {
    fun reverseNode(node: ListNode?): ListNode? {
        var prev: ListNode? = null
        var next: ListNode? = null
        var current = node

        while (current != null){
            next = current.next
            current.next = prev
            prev = current
            current = next
        }
        return prev
    }
}
