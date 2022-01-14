package leetcode;

import java.util.*
import kotlin.collections.ArrayList



class InorderTraversal94_2 {
    val list = ArrayList<Int>()
    fun inorderTraversal(root: TreeNode?): List<Int> {
        inorderTree(root)
        return list
    }

    private fun inorderTree(root: TreeNode?) {
        if (root != null) {
            inorderTree(root.left)
            list.add(root.`val`)
            inorderTree(root.right)
        }
    }
}