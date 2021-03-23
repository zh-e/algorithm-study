package com.zhe.leetcode.easy;


/**
 * 709 字符串格式化为全小写
 *
 * @author zhangzhe
 */
public class ToLowerCaseSolution {

    public static void main(String[] args) {
        System.out.println(toLowerCase("al&phaBET"));
    }

    private static String toLowerCase(String str) {

        if (str == null || str.trim().length() <= 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();

        for (char c : str.toCharArray()) {
            if (c >= 'A' && c <= 'Z') {
                sb.append((char) (c + 32));
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

}