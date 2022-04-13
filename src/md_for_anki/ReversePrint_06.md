# jmvioffer
## 从尾到头打印链表
输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。

示例 1：

输入：head = [1,3,2]
输出：[2,3,1]
限制：

0 <= 链表长度 <= 10000

Related Topics
栈
递归
链表
双指针

👍 274
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