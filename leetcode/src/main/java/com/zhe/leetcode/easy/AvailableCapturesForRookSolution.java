package com.zhe.leetcode.easy;

/**
 * 999. Available Captures for Rook
 *
 * @author zhangzhe
 */
public class AvailableCapturesForRookSolution {

    public static void main(String[] args) {
//        char[][] board = {{'.','.','.','.','.','.','.','.'},{'.','p','p','p','p','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','B','R','B','p','.','.'},{'.','p','p','B','p','p','.','.'},{'.','p','p','p','p','p','.','.'},{'.','.','.','.','.','.','.','.'},{'.','.','.','.','.','.','.','.'}};
        char[][] board = {
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','R','.','.','.','p'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','p','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'},
                {'.','.','.','.','.','.','.','.'}};
        System.out.println(numRookCaptures(board));
    }

    private static int numRookCaptures(char[][] board) {
        int rookX = 0;
        int rookY = 0;
        int len = 8;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (board[i][j] == 'R') {
                    rookX = j;
                    rookY = i;
                }
            }
        }

        int res = 0;
        for (int i = rookX - 1; i >= 0; i--) {
            if (board[rookY][i] != '.') {
                if (board[rookY][i] >= 'a' && board[rookY][i] <= 'z') {
                    res++;
                }
                break;
            }
        }

        for (int i = rookX + 1; i < len; i++) {
            if (board[rookY][i] != '.') {
                if (board[rookY][i] >= 'a' && board[rookY][i] <= 'z') {
                    res++;
                }
                break;
            }
        }

        for (int i = rookY - 1; i >= 0; i--) {
            if (board[i][rookX] != '.') {
                if (board[i][rookX] >= 'a' && board[i][rookX] <= 'z') {
                    res++;
                }
                break;
            }
        }

        for (int i = rookY + 1; i < len; i++) {
            if (board[i][rookX] != '.') {
                if (board[i][rookX] >= 'a' && board[i][rookX] <= 'z') {
                    res++;
                }
                break;
            }
        }
        return res;
    }

}
