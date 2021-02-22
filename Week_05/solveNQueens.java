package com.jyh.deliver.app.week2;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class solveNQueens {

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> res = new ArrayList();
        boolean[] vertical = new boolean[n];
        boolean[] tiltU = new boolean[2 * n];
        boolean[] tiltD = new boolean[2 * n];
        int[] h = new int[n];
        helper(res, h, vertical, tiltU, tiltD, n, 0);
        return res;
    }

    void helper(List<List<String>> res, int[] h, boolean[] v, boolean[] u, boolean[] d, int n, int row) {
        if (row == n) {
            List<String> list = new ArrayList();
            for (int i = 0; i < n; i++) {
                char[] cs = new char[n];
                Arrays.fill(cs, '.');
                cs[h[i]] = 'Q';
                list.add(new String(cs));
            }
            res.add(list);
            return;
        }

        for (int col = 0; col < n; col++) {
            if (v[col] || u[col + row] || d[row - col + n - 1]) {
                continue;
            }
            v[col] = true;
            u[col + row] = true;
            d[row - col + n - 1] = true;
            h[row] = col;
            helper(res, h, v, u, d, n, row + 1);
            v[col] = false;
            u[col + row] = false;
            d[row - col + n - 1] = false;
        }
    }
}
