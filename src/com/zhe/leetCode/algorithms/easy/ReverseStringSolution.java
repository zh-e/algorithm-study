package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ArrayUtils;

/**
 * 344. Reverse String
 *
 * @author zhangzhe
 */
public class ReverseStringSolution {

    public static void main(String[] args) {
        //char[] s = {'h', 'e', 'l', 'l', 'o'};
        char[] s = {'H', 'a', 'n', 'w', 'a', 'h'};
        reverseString(s);
        ArrayUtils.printArry(s);
    }

    private static void reverseString(char[] s) {
        int len = s.length;
        for (int i = 0, n = len / 2; i < n; i++) {
            int j = len - 1 - i;
            char swap = s[i];
            s[i] = s[j];
            s[j] = swap;
        }
    }

}
