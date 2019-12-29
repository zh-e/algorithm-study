package com.zhe.leetCode.algorithms.easy;

import java.util.Stack;

/**
 * 20. Valid Parentheses
 *
 * @author zhangzhe
 */
public class ValidParenthesesSolution {

	public static void main(String[] args) {
		System.out.println(isValid("([)]"));
	}


	public static boolean isValid(String s) {

		Stack<Character> strStack = new Stack<>();
		int head;
		for (char c : s.toCharArray()) {
			if (strStack.empty()) {
				strStack.push(c);
				continue;
			}
			head = strStack.peek() - c;
			if (head == 1 || head == -1 || head == 2 || head == -2) {
				strStack.pop();
				continue;
			}
			strStack.push(c);
		}
		return strStack.empty();
	}

}
