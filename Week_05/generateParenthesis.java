package com.jyh.deliver.app.week2;

import java.util.ArrayList;
import java.util.List;

public class generateParenthesis {

    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        dfs(res, n, 0, 0, "");
        return res;
    }

    public void dfs(List<String> res, int n, int left, int right, String temp) {
        if (left == n && right == n) {
            res.add(temp);
        }
        if (left < n) dfs(res, n, left + 1, right, temp + "(");
        if (right < left) dfs(res, n, left, right + 1, temp + ")");
    }
}
