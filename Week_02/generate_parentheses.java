package com.jyh.deliver.app.week2;


import java.util.ArrayList;
import java.util.List;

public class generate_parentheses {
    private List<String> res = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        helper(n, 0, 0, "");
        return res;
    }

    public void helper(int max, int left, int right, String temp) {

        if (left == max && right == max) {
            res.add(temp);
            return;
        }

        if (left < max) {
            helper(max, left + 1, right, temp + "(");
        }

        if (left > right) {
            helper(max, left, right + 1, temp + ")");
        }
    }
}
