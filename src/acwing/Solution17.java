package acwing;

import java.util.ArrayList;
import java.util.List;

/**
 * Definition for singly-linked list.
 * class ListNode {
 * int val;
 * ListNode next;
 * ListNode(int x) { val = x; }
 * }
 */
class Solution17 {

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
        head.next.next = head;
        head.next = null;
        return temp;
    }
}

class ListNode {
    int val;
    ListNode next;

    ListNode(int x) {
        val = x;
    }
}