package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.TreeNode;

/**
 * @author zhangzhe
 */
public class RangeSumOfBSTSolution {

    private int sum = 0;

    public static void main(String[] args) {
        //[10,5,15,3,7,null,18]
        //root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10 -23
        TreeNode node = initTreeNode();
        System.out.println(rangeSumBST(node, 6, 10));
    }

    private static int rangeSumBST(TreeNode root, int L, int R) {
        if(root == null) {
            return 0;
        }

        if(root.val >= L && root.val <= R) {
            return root.val + rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        } else {
            return rangeSumBST(root.left, L, R) + rangeSumBST(root.right, L, R);
        }
    }

    private static TreeNode initTreeNode() {
        TreeNode node = new TreeNode(10);
        TreeNode node1 = new TreeNode(5);
        TreeNode node2 = new TreeNode(15);
        TreeNode node3 = new TreeNode(3);
        TreeNode node4 = new TreeNode(7);
        TreeNode node5 = new TreeNode(13);
        TreeNode node6 = new TreeNode(18);
        TreeNode node7 = new TreeNode(1);
        TreeNode node8 = new TreeNode(6);

        node.left = node1;
        node.right = node2;
        node1.left = node3;
        node1.right =node4;
        node2.left = node5;
        node2.right = node6;
        node3.left = node7;
        node4.left = node8;
        return node;
    }

}
