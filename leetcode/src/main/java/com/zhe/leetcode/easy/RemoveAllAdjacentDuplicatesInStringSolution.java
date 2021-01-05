package com.zhe.leetcode.easy;

import java.util.Stack;

/**
 * 1047. Remove All Adjacent Duplicates In String
 *
 * @author zhangzhe
 */
public class RemoveAllAdjacentDuplicatesInStringSolution {

    public static void main(String[] args) {
        String S = "abbaca";
        System.out.println(removeDuplicates(S));
    }

    private static String removeDuplicates(String S) {
        Stack<Character> stack = new Stack<>();
        for(char c : S.toCharArray()) {
            if(!stack.empty() && stack.peek() == c) {
                stack.pop();
            } else {
                stack.push(c);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(char c : stack) {
            sb.append(c);
        }
        return sb.toString();
    }

}