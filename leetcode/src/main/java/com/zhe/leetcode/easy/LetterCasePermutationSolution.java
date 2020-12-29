package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.CollectionUtils;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 784. Letter Case Permutation
 *
 * @author zhangzhe
 */
public class LetterCasePermutationSolution {

    public static void main(String[] args) {
        String S = "a1b2";
        CollectionUtils.printList(letterCasePermutation(S));
    }

    private static List<String> letterCasePermutation(String S) {
        char[] strChar = S.toCharArray();
        Queue<String> queue = new LinkedList<>();
        queue.add(S);
        for (int i = 0, len = strChar.length; i < len; i++) {
            if (Character.isDigit(S.charAt(i))) {
                continue;
            }

            int size = queue.size();
            for (int j = 0; j < size; j++) {
                String cur = queue.poll();
                char[] chs = cur.toCharArray();

                chs[i] = Character.toUpperCase(chs[i]);
                queue.offer(String.valueOf(chs));

                chs[i] = Character.toLowerCase(chs[i]);
                queue.offer(String.valueOf(chs));
            }
        }
        return new ArrayList<>(queue);
    }

}
