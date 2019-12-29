package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ListNode;

/**
 * 21. Merge Two Sorted Lists
 * @author zhangzhe
 */
public class MergeTwoSortedListsSolution {

	public static void main(String[] args) {
		ListNode l1 = ListNode.init(1, 2, 4);
		ListNode l2 = ListNode.init(1, 3, 4);
		ListNode result = mergeTwoLists(l1, l2);
		ListNode.toString(result);
	}

	public static ListNode mergeTwoLists(ListNode l1, ListNode l2) {
		ListNode head = new ListNode(0);
		ListNode node = head;
		while (l1 != null || l2 != null) {
			if (l1 != null && l2 != null) {
				if (l1.val <= l2.val) {
					node.next = new ListNode(l1.val);
					l1 = l1.next;
					node = node.next;
				} else {
					node.next = new ListNode(l2.val);
					l2 = l2.next;
					node = node.next;
				}
				continue;
			}

			if (l1 != null) {
				node.next = new ListNode(l1.val);
				l1 = l1.next;
				node = node.next;
			}

			if (l2 != null) {
				node.next = new ListNode(l2.val);
				l2 = l2.next;
				node = node.next;
			}
		}
		return head.next;
	}



}
