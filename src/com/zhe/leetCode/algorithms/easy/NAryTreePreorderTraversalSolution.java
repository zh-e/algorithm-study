package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.CollectionUtils;
import com.zhe.leetCode.algorithms.base.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 589. N-ary Tree Preorder Traversal
 *
 * @author zhangzhe
 */
public class NAryTreePreorderTraversalSolution {

    public static void main(String[] args) {
        Node node = initRoot();
        List<Integer> res = preOrder1(node);
        CollectionUtils.printList(res);
        res = preorder(node);
        CollectionUtils.printList(res);
    }

    /**
     * 递归实现
     */
    private static List<Integer> preorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }

        res.add(root.val);
        if (root.children != null) {
            for (Node node : root.children) {
                res.addAll(preorder(node));
            }
        }
        return res;
    }

    /**
     * 非递归实现
     */
    private static List<Integer> preOrder1(Node root) {
        Stack<Node> stack = new Stack<>();
        stack.push(root);
        List<Integer> res = new ArrayList<>();
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            res.add(node.val);

            if (node.children != null) {
                for (int i = node.children.size() - 1; i >= 0; i--) {
                    stack.add(node.children.get(i));
                }
            }
        }
        return res;
    }


    private static Node initRoot() {
        Node root = new Node(1);
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        List<Node> children = new ArrayList<>();
        children.add(node1);
        children.add(node2);
        children.add(node3);

        root.children = children;

        children = new ArrayList<>();
        children.add(node4);
        children.add(node5);

        node1.children = children;

        return root;
    }


}
