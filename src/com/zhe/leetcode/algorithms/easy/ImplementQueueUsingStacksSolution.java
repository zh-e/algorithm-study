package com.zhe.leetcode.algorithms.easy;

import java.util.Stack;

/**
 * 232. Implement Queue using Stacks
 * @author zhangzhe
 */
public class ImplementQueueUsingStacksSolution {

    public static void main(String[] args) {
		MyQueue queue = new MyQueue();
		queue.push(1);
		queue.push(2);
		System.out.println(queue.peek());
		System.out.println(queue.pop());
		System.out.println(queue.empty());
    }

    static class MyQueue {

        private Stack<Integer> cache;
        private Stack<Integer> transfer;

        /**
         * Initialize your data structure here.
         */
        public MyQueue() {
            cache = new Stack<>();
            transfer = new Stack<>();
        }

        /**
         * Push element x to the back of queue.
         */
        public void push(int x) {
            while (!cache.empty()) {
                transfer.push(cache.pop());
            }
            transfer.push(x);
            while (!transfer.empty()) {
                cache.push(transfer.pop());
            }
        }

        /**
         * Removes the element from in front of queue and returns that element.
         */
        public int pop() {
            return cache.pop();
        }

        /**
         * Get the front element.
         */
        public int peek() {
            return cache.peek();
        }

        /**
         * Returns whether the queue is empty.
         */
        public boolean empty() {
            return cache.empty();
        }
    }

}
