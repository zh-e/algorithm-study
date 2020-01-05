package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.ArrayUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078. Occurrences After Bigram
 *
 * @author zhangzhe
 */
public class OccurrencesAfterBigramSolution {

    public static void main(String[] args) {
        String text = "we will we will rock you",
                first = "we",
                second = "will";
        ArrayUtils.printArry(findOcurrences(text, first, second));
    }

    private static String[] findOcurrences(String text, String first, String second) {
        String[] arr = text.split(" ");
        List<String> ans = new ArrayList<>();

        for (int i = 2, len = arr.length; i < len; i++) {
            if (first.equals(arr[i - 2]) && second.equals(arr[i - 1])) {
                ans.add(arr[i]);
            }
        }
        return ans.toArray(new String[0]);
    }

}
