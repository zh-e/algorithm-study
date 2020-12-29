package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.TreeNode;

/**
 * 617. Merge Two Binary Trees
 * @author zhangzhe
 */
public class MergeTwoBinaryTreesSolution {

    public static void main(String[] args) {
        TreeNode t1 = initT1();
        TreeNode t2 = initT2();
        TreeNode.layerTraver(mergeTrees(t1, t2));
    }

    private static TreeNode mergeTrees(TreeNode t1, TreeNode t2) {
        if (t1 == null && t2 == null) {
            return null;
        }
        int value = (t1 == null ? 0 : t1.val) + (t2 == null ? 0 : t2.val);
        TreeNode node = new TreeNode(value);
        node.left = mergeTrees(t1 == null ? t1 : t1.left, t2 == null ? t2 : t2.left);
        node.right = mergeTrees(t1 == null ? t1 : t1.right, t2 == null ? t2 : t2.right);
        return node;
    }

    private static TreeNode initT1() {
        TreeNode n1 = new TreeNode(1);
        TreeNode n2 = new TreeNode(3);
        TreeNode n3 = new TreeNode(2);
        TreeNode n4 = new TreeNode(5);

        n1.left = n2;
        n1.right = n3;
        n2.left = n4;

        return n1;
    }

    private static TreeNode initT2() {
        TreeNode n1 = new TreeNode(2);
        TreeNode n2 = new TreeNode(1);
        TreeNode n3 = new TreeNode(3);
        TreeNode n4 = new TreeNode(4);
        TreeNode n5 = new TreeNode(7);

        n1.left = n2;
        n1.right = n3;
        n2.right = n4;
        n3.right = n5;

        return n1;
    }

}
