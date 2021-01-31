package com.jyh.deliver.app.week2;


import java.util.List;

public class Ugly_num {
    public int nthUglyNumber(int n) {
        int[] dp = new int[n];
        int p2 = 0, p3 = 0, p5 = 0;
        dp[0] = 1;
        for (int i = 1; i < n; i++) {
            dp[i] = Math.min(dp[p2] * 2, Math.min(dp[p3] * 3, dp[p5] * 5));
            if (dp[p2] * 2 == dp[i]) p2++;
            if (dp[p3] * 3 == dp[i]) p3++;
            if (dp[p5] * 5 == dp[i]) p5++;

        }
        return dp[n - 1];
    }
}
