package com.zhe.other;

/**
 * 剪绳子
 * 给你一根长度为 n 的绳子，请把绳子剪成整数长的 m 段（ m 、 n 都是整数， n > 1 并且 m > 1 ， m <= n ），
 * 每段绳子的长度记为 k[1],...,k[m] 。请问 k[1]*k[2]*...*k[m] 可能的最大乘积是多少？
 * 例如，当绳子的长度是 8 时，我们把它剪成长度分别为 2、3、3 的三段，此时得到的最大乘积是 18 。
 * <p>
 * 数据范围 2 ~ 60
 */
public class CutRope {

    public static void main(String[] args) {
        System.out.println(new CutRope().cutRope(8));
    }

    public int cutRope(int n) {
        int[] f = new int[n + 1];
        f[0] = 0;
        f[1] = 1;
        for (int i = 1; i <= n; i++) {
            if (i == n) {
                f[i] = 1;
            } else {
                f[i] = i;
            }

            for (int j = 1; j < i; j++) {
                f[i] = Math.max(f[i], f[j] * f[i - j]);
            }
        }
        return f[n];
    }

}
