package com.zhe.leetcode.algorithms.base;

import java.util.ArrayList;
import java.util.List;

/**
 * @author zhangzhe
 */
public class Node {

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int val) {
        this.val = val;
    }

    public Node(int val, List<Node> children) {
        this.val = val;
        this.children = children;
    }

    public static Node initRoot() {
        Node root = new Node(1);
        Node node1 = new Node(3);
        Node node2 = new Node(2);
        Node node3 = new Node(4);
        Node node4 = new Node(5);
        Node node5 = new Node(6);

        List<Node> children = new ArrayList<>();
        root.children = children;
        children.add(node1);
        children.add(node2);
        children.add(node3);

        children = new ArrayList<>();
        children.add(node4);
        children.add(node5);
        node1.children = children;

        return root;
    }

}
