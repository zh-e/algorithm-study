package com.zhe.leetCode.algorithms.medium;

/**
 * 字符串"PAYPALISHIRING"在给定行数上以Z字形图案写入
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * Explanation:
 *
 * P      I        N
 * A   L S    I  G
 * Y A   H R
 * P      I
 * @author zhangzhe
 */
public class ZigZagConversionSolution {

    public static void main(String[] args) {

        String s = "PAYPALISHIRING";
        System.out.println(convert(s, 4));
    }

    public static String convert(String s, int numRows) {

        if(numRows == 1) {
            return s;
        }

        StringBuilder sb = new StringBuilder();
        int cycleLen = 2 * numRows - 2;
        int n = s.length();
        for(int i = 0; i < numRows; i ++) {
            for(int j = 0; j + i < n; j += cycleLen)  {
                sb.append(s.charAt(j + i));
                if (i != 0 && i != numRows - 1 && j + cycleLen - i < n) {
                    sb.append(s.charAt(j + cycleLen - i));
                }
            }
        }

        return sb.toString();
    }
}
