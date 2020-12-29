package com.zhe.leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 * 893. Groups of Special-Equivalent Strings
 * 你将得到一个字符串数组 A。
 * 如果经过任意次数的移动，S == T，那么两个字符串 S 和 T 是特殊等价的。
 * 一次移动包括选择两个索引 i 和 j，且 i ％ 2 == j ％ 2，交换 S[j] 和 S [i]。
 * 现在规定，A 中的特殊等价字符串组是 A 的非空子集 S，这样不在 S 中的任何字符串与 S 中的任何字符串都不是特殊等价的。
 * 返回 A 中特殊等价字符串组的数量。
 *
 * @author zhangzhe
 */
public class GroupsOfSpecialEquivalentStringsSolution {

    public static void main(String[] args) {
        String[] A = {"abcd", "cdab", "adcb", "cbad"};
        System.out.println(numSpecialEquivGroups(A));
    }

    private static int numSpecialEquivGroups(String[] A) {
        Set<String> seen = new HashSet<>();
        for (String s : A) {
            char[] c = s.toCharArray();
            for(int i = 0; i < c.length; i += 2){
                c[i] += 26;
            }
            Arrays.sort(c);
            seen.add(String.valueOf(c));
        }
        return seen.size();
    }

}
