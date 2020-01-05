package com.zhe.leetcode.algorithms.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 824. Goat Latin
 *
 * @author zhangzhe
 */
public class GoatLatinSolution {

    public static void main(String[] args) {
        String S = "I speak Goat Latin";
        System.out.println(toGoatLatin(S));
    }

    private static String toGoatLatin(String S) {
        Set<Character> vowel = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        String[] strs = S.split(" ");
        StringBuilder ans = new StringBuilder();
        int t = 1;
        for(String s : strs) {
            char first = s.charAt(0);
            if(vowel.contains(first)) {
                ans.append(s);
            } else {
                ans.append(s.substring(1)).append(s.substring(0, 1));
            }
            ans.append("ma");
            for(int i = 0; i < t; i++) {
                ans.append("a");
            }
            t++;
            ans.append(" ");
        }
        return ans.toString().trim();
    }

}
