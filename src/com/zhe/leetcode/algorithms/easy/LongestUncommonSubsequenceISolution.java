package com.zhe.leetcode.algorithms.easy;

/**
 * 521. Longest Uncommon Subsequence I
 *
 * @author zhangzhe
 */
public class LongestUncommonSubsequenceISolution {

    public static void main(String[] args) {
        String a = "aba";
        String b = "cdc";
        System.out.println(findLUSlength(a, b));
    }

    private static int findLUSlength(String a, String b) {

        if(a.equals(b)) {
            return -1;
        }
        return Math.max(a.length(), b.length());

    }

}
