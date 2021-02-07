package com.jyh.deliver.app.week2;


public class minesweeper {
    // 定义xy 的八个方向
    int[] dir_x = {-1, -1, -1, 0, 0, 1, 1, 1};
    int[] dir_y = {-1, 0, 1, -1, 1, -1, 0, 1};

    public char[][] updateBoard(char[][] board, int[] click) {
        int x = click[0], y = click[1];
        if (board[x][y] == 'M') {
            board[x][y] = 'X';
        } else {
            dfs(board, x, y);
        }

        return board;
    }

    public void dfs(char[][] board, int x, int y) {
        int count = 0;
        for (int i = 0; i < 8; i++) {
            int temp_x = dir_x[i] + x;
            int temp_y = dir_y[i] + y;
            if (temp_x < 0 || temp_y < 0 || temp_x >= board.length || temp_y >= board[0].length) {
                continue;
            }

            if (board[temp_x][temp_y] == 'M') {
                count++;
            }
        }


        if (count > 0) {
            board[x][y] = (char) (count + '0');
            return;
        }

        board[x][y] = 'B';

        for (int i = 0; i < 8; i++) {
            int temp_x = dir_x[i] + x;
            int temp_y = dir_y[i] + y;
            if (temp_x < 0 || temp_y < 0 || temp_x >= board.length || temp_y >= board[0].length||board[temp_x][temp_y]!='E') {
                continue;
            }
            dfs(board, temp_x, temp_y);
        }
    }
}
