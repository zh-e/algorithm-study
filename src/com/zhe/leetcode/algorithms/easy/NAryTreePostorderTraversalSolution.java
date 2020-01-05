package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.CollectionUtils;
import com.zhe.leetcode.algorithms.base.Node;

import java.util.ArrayList;
import java.util.List;

/**
 * 590. N-ary Tree Postorder Traversal
 *
 * @author zhangzhe
 */
public class NAryTreePostorderTraversalSolution {

    public static void main(String[] args) {
        Node root = Node.initRoot();
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

}
