# jmvioffer
## 重建二叉树
输入某二叉树的前序遍历和中序遍历的结果，请构建该二叉树并返回其根节点。

假设输入的前序遍历和中序遍历的结果中都不含重复的数字。

给定：
前序遍历是：[3, 9, 20, 15, 7]
中序遍历是：[9, 3, 15, 20, 7]

返回：[3, 9, 20, null, null, 15, 7, null, null, null, null]
返回的二叉树如下所示：
    3
   / \
  9  20
    /  \
   15   7
限制：

0 <= 节点个数 <= 5000

注意：本题与主站 105 题重复：https://leetcode-cn.com/problems/construct-binary-tree-from-preorder-and-inorder-traversal/

Related Topics
树
数组
哈希表
分治
二叉树

👍 747
👎 0

%

```java
    private static ListNode processList(ArrayList<Integer> list, ListNode head) {
        if (head.next == null) {
            list.add(head.val);
            return head;
        }

        //head =1   ListNode temp = processList(result,head.next);
        ListNode temp = processList(list, head.next);
        list.add(head.val); 
        //题意中无需翻转链表，多此一举
        head.next.next = head;
        head.next = null;
        return temp;
    }
    }
```

```kotlin
fun main() {
    val head = ListNode(2)
    head.next = ListNode(3)
    head.next!!.next = ListNode(34)
    head.next!!.next!!.next = ListNode(43)
    reversePrint(head)
}

class ListNode(var `val`: Int) {
    var next: ListNode? = null
}

fun reversePrint(head: ListNode?): IntArray {
    if (head == null) {
        return intArrayOf()
    }
    val resList = ArrayList<Int>()
    printListFromTailToHead(head, resList)
    return resList.toIntArray()
}

private fun printListFromTailToHead(
    node: ListNode?,
    res: MutableList<Int>
) {
    if (node == null) {
        return
    }
    if (node.next != null) {
        printListFromTailToHead(node.next, res)
    }
    res.add(node.`val`)
}

```