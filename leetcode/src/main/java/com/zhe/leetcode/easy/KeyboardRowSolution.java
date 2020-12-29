package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.ArrayUtils;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 500. Keyboard Row
 *
 * @author zhangzhe
 */
public class KeyboardRowSolution {

    public static void main(String[] args) {
        String[] words = {"Hello", "Alaska", "Dad", "Peace"};
        ArrayUtils.printArry(findWords(words));
    }

    private static String[] findWords(String[] words) {
        Map<Character, Integer> keyMap = new HashMap<>();
        String[] keyWords = {"qwertyuiopQWERTYUIOP", "asdfghjklASDFGHJKL", "zxcvbnmZXCVBNM"};
        for (int i = 0, len = keyWords.length; i < len; i++) {
            for (char c : keyWords[i].toCharArray()) {
                keyMap.put(c, i);
            }
        }

        List<String> ans = new ArrayList<>();
        for (String str : words) {
            int i = keyMap.get(str.charAt(0));
            boolean check = true;
            for(char c : str.toCharArray()) {
                if(keyMap.get(c) != i) {
                    check = false;
                    break;
                }
            }
            if(check) {
                ans.add(str);
            }
        }
        return ans.toArray(new String[0]);
    }

}
