package com.zhe.leetcode.algorithms.easy;

import com.zhe.leetcode.algorithms.base.ArrayUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/**
 * 1030. Matrix Cells in Distance Order
 *
 * @author zhangzhe
 */
public class MatrixCellsInDistanceOrderSolution {

    public static void main(String[] args) {
        int R = 2;
        int C = 2;
        int r0 = 0;
        int c0 = 1;
        ArrayUtils.printArry(allCellsDistOrder(R, C, r0, c0));
    }

    private static int[][] allCellsDistOrder(int R, int C, int r0, int c0) {

        TreeMap<Integer, List<Integer>> treeMap = new TreeMap<>();
        for(int i = 0; i < R; i++) {
            for(int j = 0; j < C; j++) {
                //|r1 - r2| + |c1 - c2|
                int distance = Math.abs(i - r0) + Math.abs(j - c0);
                List<Integer> list = treeMap.get(distance);
                if(list == null) {
                    list = new ArrayList<>();
                    list.add(i);
                    list.add(j);
                    treeMap.put(distance, list);
                } else {
                    list.add(i);
                    list.add(j);
                }
            }
        }

        int[][] res = new int[R * C][2];
        int index = 0;
        for(Map.Entry<Integer, List<Integer>> entry : treeMap.entrySet()) {
            List<Integer> list = entry.getValue();
            for(int i = 0, size = list.size(); i < size; i += 2) {
                res[index][0] = list.get(i);
                res[index][1] = list.get(i+1);
                index ++;
            }
        }
        return res;
    }

}
