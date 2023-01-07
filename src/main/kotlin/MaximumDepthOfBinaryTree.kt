class MaximumDepthOfBinaryTree {
    var depth = 0
    fun maxDepth(root: TreeNode?): Int {
        helper(root, 1)
        return depth
    }

    fun helper(current: TreeNode?, currentDepth: Int) {
        if (current == null) return
        depth = Math.max(depth, currentDepth)
        helper(current.left, currentDepth + 1)
        helper(current.right, currentDepth + 1)

    }
}