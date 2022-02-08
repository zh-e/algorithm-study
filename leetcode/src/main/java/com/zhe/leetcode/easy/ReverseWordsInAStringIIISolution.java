package com.zhe.leetcode.easy;

/**
 * 557. Reverse Words in a String III
 *
 * @author zhangzhe
 */
public class ReverseWordsInAStringIIISolution {

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWords(s));
    }

    private static String reverseWords(String s) {
        String[] strs = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (String str : strs) {
            sb.append(new StringBuilder(str).reverse()).append(" ");
        }
        return sb.toString().trim();
    }

}

