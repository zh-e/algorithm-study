package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 872. Leaf-Similar Trees
 *
 * @author zhangzhe
 */
public class LeafSimilarTreesSolution {

    public static void main(String[] args) {

    }

    private static boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaf1 = new ArrayList<>();
        List<Integer> leaf2 = new ArrayList<>();
        getLeafValue(root1, leaf1);
        getLeafValue(root2, leaf2);
        return leaf1.equals(leaf2);
    }

    private static void getLeafValue(TreeNode node, List<Integer> leafs) {
        if (node == null) {
            return;
        }
        if (node.left == null && node.right == null) {
            leafs.add(node.val);
        }
        getLeafValue(node.left, leafs);
        getLeafValue(node.right, leafs);
    }

}
