package com.zhe.leetcode.hard;

import com.zhe.leetcode.base.ListNode;

import java.util.Arrays;

public class MergeKListsSolution {

    public static void main(String[] args) {
        
        ListNode l1 = ListNode.init(1, 4, 5);
        ListNode l2 = ListNode.init(1, 3, 4);
        ListNode l3 = ListNode.init(2, 6);


        ListNode.toString(new MergeKListsSolution().mergeKLists(Arrays.asList(l1, l2, l3).toArray(new ListNode[0])));
    }


    public ListNode mergeKLists(ListNode[] lists) {
        if (lists == null || lists.length == 0) {
            return null;
        }

        ListNode ans = new ListNode(0);
        ans.next = lists[0];
        for(int i = 1; i < lists.length; i++) {
            ListNode node1 = ans.next;
            ListNode node2 = lists[i];

            ListNode head = new ListNode(0);
            ListNode tail = head;

            while (node1 != null && node2 != null) {
                if (node1.val <= node2.val) {
                    tail.next = node1;
                    node1 = node1.next;
                } else {
                    tail.next = node2;
                    node2 = node2.next;
                }
                tail = tail.next;
            }
            tail.next = node1 == null ? node2 : node1;
            ans.next = head.next;
        }

        return ans.next;
    }

}
