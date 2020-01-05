package com.zhe.leetcode.algorithms.easy;

import java.util.Stack;

/**
 * 844. Backspace String Compare
 */
public class BackspaceStringCompareSolution {

    public static void main(String[] args) {
        String s = "y#fo##f";
        String t = "y#f#o##f";
        System.out.println(backspaceCompare(s, t));
    }

    public static boolean backspaceCompare(String S, String T) {
        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        for (char c : S.toCharArray()) {
            if (c == '#') {
                if (!stack1.empty()) {
                    stack1.pop();
                }
            } else {
                stack1.push(c);
            }
        }
        for (char c : T.toCharArray()) {
            if (c == '#') {
                if (!stack2.empty()) {
                    stack2.pop();
                }
            } else {
                stack2.push(c);
            }
        }
        if (stack1.size() != stack2.size()) {
            return false;
        }

        while (!stack1.empty() || !stack2.empty()) {
            char c1 = stack1.pop();
            char c2 = stack2.pop();
            if (c1 != c2) {
                return false;
            }
        }
        return true;
    }

}
