package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.ArrayUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @author zhangzhe
 */
public class UncommonWordsFromTwoSentencesSolution {

    public static void main(String[] args) {
        String A = "this apple is sweet", B = "this apple is sour";
        ArrayUtils.printArry(uncommonFromSentences(A, B));
    }

    private static String[] uncommonFromSentences(String A, String B) {
        String[] arrA = A.split(" ");
        String[] arrB = B.split(" ");

        Map<String, Integer> ansMap = new HashMap<>();
        for(String str : arrA) {
            ansMap.put(str, ansMap.getOrDefault(str, 0) + 1);
        }
        for(String str : arrB) {
            ansMap.put(str, ansMap.getOrDefault(str, 0) + 1);
        }

        List<String> ans = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : ansMap.entrySet()) {
            if (entry.getValue() == 1) {
                ans.add(entry.getKey());
            }
        }
        return ans.toArray(new String[0]);
    }

}
