package com.jyh.deliver.app.week2;


import java.util.ArrayList;
import java.util.List;

public class generate_parentheses {
    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        dfs(n, 0, 0, "");
        return res;
    }

    public void dfs(int max, int left, int right, String temp) {
        if (left == max && right == max) {
            res.add(temp);
            return;
        }

        if (left < max) dfs(max, left + 1, right, temp + "(");
        if (right < left) dfs(max, left, right + 1, temp + ")");
    }
}
