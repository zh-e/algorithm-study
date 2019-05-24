package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.Arrays;

/**
 * 977. Squares of a Sorted Array
 *
 * @author zhangzhe
 */
public class SquaresOfASortedArraySolution {

    public static void main(String[] args) {
        int[] A = {-4, -1, 0, 3, 10};
        A = sortedSquares(A);
        Arrays.printArry(A);
    }

    private static int[] sortedSquares(int[] A) {
        for (int i = 0, len = A.length; i < len; i++) {
            A[i] = A[i] * A[i];
        }

        return sort(A, 0, A.length - 1);
    }

    private static int[] sort(int arr[], int low, int high) {
        int i = low;
        int h = high;
        //先找出一个数作为基准数（这里取数组最中间的一位）
        int key = arr[i];

        while (i < h) {
            //从后向前：寻找比基准数小的数据，如果找到，停下来
            while (i < h && arr[h] >= key) {
                h--;
            }
            //“探测”到了符合要求的数据，则交换数据，继续顺着方向寻找
            if (i < h) {
                arr[i] = arr[h];
                i++;
            }
            //从前向后：寻找比基准数大的数据，如果找到，停下来
            while (i < h && arr[i] <= key) {
                i++;
            }
            //“探测”到了符合要求的数据，则交换数据，继续顺着方向寻找
            if (i < h) {
                arr[h] = arr[i];
                h--;
            }
        }
        arr[i] = key;
        if (i > low) {
            sort(arr, low, i - 1);
        }
        if (h < high) {
            sort(arr, h + 1, high);
        }
        return arr;
    }

}
