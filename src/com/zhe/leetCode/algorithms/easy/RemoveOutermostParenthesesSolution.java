package com.zhe.leetCode.algorithms.easy;

/**
 * 1021 去除外部括号
 * @author zhangzhe
 */
public class RemoveOutermostParenthesesSolution {

    public static void main(String[] args) {
        System.out.println(removeOuterParentheses("(()())(())(()(()))"));
        //System.out.println(removeOuterParentheses("(()(()))"));
    }

    private static String removeOuterParentheses(String S) {
        StringBuilder res = new StringBuilder();
        int left = 0;
        for(char c : S.toCharArray()) {
            if (c == '(') {
                ++left;
            }
            if (left > 1) {
                res.append(c);
            }
            if (c == ')') {
                left--;
            }

        }
        return res.toString();
    }

}
