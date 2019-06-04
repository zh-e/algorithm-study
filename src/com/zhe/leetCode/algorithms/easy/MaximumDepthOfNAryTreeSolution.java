package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 559. Maximum Depth of N-ary Tree
 *
 * @author zhangzhe
 */
public class MaximumDepthOfNAryTreeSolution {

    public static void main(String[] args) {
        Node root = initRoot();
        System.out.println(maxDepth(root));
    }

    private static int maxDepth(Node root) {
        int depth = 1;
        if (root == null) {
            return 0;
        }
        if (root.children == null) {
            return depth;
        }
        for (Node n : root.children) {
            depth = Math.max(depth, maxDepth(n) + 1);
        }
        return depth;
    }

    private static Node initRoot() {
        Node root = new Node(1);
        Node node1 = new Node(2);
        Node node2 = new Node(3);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        List<Node> children = new ArrayList<>();
        root.children = children;
        children.add(node1);
        children.add(node2);
        children.add(node3);

        children = new ArrayList<>();
        node1.children = children;
        children.add(node4);
        children.add(node5);

        return root;
    }

}
