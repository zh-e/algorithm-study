package com.zhe.leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 205.同构字符串
 */
public class IsIsomorphicSolution {

    public static void main(String[] args) {
        String s = "egg";
        String t = "add";
        System.out.println( isIsomorphic(s, t));
    }

    public static boolean isIsomorphic(String s, String t) {
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        Map<Character, Character> map1 = new HashMap<>();
        Map<Character, Character> map2 = new HashMap<>();
        for (int i = 0, n = s1.length; i < n; i++) {
            char s11 = s1[i], t11 = t1[i];
            if (map1.containsKey(s11) && map1.get(s11) != t11) {
                return false;
            }
            if (map2.containsKey(t11) && map2.get(t11) != s11) {
                return false;
            }
            map1.put(s11, t11);
            map2.put(t11, s11);
        }
        return true;
    }

}
