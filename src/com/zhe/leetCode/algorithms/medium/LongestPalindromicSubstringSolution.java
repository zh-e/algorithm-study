package com.zhe.leetCode.algorithms.medium;

/**
 * 给定一个字符串s，找到s中最长的回文子字符串。 您可以假设s的最大长度为1000。
 * Input: "cbbd"
 * Output: "bb"
 *
 * @author zhangzhe
 */
public class LongestPalindromicSubstringSolution {

    public static void main(String[] args) {
        String s = "bb";
        System.out.println(longestPalindrome(s));
    }


    public static String longestPalindrome(String s) {

        if(s.length() < 1) {
            return "";
        }

        int start = 0, end = 0;
        for (int i = 0, size = s.length(); i < size; i++) {
            int len1 = queryLongestStrFromChar(s, i, i);
            int len2 = queryLongestStrFromChar(s, i, i + 1);
            int len = len1 > len2 ? len1 : len2;

            if (len > (end - start)) {
                start = i - (len - 1) / 2;
                end = i + len / 2;
            }

        }
        return s.substring(start, end + 1);
    }

    private static int queryLongestStrFromChar(String s, int left, int right) {
        int l = left, r = right;
        while (l >= 0 && r < s.length() && s.charAt(l) == s.charAt(r)) {
            l--;
            r++;
        }
        return r - l - 1;
    }

}
