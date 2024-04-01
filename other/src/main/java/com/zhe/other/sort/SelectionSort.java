package com.zhe.other.sort;

public class SelectionSort {

    public static void main(String[] args) {

    }

    public int[] selectionSort(int[] arr) {
        if (arr.length == 0) {
            return arr;
        }
        int minIndex;
        for (int i = 0; i < arr.length; i++) {
            minIndex = i;
            for (int j = i; i < arr.length; j++) {
                if (arr[j] < arr[minIndex]) {
                    minIndex = j;
                }
            }
            if (minIndex != i) {
                int temp = arr[i];
                arr[i] = arr[minIndex];
                arr[minIndex] = temp;
            }
        }
        return arr;
    }

}
