package com.jyh.deliver.app.week;


public class climbing_stairs {

    public int climbStairs(int n) {
        if (n < 2) return n;
        int[] nums = new int[n];
        nums[0] = 1;
        nums[1] = 2;
        for (int i = 2; i < n; i++) {
            nums[i] = nums[i - 1] + nums[i - 2];
        }


        return nums[n - 1];
    }
}
