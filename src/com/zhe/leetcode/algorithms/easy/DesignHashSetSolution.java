package com.zhe.leetcode.algorithms.easy;

import java.util.Arrays;

/**
 * 705. Design HashSet
 *
 * @author zhangzhe
 */
public class DesignHashSetSolution {

	public static void main(String[] args) {
		MyHashSet hashSet = new MyHashSet();
		hashSet.add(1);
		hashSet.add(2);
		System.out.println(hashSet.contains(1));    // returns true
		System.out.println(hashSet.contains(3));    // returns false (not found)
		hashSet.add(2);
		System.out.println(hashSet.contains(2));    // returns true
		hashSet.remove(2);
		System.out.println(hashSet.contains(2));    // returns false (already removed)
	}

}

class MyHashSet {

	boolean[] arr = new boolean[100];

	public MyHashSet() {

	}

	public void add(int key) {
		if(key>=arr.length)
			extend(key);
		arr[key]=true;
	}

	public void remove(int key) {
		if(key>=arr.length)
			extend(key);
		arr[key]=false;
	}

	public boolean contains(int key) {
		if(key>=arr.length)
			return false;
		return arr[key];
	}

	public void extend(int key){
		arr= Arrays.copyOf(arr, key+2);
	}

}

