//https://leetcode.com/problems/linked-list-cycle/submissions/885314971/
class LinkedListCycle {

    fun hasCycle(node: Node<Int>?): Boolean {
        val set = HashSet<Node<Int>>()

        var current = node

        while (current != null){
//            if (!set.contains(current.value)){
//                set.add(current)
//            } else return true
            current = current.next
        }
        return false
    }
    fun hasCycleFloyd(head: Node<Int>?): Boolean {
        var fast = head
        var slow = head

        while (fast != null && fast.next != null) {
            fast = fast?.next?.next
            slow = slow?.next
            if (fast == slow) return true
        }
        return false
    }
}