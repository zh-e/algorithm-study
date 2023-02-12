package com.zhe.leetcode.easy;

/**
 * 917. Reverse Only Letters
 *
 * @author zhangzhe
 */
public class ReverseOnlyLettersSolution {

    public static void main(String[] args) {
        String s = "a-bC!-dEf-ghIj";
        //j-Ih!-gfE-dCba
        System.out.println(reverseOnlyLetters(s));
    }

    private static String reverseOnlyLetters(String S) {
        StringBuilder sb = new StringBuilder();
        char[] chars = S.toCharArray();
        for (int i = 0, len = chars.length, j = len - 1; i < len; i++) {
            if (!isLetter(chars[i])) {
                sb.append(chars[i]);
                continue;
            }
            while (!isLetter(chars[j])) {
                j--;
            }
            sb.append(chars[j--]);
        }
        return sb.toString();
    }

    private static boolean isLetter(char c) {
        return (c >= 'A' && c <= 'Z') || (c >= 'a' && c <= 'z');
    }

}
