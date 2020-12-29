package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.CollectionUtils;
import com.zhe.leetcode.base.Node;

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
        Node node = Node.initRoot();
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

}
