package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.CollectionUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * 728. Self Dividing Numbers
 *
 * @author zhangzhe
 */
public class SelfDividingNumbersSolution {

    public static void main(String[] args) {
        int left = 1;
        int right = 22;

        CollectionUtils.printList(selfDividingNumbers(left, right));
    }

    private static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new ArrayList<>();
        while (left <= right) {
            if (check(left)) {
                res.add(left);
            }
            left++;
        }
        return res;
    }

    private static boolean check(int num) {
        if (num < 10) {
            return true;
        }

        int remainder = num % 10;
        int quotient = num / 10;

        while (remainder > 0) {
            if (num % remainder == 0) {
                if(quotient < 10 && num % quotient == 0) {
                    return true;
                }
                remainder = quotient % 10;
                quotient = quotient / 10;
            } else {
                return false;
            }
        }
        return false;
    }

}
