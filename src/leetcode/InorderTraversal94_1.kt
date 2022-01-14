package leetcode;

import java.util.*
import kotlin.collections.ArrayList

class TreeNode(var `val`: Int) {
    var left: TreeNode? = null
    var right: TreeNode? = null
}

class InorderTraversal94_1 {
    fun inorderTraversal(root: TreeNode?): List<Int> {
        if (root == null)
            return listOf()
        var list: ArrayList<Int> = ArrayList()
        var head = root;
        val stack = Stack<TreeNode>()
        while (stack.isNotEmpty() || head != null) {
            if (head != null) {
                stack.push(head)
                head = head.left
            } else {
                val node = stack.pop()
                list.add(node.`val`)
                head = node.right
            }
        }
        return list
    }
}