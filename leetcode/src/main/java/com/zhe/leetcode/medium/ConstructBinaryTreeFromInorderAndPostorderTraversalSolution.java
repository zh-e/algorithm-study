package com.zhe.leetcode.medium;

import com.zhe.leetcode.base.TreeNode;

import java.util.Arrays;

/**
 * 106. Construct Binary Tree from Inorder and Postorder Traversal
 */
public class ConstructBinaryTreeFromInorderAndPostorderTraversalSolution {

    public static void main(String[] args) {
//
//        输入：inorder = [9,3,15,20,7], postorder = [9,15,7,20,3]
//        输出：[3,9,20,null,null,15,7]

        ConstructBinaryTreeFromInorderAndPostorderTraversalSolution solution = new ConstructBinaryTreeFromInorderAndPostorderTraversalSolution();

        int[] inorder = new int[]{9, 3, 15, 20, 7};
        int[] postorder = new int[]{9, 15, 7, 20, 3};

        TreeNode node = solution.buildTree(inorder, postorder);

        TreeNode.layerTraver(node);

    }

    public TreeNode buildTree(int[] inorder, int[] postorder) {
        if (inorder.length ==0 || postorder.length == 0) {
            return null;
        }

        TreeNode root = new TreeNode(postorder[postorder.length - 1]);

        for (int i = 0; i < inorder.length; i++) {
            if (postorder[postorder.length - 1] == inorder[i]) {
                int[] inorderLeft = Arrays.copyOfRange(inorder, 0, i);
                int[] inorderRight = Arrays.copyOfRange(inorder, i + 1, inorder.length);

                int[] postorderLeft = Arrays.copyOfRange(postorder, 0, i);
                int[] postorderRight = Arrays.copyOfRange(postorder, i, postorder.length - 1);

                root.left = buildTree(inorderLeft, postorderLeft);
                root.right = buildTree(inorderRight, postorderRight);
                break;
            }
        }
        return root;
    }


}
