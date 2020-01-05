package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.ListNode;

/**
 * 876. Middle of the Linked List
 *
 * @author zhangzhe
 */
public class MiddleOfTheLinkedListSolution {

    public static void main(String[] args) {
        ListNode head = initHead();
        System.out.println(middleNode(head).val);
    }

    private static ListNode middleNode(ListNode head) {
        ListNode res = head;
        while (head != null && head.next != null) {
            head = head.next.next;
            res = res.next;
        }
        return res;
    }

    private static ListNode initHead() {
        ListNode head = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        ListNode node5 = new ListNode(6);

        head.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        //node4.next = node5;

        return head;
    }

}
