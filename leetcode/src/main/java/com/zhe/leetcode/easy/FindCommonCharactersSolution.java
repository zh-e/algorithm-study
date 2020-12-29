package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 1002. Find Common Characters
 *
 * @author zhangzhe
 */
public class FindCommonCharactersSolution {

    public static void main(String[] args) {
        String[] A = {"bella","label","roller"};
        CollectionUtils.printList(commonChars(A));
    }

    private static List<String> commonChars(String[] A) {
        int[] freqs = new int[26];
        int[] compare = new int[26];

        String first = A[0];
        for (char c : first.toCharArray()) {
            freqs[c - 'a']++;
        }

        for (int i = 1; i < A.length; i++) {
            for (char c : A[i].toCharArray()) {
                compare[c - 'a']++;
            }
            for (int j = 0; j < 26; j++) {
                freqs[j] = Math.min(freqs[j], compare[j]);
                compare[j] = 0;
            }
        }
        List<String> result = new ArrayList<String>();
        for (int i = 0; i < 26; i++) {
            while (freqs[i]-- > 0) {
                result.add(Character.toString((char)('a' + i)));
            }
        }
        return result;
    }

}
