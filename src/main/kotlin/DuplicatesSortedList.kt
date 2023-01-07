//https://leetcode.com/problems/remove-duplicates-from-sorted-list/
class DuplicatesSortedList {
    fun deleteDuplicates(head: ListNode?): ListNode? {
        var current = head
        var temp = current
        while (current != null) {
            while (temp != null && temp.`val` == current.`val`) {
                temp = temp.next
            }
            current.next = temp
            current = current.next
        }
        return head
    }

    fun append(node: ListNode) {

    }
}