package com.jyh.deliver.app.week2;


public class isValidSudoku {

    public boolean isValidSudoku(char[][] board) {
        boolean[][] row = new boolean[9][9];
        boolean[][] col = new boolean[9][9];
        boolean[][] bolck = new boolean[9][9];


        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (board[i][j] != '.') {
                    int num = board[i][j] - '1';
                    int blockIndex = i / 3 * 3 + j / 3;
                    if (!row[i][num] && !col[j][num] && !bolck[blockIndex][num]) {
                        row[i][num] = true;
                        col[j][num] = true;
                        bolck[blockIndex][num] = true;
                    } else {
                        return false;
                    }
                }
            }
        }

        return true;
    }
}
