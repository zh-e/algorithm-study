package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.CollectionUtils;
import com.zhe.leetCode.algorithms.base.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N-ary Tree Postorder Traversal
 *
 * @author zhangzhe
 */
public class NAryTreePostorderTraversalSolution {

    public static void main(String[] args) {
        Node root = initRoot();
        List<Integer> res = postorder(root);
        CollectionUtils.printList(res);
    }

    private static List<Integer> postorder(Node root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) {
            return res;
        }
        if (root.children != null) {
            for (Node node : root.children) {
                res.addAll(postorder(node));
            }
        }
        res.add(root.val);
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
