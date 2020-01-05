package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.Node;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

/**
 * 429. N-ary Tree Level Order Traversal
 *
 * @author zhangzhe
 */
public class NAryTreeLevelOrderTraversalSolution {

    public static void main(String[] args) {
        Node node = Node.initRoot();
        System.out.println(levelOrder(node));
    }

    private static List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> ans = new ArrayList<>();
        if(root == null) {
            return ans;
        }

        Deque<Node> queue = new ArrayDeque<>();
        queue.add(root);
        while (queue.size() > 0) {
            List<Integer> curLevel = new ArrayList<>();
            int len = queue.size();
            for (int i = 0; i < len; i++) {
                Node node = queue.poll();
                if (node != null) {
                    curLevel.add(node.val);
                    if (node.children != null) {
                        for (Node c : node.children) {
                            queue.offer(c);
                        }
                    }
                }
            }
            ans.add(curLevel);
        }
        return ans;
    }

}
