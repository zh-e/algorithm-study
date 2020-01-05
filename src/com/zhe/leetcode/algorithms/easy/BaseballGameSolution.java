package com.zhe.leetcode.algorithms.easy;

/**
 * 682. Baseball Game
 *
 * @author zhangzhe
 */
public class BaseballGameSolution {

    public static void main(String[] args) {
//        String[] ops = {"5", "2", "C", "D", "+"};
        String[] ops = {"36","28","70","65","C","+","33","-46","84","C"};
        System.out.println(calPoints(ops));
    }

    private static int calPoints(String[] ops) {
        int[] ans = new int[ops.length];
        int index = 0;
        for (String s : ops) {
            switch (s) {
                case "C":
                    index = index - 1 < 0 ? 0 : index - 1;
                    ans[index] = 0;
                    break;
                case "D":
                    ans[index] = ans[index - 1] * 2;
                    index++;
                    break;
                case "+":
                    ans[index] = ans[index - 1] + ans[index - 2];
                    index++;
                    break;
                default:
                    ans[index] = Integer.valueOf(s);
                    index++;
            }
        }

        int sum = 0;
        for (int i : ans) {
            sum += i;
        }
        return sum;
    }

}
