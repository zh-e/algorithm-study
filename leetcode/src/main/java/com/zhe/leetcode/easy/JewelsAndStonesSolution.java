package com.zhe.leetcode.easy;

/**
 * 771
 *
 * @author zhangzhe
 */
public class JewelsAndStonesSolution {

    public static void main(String[] args) {
        String j = "aA";
        String s = "aAAAccska";
        System.out.println(numJewelsInStones(j, s));
    }

    private static int numJewelsInStones(String J, String S) {
        int n = 0;
        for(int i = 0, len = S.length(); i < len; i++) {
            if(J.indexOf(S.charAt(i)) != -1) {
                ++n;
            }
        }
        return n;
    }

}
