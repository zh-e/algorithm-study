package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ListNode;

/**
 * 206. Reverse Linked List
 *
 * @author zhangzhe
 */
public class ReverseLinkedListSolution {

    public static void main(String[] args) {
        ListNode root = init();
        ListNode node = reverseList(root);

    }

    private static ListNode reverseList(ListNode head) {
        ListNode prev = null;
        ListNode curr = head;
        while (curr != null) {
            ListNode nextTemp = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextTemp;
        }
        return prev;
    }

    private static ListNode init() {
        //1->2->3->4->5->NULL
        ListNode root = new ListNode(1);
        ListNode node1 = new ListNode(2);
        ListNode node2 = new ListNode(3);
        ListNode node3 = new ListNode(4);
        ListNode node4 = new ListNode(5);
        root.next = node1;
        node1.next = node2;
        node2.next = node3;
        node3.next = node4;
        return root;
    }

}
