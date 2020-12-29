package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.ArrayUtils;

/**
 * 806. Number of Lines To Write String
 *
 * @author zhangzhe
 */
public class NumberOfLinesToWriteStringSolution {

    public static void main(String[] args) {
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
        String S = "bbbcccdddaaa";
        ArrayUtils.printArry(numberOfLines(widths, S));
    }

    private static int[] numberOfLines(int[] widths, String S) {
        int line = 1, lineLen = 0;
        for (char c : S.toCharArray()) {
            int charLen = widths[c - 'a'];
            if (lineLen + charLen > 100) {
                line++;
                lineLen = charLen;
            } else {
                lineLen += charLen;
            }
        }
        return new int[]{line, lineLen};
    }

}
