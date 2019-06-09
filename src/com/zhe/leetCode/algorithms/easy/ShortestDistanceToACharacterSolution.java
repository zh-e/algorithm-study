package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.ArrayUtils;

/**
 * 821. Shortest Distance to a Character
 *
 * @author zhangzhe
 */
public class ShortestDistanceToACharacterSolution {

    public static void main(String[] args) {
        String S = "loveleetcode";
        char C = 'e';
        ArrayUtils.printArry(shortestToChar(S, C));
    }

    private static int[] shortestToChar(String S, char C) {
        int n = S.length();
        int[] ans = new int[S.length()];
        int prev = Integer.MIN_VALUE / 2;

        for (int i = 0; i < n; i++) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            ans[i] = i - prev;
        }

        prev = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (S.charAt(i) == C) {
                prev = i;
            }
            ans[i] = Math.min(ans[i], prev - i);
        }
        return ans;
    }

}
