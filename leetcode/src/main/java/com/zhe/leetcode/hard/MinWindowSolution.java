package com.zhe.leetcode.hard;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 76. 最小覆盖子串
 * 给你一个字符串 s 、一个字符串 t 。返回 s 中涵盖 t 所有字符的最小子串
 * 。如果 s 中不存在涵盖 t 所有字符的子串，则返回空字符串 "" 。
 * <p>
 * 注意：
 * <p>
 * 对于 t 中重复字符，我们寻找的子字符串中该字符数量必须不少于 t 中该字符数量。
 * 如果 s 中存在这样的子串，我们保证它是唯一的答案。
 * <p>
 * <p>
 * 示例 1：
 * <p>
 * 输入：s = "ADOBECODEBANC", t = "ABC"
 * 输出："BANC"
 * 解释：最小覆盖子串 "BANC" 包含来自字符串 t 的 'A'、'B' 和 'C'。
 * 示例 2：
 * <p>
 * 输入：s = "a", t = "a"
 * 输出："a"
 * 解释：整个字符串 s 是最小覆盖子串。
 * 示例 3:
 * <p>
 * 输入: s = "a", t = "aa"
 * 输出: ""
 * 解释: t 中两个字符 'a' 均应包含在 s 的子串中，
 * 因此没有符合条件的子字符串，返回空字符串。
 */
public class MinWindowSolution {

    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(new MinWindowSolution().minWindow(s, t));
    }

    Map<Character, Integer> ori = new HashMap<>();
    Map<Character, Integer> cnt = new HashMap<>();

    public String minWindow(String s, String t) {
        if (s.length() < t.length()) {
            return "";
        }
        for (char c : t.toCharArray()) {
            int val = ori.getOrDefault(c, 0);
            ori.put(c, val + 1);
        }
        int l = 0, r = -1;
        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
        int sLen = s.length();
        while (r < sLen) {
            r++;
            if (r < sLen && ori.containsKey(s.charAt(r))) {
                cnt.put(s.charAt(r), cnt.getOrDefault(s.charAt(r), 0) + 1);
            }
            while (check() && l <= r) {
                if (r - l + 1 < len) {
                    len = r - l + 1;
                    ansL = l;
                    ansR = l + len;
                }
                if (ori.containsKey(s.charAt(l))) {
                    cnt.put(s.charAt(l), cnt.getOrDefault(s.charAt(l), 0) - 1);
                }
                l++;
            }
        }
        return ansL == -1 ? "" : s.substring(ansL, ansR);
    }

    public boolean check() {
        for (Map.Entry<Character, Integer> entry : ori.entrySet()) {
            char key = entry.getKey();
            int val = entry.getValue();
            if (cnt.getOrDefault(key, 0) < val) {
                return false;
            }
        }
        return true;
    }


//
//    public String minWindow(String s, String t) {
//        int tLen = t.length();
//        for (int i = 0; i < tLen; i++) {
//            char c = t.charAt(i);
//            ori.put(c, ori.getOrDefault(c, 0) + 1);
//        }
//        int l = 0, r = -1;
//        int len = Integer.MAX_VALUE, ansL = -1, ansR = -1;
//        int sLen = s.length();
//        while (r < sLen) {
//            ++r;
//            if (r < sLen && ori.containsKey(s.charAt(r))) {
//                cnt.put(s.charAt(r), cnt.getOrDefault(s.charAt(r), 0) + 1);
//            }
//            while (check() && l <= r) {
//                if (r - l + 1 < len) {
//                    len = r - l + 1;
//                    ansL = l;
//                    ansR = l + len;
//                }
//                if (ori.containsKey(s.charAt(l))) {
//                    cnt.put(s.charAt(l), cnt.getOrDefault(s.charAt(l), 0) - 1);
//                }
//                ++l;
//            }
//        }
//        return ansL == -1 ? "" : s.substring(ansL, ansR);
//    }
//


}
