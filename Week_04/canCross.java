package com.jyh.deliver.app.week2;


public class canCross {

    public boolean canCross(int[] stones) {
        int len = stones.length;

        if (stones[1] != 1) return false;

        boolean[][] dp = new boolean[len][len + 1];
        dp[0][0] = true;

        for (int i = 1; i < len; i++) {
            //跳跃的
            for (int j = 0; j < i; j++) {
                int k = stones[i] - stones[j];

                if (k <= i) {
                    dp[i][k] = dp[j][k - 1] || dp[j][k + 1] || dp[j][k];

                    if (i == len - 1 && dp[i][k]) {
                        return true;
                    }
                }
            }
        }

        return false;
    }
}
