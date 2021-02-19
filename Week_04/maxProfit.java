package com.jyh.deliver.app.week2;


public class maxProfit {
    public int maxProfit(int[] prices) {
        if (prices.length < 2) return 0;

        int[] dp = new int[prices.length];

        int res = 0;
        dp[0] = prices[0];

        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, prices[i] - dp[i - 1]);

            dp[i] = Math.min(dp[i - 1], prices[i]);
        }

        return res;

    }

    public int maxProfit2(int[] prices) {
        if (prices.length < 2) return 0;

        int min = prices[0];
        int res = 0;

        for (int i = 1; i < prices.length; i++) {
            res = Math.max(res, prices[i] - min);

            min = Math.min(min, prices[i]);
        }

        return res;

    }
}
