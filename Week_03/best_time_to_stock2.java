package com.jyh.deliver.app.week2;


public class best_time_to_stock2 {
    public int maxProfit(int[] prices) {
        int res = 0;
        if (prices.length < 1) return res;
        int index = 0;
        while (index < prices.length) {
            if (index + 1 < prices.length && prices[index] < prices[index + 1]) {
                res += prices[index + 1] - prices[index];
            }
            index++;
        }

        return res;
    }
}
