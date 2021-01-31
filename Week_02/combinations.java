package com.jyh.deliver.app.week2;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class combinations {
    private List<List<Integer>> res = new ArrayList<>();

    public List<List<Integer>> combine(int n, int k) {
        if (k < 1 || n < k) return res;
        Deque<Integer> path = new ArrayDeque<>();

        dfs(n, k, 1, path);

        return res;
    }

    public void dfs(int n, int k, int index, Deque<Integer> path) {
        if (path.size() == k) {
            res.add(new ArrayList<Integer>(path));
            return;
        }
        for (int i = index; i <= n - (k - path.size()) + 1; i++) {

            path.offerLast(i);
            dfs(n, k, i + 1, path);
            path.removeLast();

        }
    }
}
