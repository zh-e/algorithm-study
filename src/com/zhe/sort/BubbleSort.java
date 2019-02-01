package com.zhe.sort;

/**
 * @author zhangzhe
 */
public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {3,7,1,55,12,65,12,6,7,32,467,9};
        int[] end = selectionSort(arr);
        for (int i: arr) {
            System.out.println(i);
        }
    }

    //冒泡排序
    private static int[] bubbleSort(int[] arr) {

        for(int i = 0, n = arr.length - 1; i < n; i++) {
            for(int j = 0; j < n - i; j++) {
                if(arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }

        return arr;
    }

    //选择排序
    private static int[] selectionSort(int[] arr) {
        for(int i = 0, n = arr.length; i < n; i++) {
            int index = i;
            for(int j = i + 1; j < n; j++) {
                if(arr[j] < arr[index]) {
                    index =j;
                }
            }
            int temp = arr[i];
            arr[i] = arr[index];
            arr[index] = temp;
        }
        return arr;
    }

    private static int[] insertionSort(int[] arr) {
        for(int i = 0, n = arr.length; i < n; i++) {

        }
        return arr;
    }

}
