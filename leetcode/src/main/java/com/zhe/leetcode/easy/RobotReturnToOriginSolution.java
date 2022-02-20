package com.zhe.leetcode.easy;

/**
 * 657. Robot Return to Origin
 *
 * @author zhangzhe
 */
public class RobotReturnToOriginSolution {

    public static void main(String[] args) {
        String moves = "LR";
        System.out.println(judgeCircle(moves));
    }

    private static boolean judgeCircle(String moves) {

        int i = 0;
        int j = 0;
        for (char c : moves.toCharArray()) {
            switch (c) {
                case 'L':
                    i--;
                    break;
                case 'R':
                    i++;
                    break;
                case 'U':
                    j++;
                    break;
                case 'D':
                    j--;
                    break;
                default:
                    break;
            }
        }
        return i == 0 && j == 0;
    }

}
