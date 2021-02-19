package com.jyh.deliver.app.week2;


public class countSubstrings {
    public int countSubstrings(String s) {
        int res = 0;
        int n = s.length();
        if (n < 2) return n;

        boolean[][] dp = new boolean[n][n];

        for (int i = n - 1; i >= 0; i--) {
            for (int j = i; j < n; j++) {
                //首尾字符相同，并且
                if (s.charAt(i) == s.charAt(j) && (j - i <= 2 || dp[i + 1][j - 1])) {
                    res++;
                    dp[i][j] = true;
                }
            }
        }

        return res;
    }
}
