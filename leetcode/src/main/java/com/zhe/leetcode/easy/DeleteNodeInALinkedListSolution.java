package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.ListNode;

/**
 * 237. Delete Node in a Linked List
 *
 * @author zhangzhe
 */
public class DeleteNodeInALinkedListSolution {

	public static void main(String[] args) {

	}

	private static void deleteNode(ListNode node) {
		node.val = node.next.val;
		node.next = node.next.next;
	}

}
