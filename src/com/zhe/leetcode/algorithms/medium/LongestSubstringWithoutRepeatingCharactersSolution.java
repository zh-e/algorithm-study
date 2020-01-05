package com.zhe.leetcode.algorithms.medium;

import java.util.HashSet;
import java.util.Set;

/**
 * 给定一个字符串，找到最长子字符串的长度而不重复字符
 * 输入：“abcabcbb”
 * 输出：3
 * 说明：答案是"abc"，长度为3。
 *
 * @author zhangzhe
 */
public class LongestSubstringWithoutRepeatingCharactersSolution {

    public static void main(String[] args) {
        String s = "pwwkew";
        System.out.println(lengthOfLongestSubstring(s));
        s = "abcabcbb";
        System.out.println(lengthOfLongestSubstring(s));
    }

    public static int lengthOfLongestSubstring(String s) {

        int size = s.length();
        Set<Character> set = new HashSet<>();

        int result = 0, i = 0, j = 0;

        while (i < size && j < size) {
            if (!set.contains(s.charAt(j))) {
                set.add(s.charAt(j++));
                result = Math.max(result, j - i);
            } else {
                set.remove(s.charAt(i++));
            }
        }

        return result;
    }
}
