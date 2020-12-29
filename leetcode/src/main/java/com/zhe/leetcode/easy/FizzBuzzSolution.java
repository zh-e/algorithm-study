package com.zhe.leetcode.easy;


import com.zhe.leetcode.base.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 412. Fizz Buzz
 *
 * @author zhangzhe
 */
public class FizzBuzzSolution {

    public static void main(String[] args) {
        int n = 15;
        CollectionUtils.printList(fizzBuzz(n));
    }

    private static List<String> fizzBuzz(int n) {
        int i = 1;
        List<String> ans = new ArrayList<>(n);
        while (i <= n) {
            boolean divideByThree = i % 3 == 0;
            boolean divideByFive = i % 5 == 0;

            if(divideByFive && divideByThree) {
                ans.add("FizzBuzz");
                i++;
                continue;
            }

            if(divideByThree) {
                ans.add("Fizz");
                i++;
                continue;
            }

            if(divideByFive) {
                ans.add("Buzz");
                i++;
                continue;
            }
            ans.add(String.valueOf(i));
            i++;
        }
        return ans;
    }

}
