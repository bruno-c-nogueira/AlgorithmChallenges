class BSTIterator(root: TreeNode) {
    val stack = java.util.Stack<TreeNode>()

    init {
        addLeftSubtree(root)
    }

    fun next(): Int {
        val returnNode = stack.pop()
        if (returnNode.right != null) {
            addLeftSubtree(returnNode.right)
        }
        return returnNode.`val`
    }

    fun addLeftSubtree(node: TreeNode?) {
        var current = node
        while (current != null) {
            stack.push(current)
            current = current.left
        }
    }

    fun hasNext(): Boolean {
        return stack.isNotEmpty()
    }

    fun inOrder(current: TreeNode?, list: MutableList<Int>) {
        if (current == null) return
        inOrder(current.left, list)
        list.add(current.`val`)
        inOrder(current.right, list)
    }


}