package acwing;

import java.util.ArrayList;
import java.util.List;
/**
 * 输入一个链表的头结点，按照 从尾到头 的顺序返回节点的值。
 *
 * 返回的结果用数组存储。
 *
 * 数据范围
 * 0≤ 链表长度 ≤1000。
 *
 * 样例
 * 输入：[2, 3, 5]
 * 返回：[5, 3, 2]
 */

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
public class ProcessList_17 {
    static class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
        }
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(2);
        head.next = new ListNode(3);
        head.next.next = new ListNode(34);
        head.next.next.next = new ListNode(43);
        printListReversingly(head);
    }

    public static int[] printListReversingly(ListNode head) {
        if (head == null) {
            return new int[]{};
        }
        if (head.next == null) {
            return new int[]{head.val};
        }
        ArrayList<Integer> list = new ArrayList<>();
        processList(list, head);
        int[] result = new int[list.size()];
        for (int i = 0; i < list.size(); i++) {
            result[i] = list.get(i);
        }
        return result;
    }

    // 1,2
    private static ListNode processList(ArrayList<Integer> list, ListNode head) {
        if (head.next == null) {
            list.add(head.val);
            return head;
        }

        //head =1   ListNode temp = processList(result,head.next);
        ListNode temp = processList(list, head.next);
        list.add(head.val);
        ////题意中无需翻转链表，多此一举
        head.next.next = head;
        head.next = null;
        return temp;
    }


}

