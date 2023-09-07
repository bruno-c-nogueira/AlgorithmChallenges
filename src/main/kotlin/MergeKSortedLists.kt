import java.util.PriorityQueue

class MergeKSortedLists {
    fun mergeKLists(lists: Array<ListNode?>): ListNode? {
        if (lists.size == 0) return null
        if (lists.size == 1) return lists[0]

        val queue = PriorityQueue { t1: ListNode, t2: ListNode -> t1.`val` - t2.`val` }

        for (i in 0..lists.size) {
            if (lists[i] != null) {
                queue.add(lists[i])
            }
        }

        if (queue.isEmpty()) {
            return null
        }

        var returnNode: ListNode? = ListNode(0)
        var runner = returnNode

        while (queue.isNotEmpty()) {
            val current = queue.poll()
            runner?.next = current
            runner = runner?.next
            if (current.next != null) {
                queue.add(current.next)
            }
        }
        return returnNode?.next
    }


}