package com.zhe.leetcode.algorithms.easy;

/**
 * 706. Design HashMap
 *
 * @author zhangzhe
 */
public class DesignHashMapSolution {

    public static void main(String[] args) {
        MyHashMap hashMap = new MyHashMap();
        hashMap.put(1, 1);
        hashMap.put(101, 2);
        hashMap.put(2, 2);
        System.out.println(hashMap.get(1));
        System.out.println(hashMap.get(3));
        hashMap.put(2, 1);
        System.out.println(hashMap.get(2));
        hashMap.remove(2);
        System.out.println(hashMap.get(2));
    }

    static class MyHashMap {

        private int capacity;

        private Node[] nodes;

        /**
         * Initialize your data structure here.
         */
        public MyHashMap() {
            capacity = 100;
            nodes = new Node[capacity];
        }

        /**
         * value will always be non-negative.
         */
        public void put(int key, int value) {
            int index = key % capacity;
            Node node = nodes[index];
            if (node == null) {
                Node newNode = new Node(key, value);
                nodes[index] = newNode;
                return;
            }
            if (node.key == key) {
                node.value = value;
                return;
            }
            while (node.next != null) {
                if (node.next.key == key) {
                    node.next.value = value;
                    return;
                }
                node = node.next;
            }
            node.next = new Node(key, value);
        }

        /**
         * Returns the value to which the specified key is mapped, or -1 if this map contains no mapping for the key
         */
        public int get(int key) {
            int index = key % capacity;
            Node node = nodes[index];
            while (node != null) {
                if (node.key == key) {
                    return node.value;
                }
                node = node.next;
            }
            return -1;
        }

        /**
         * Removes the mapping of the specified value key if this map contains a mapping for the key
         */
        public void remove(int key) {
            int index = key % capacity;
            Node node = nodes[index];
            if (node == null) {
                return;
            }
            if (node.key == key) {
                nodes[index] = node.next;
                return;
            }
            Node prev = null;
            while (node != null && node.key != key) {
                prev = node;
                node = node.next;
            }
            if (prev.next == null) {
                return;
            }
            prev.next = prev.next.next;
        }

        private class Node {
            private int key;
            private int value;
            private Node next;

            private Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }
    }

}
