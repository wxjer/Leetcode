package leetcode

/**
给定一棵树的前序遍历 preorder 与中序遍历 inorder。请构造二叉树并返回其根节点。 

 

 示例 1: 

 
Input: preorder = [3,9,20,15,7], inorder = [9,3,15,20,7]
Output: [3,9,20,null,null,15,7]
 

 示例 2: 

 
Input: preorder = [-1], inorder = [-1]
Output: [-1]
 

 

 提示: 

 
 1 <= preorder.length <= 3000 
 inorder.length == preorder.length 
 -3000 <= preorder[i], inorder[i] <= 3000 
 preorder 和 inorder 均无重复元素 
 inorder 均出现在 preorder 
 preorder 保证为二叉树的前序遍历序列 
 inorder 保证为二叉树的中序遍历序列 
 
 Related Topics 树 数组 哈希表 分治 二叉树 👍 1374 👎 0

*/

//leetcode submit region begin(Prohibit modification and deletion)
/**
 * Example:
 * var ti = TreeNode(5)
 * var v = ti.`val`
 * Definition for a binary tree node.
 * class TreeNode(var `val`: Int) {
 *     var left: TreeNode? = null
 *     var right: TreeNode? = null
 * }
 */
class BuildTree105 {
 fun buildTree(preorder: IntArray, inorder: IntArray): TreeNode? {
  if (preorder.isEmpty() || inorder.isEmpty())
   return null

  val rootValue = preorder[0]
  val root = TreeNode(preorder[0])
  val rootIndex = inorder.indexOf(rootValue)
  root.left = buildTree(preorder.sliceArray(IntRange(1, rootIndex)), inorder.sliceArray(IntRange(0, rootIndex-1)))
  root.right = buildTree(preorder.sliceArray(IntRange(1 + rootIndex, preorder.size-1)), inorder.sliceArray(IntRange(rootIndex + 1, inorder.size-1)))
  return root
 }
}
//leetcode submit region end(Prohibit modification and deletion)
