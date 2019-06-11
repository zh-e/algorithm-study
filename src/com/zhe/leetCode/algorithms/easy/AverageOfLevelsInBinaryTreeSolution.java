package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.CollectionUtils;
import com.zhe.leetCode.algorithms.base.TreeNode;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 637. Average of Levels in Binary Tree
 *
 * @author zhangzhe
 */
public class AverageOfLevelsInBinaryTreeSolution {

    public static void main(String[] args) {
        TreeNode root = initRoot();
        CollectionUtils.printList(averageOfLevels(root));
    }

    private static List<Double> averageOfLevels(TreeNode root) {
        List<Double> ans = new ArrayList<>();
        Deque<TreeNode> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            double sum = 0;
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                TreeNode node = queue.poll();
                if (node != null) {
                    sum += node.val;
                    if (node.left != null) {
                        queue.offer(node.left);
                    }
                    if(node.right != null) {
                        queue.offer(node.right);
                    }
                }
            }
            ans.add(sum / len);
        }
        return ans;
    }

    private static TreeNode initRoot() {
        TreeNode root = new TreeNode(3);
        TreeNode node1 = new TreeNode(9);
        TreeNode node2 = new TreeNode(20);
        TreeNode node3 = new TreeNode(15);
        TreeNode node4 = new TreeNode(7);

        root.left = node1;
        root.right = node2;

        node2.left = node3;
        node2.right = node4;

        return root;
    }

}
