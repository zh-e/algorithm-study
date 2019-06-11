package com.zhe.leetCode.algorithms.easy;

/**
 * 762. Prime Number of Set Bits in Binary Representation
 *
 * @author zhangzhe
 */
public class PrimeNumberOfSetBitsInBinaryRepresentationSolution {

    public static void main(String[] args) {
        int L = 6, R = 10;
        System.out.println(countPrimeSetBits(L, R));
    }

    private static int countPrimeSetBits(int L, int R) {
        int ans = 0;
        for(int i = L; i <= R; i++) {
            if(isSmallPrime(Integer.bitCount(i))) {
                ans++;
            }
        }
        return ans;
    }

    private static boolean isSmallPrime(int x) {
        return (x == 2 || x == 3 || x == 5 || x == 7 ||
                x == 11 || x == 13 || x == 17 || x == 19);
    }

}
