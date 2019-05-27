package com.zhe.leetCode.algorithms.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 933. Number of Recent Calls
 * 看见题目好懵，看见答案想说句卧槽，什么鬼，这么简单的么
 * @author zhangzhe
 */
public class NumberOfRecentCallsSolution {

    class RecentCounter {
        Queue<Integer> q;
        public RecentCounter() {
            q = new LinkedList<>();
        }

        public int ping(int t) {
            q.add(t);
            while (q.size() > 1 && q.peek() < t - 3000) {
                q.poll();
            }
            return q.size();
        }
    }

}
