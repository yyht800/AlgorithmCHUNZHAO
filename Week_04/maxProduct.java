package com.jyh.deliver.app.week2;

public class maxProduct {

    public int maxProduct(int[] nums) {
        int max = nums[0];

        int[][] dp = new int[nums.length][2];
        dp[0][0] = nums[0];
        dp[0][1] = nums[0];
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] < 0) {
                dp[i][0] = dp[i - 1][1] * nums[i];
                dp[i][1] = dp[i - 1][0] * nums[i];
            } else {
                dp[i][0] = dp[i - 1][0] * nums[i];
                dp[i][1] = dp[i - 1][1] * nums[i];
            }

            dp[i][0] = Math.max(dp[i][0], nums[i]);
            dp[i][1] = Math.min(dp[i][1], nums[i]);
            max = Math.max(dp[i][0], max);
        }


        return max;
    }


    public int maxProduct2(int[] nums) {
        int maxF = nums[0], minF = nums[0], ans = nums[0];
        int length = nums.length;
        for (int i = 1; i < length; ++i) {
            int mx = maxF, mn = minF;
            maxF = Math.max(mx * nums[i], Math.max(nums[i], mn * nums[i]));
            minF = Math.min(mn * nums[i], Math.min(nums[i], mx * nums[i]));
            ans = Math.max(maxF, ans);
        }
        return ans;
    }
}
