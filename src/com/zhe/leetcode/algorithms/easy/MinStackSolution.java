package com.zhe.leetcode.algorithms.easy;

import java.util.Stack;

/**
 * 155. Min Stack
 *
 * @author zhangzhe
 */
public class MinStackSolution {

	public static void main(String[] args) {
		MinStack minStack = new MinStack();
		minStack.push(-2);
		minStack.push(0);
		minStack.push(-3);
		System.out.println(minStack.getMin());
		minStack.pop();
		minStack.top();
		System.out.println(minStack.getMin());
	}

	static class MinStack {

		private Stack<Integer> cache;
		private Stack<Integer> min;

		public MinStack() {
			cache = new Stack<>();
			min = new Stack<>();
		}

		public void push(int x) {
			cache.push(x);
			if (min.isEmpty() || min.peek() >= x) {
				min.push(x);
			}
		}

		public void pop() {
			if (cache.isEmpty()) {
				return;
			}
			if (min.peek().equals(cache.pop())) {
				min.pop();
			}
		}

		public int top() {
			return cache.peek();
		}

		public int getMin() {
			return min.peek();
		}

	}

}
