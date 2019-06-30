package com.zhe.leetCode.algorithms.easy;

/**
 * 953. Verifying an Alien Dictionary
 *
 * @author zhangzhe
 */
public class VerifyingAnAlienDictionarySolution {

    public static void main(String[] args) {

//        String[] words = {"hello","leetcode"};
//        String order = "hlabcdefgijkmnopqrstuvwxyz";

//        String[] words = {"apple","app"};
//        String order = "abcdefghijklmnopqrstuvwxyz";

        String[] words = {"word","world","row"};
        String order = "worldabcefghijkmnpqstuvxyz";


        System.out.println(isAlienSorted(words, order));

    }

    private static boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0, len = order.length(); i < len; i++) {
            index[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0, len = words.length - 1; i < len; i++) {
            String str1 = words[i];
            String str2 = words[i + 1];

            boolean flag = true;
            for(int j = 0, len1 = Math.min(str1.length(), str2.length()); j < len1; j++) {
                if(str1.charAt(j) != str2.charAt(j)) {
                    if(index[str1.charAt(j) - 'a'] > index[str2.charAt(j) - 'a']) {
                        return false;
                    }
                    flag = false;
                    break;
                }
            }
            if(flag && str1.length() > str2.length()) {
                return false;
            }
        }
        return true;
    }

}
