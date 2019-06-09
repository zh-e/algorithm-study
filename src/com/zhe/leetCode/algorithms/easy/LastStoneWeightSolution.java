package com.zhe.leetCode.algorithms.easy;

import com.zhe.leetCode.algorithms.base.CollectionUtils;

import java.util.*;
import java.util.zip.DeflaterOutputStream;

/**
 * 1046. Last Stone Weight
 *
 * @author zhangzhe
 */
public class LastStoneWeightSolution {

    public static void main(String[] args) {
        int[] stones = {1, 3};
        System.out.println(lastStoneWeight(stones));
    }

    private static int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        for (int i : stones) {
            queue.add(i);
        }
        while (queue.size() > 1) {
            int first = queue.poll();
            int second = queue.poll();
            if (first == second) {
                continue;
            }
            queue.add(first - second);
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }

}
