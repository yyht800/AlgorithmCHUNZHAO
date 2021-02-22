package com.jyh.deliver.app.week2;


public class solveNQueens2 {

    int count = 0;

    public int totalNQueens(int n) {
        boolean[] col = new boolean[n];
        boolean[] pie = new boolean[2 * n];
        boolean[] na = new boolean[2 * n];
        helper(n, 0, col, pie, na);

        return count;

    }

    public void helper(int n, int row, boolean[] col, boolean[] pie, boolean[] na) {

        if (row == n) {
            count++;
            return;
        }

        for (int i = 0; i < n; i++) {
            if (col[i] || pie[row + i] || na[row - i + n - 1]) {
                continue;
            }
            col[i] = true;
            pie[row + i] = true;
            na[row - i + n - 1] = true;
            helper(n, row + 1, col, pie, na);
            col[i] = false;
            pie[row + i] = false;
            na[row - i + n - 1] = false;
        }
    }
}
