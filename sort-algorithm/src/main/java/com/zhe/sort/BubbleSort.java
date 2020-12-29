package com.zhe.sort;

import java.util.Arrays;

/**
 * @author zhangzhe
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3, 5, 4, 1, 2, 6};
        int[] end = bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
    }

    //冒泡排序
    private static int[] bubbleSort(int[] arr) {
        for (int i = 0, n = arr.length - 1; i < n; i++) {
            boolean flag = false;
            for (int j = 0; j < n - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    flag = true;
                }
            }
            if (!flag) {
                break;
            }
        }
        return arr;
    }

    //选择排序
    private static int[] selectionSort(int[] arr) {
        for (int i = 0, n = arr.length; i < n; i++) {
            int index = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[index]) {
                    index = j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }

    //插入排序
    private static int[] insertionSort(int[] arr) {
        for (int i = 1, n = arr.length; i < n; i++) {
            int tmp = arr[i];
            int j = i;
            while (j > 0 && tmp < arr[j - 1]) {
                arr[j] = arr[j - 1];
                j--;
            }
            arr[j] = tmp;
        }
        return arr;
    }

    //希尔排序
    private static int[] shellSort(int[] arr) {
        int len = arr.length;
        int k = len / 2;
        while (k > 0) {
            for (int i = k; i < len; i++) {
                int j = i;
                int tmp = arr[i];
                while (j >= k && tmp < arr[j - k]) {
                    arr[j] = arr[j - k];
                    j -= k;
                }
                arr[j] = tmp;
            }
            k /= 2;
        }
        return arr;
    }



}
