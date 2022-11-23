import kotlin.math.pow

//https://leetcode.com/problems/contains-duplicate/
class ContainsDuplicate {
    fun containsDuplicate(nums: IntArray): Boolean {
        val map = HashMap<Int, Int>()
        nums.forEach {
            if (map.containsKey(it)){
                return true
            }else {
                map[it] = 1
            }
        }
        1.0.pow()
        return false
    }

}

//https://leetcode.com/problems/binary-tree-inorder-traversal/
class TraversalTree {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        var list = mutableListOf<Int>()
        return checkTree(root, list)
    }

    fun checkTree(root: TreeNode?, list: MutableList<Int>): MutableList<Int> {
        if(root == null) return list
        val list = checkTree(root.left, list)
        list.add(root.`val`)

        return checkTree(root.right, list)
    }
}