package com.zhe.leetcode.algorithms.base;

/**
 * @author zhangzhe
 */
public class ListNode {

    public int val;
    public ListNode next;

    public ListNode(int x) {
        val = x;
    }

    public static ListNode init(int... num) {
        ListNode head = new ListNode(0);
        ListNode node = head;
        for (int n : num) {
            node.next = new ListNode(n);
            node = node.next;
        }
        return head.next;
    }

    public static void toString(ListNode head) {
        System.out.print(head.val);
        while (head.next != null) {
            System.out.print(" --> ");
            System.out.print(head.next.val);
            head = head.next;
        }
    }

}
