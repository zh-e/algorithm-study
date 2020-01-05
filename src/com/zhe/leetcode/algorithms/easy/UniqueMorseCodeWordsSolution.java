package com.zhe.leetcode.algorithms.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 804. Unique Morse Code Words
 *
 * @author zhangzhe
 */
public class UniqueMorseCodeWordsSolution {

    public static void main(String[] args) {
        String[] words = {"gin", "zen", "gig", "msg"};
        System.out.println(uniqueMorseRepresentations(words));
    }


    private static int uniqueMorseRepresentations(String[] words) {
        String[] morseArr = {".-", "-...", "-.-.", "-..", ".", "..-.",
                "--.", "....", "..", ".---", "-.-", ".-..", "--", "-.", "---",
                ".--.", "--.-", ".-.", "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--.."};
        Set<String> set = new HashSet<>();
        StringBuilder sb;
        for (String str : words) {
            sb = new StringBuilder();
            for (char c : str.toCharArray()) {
                sb.append(morseArr[c - 97]);
            }
            set.add(sb.toString());
        }
        return set.size();
    }

}
