package com.jyh.deliver.app.week2;


public class climbin_stairs {

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

    public int climbStairs2(int n) {
        int[] nums = new int[n + 1];
        nums[0] = 1;
        nums[1] = 1;
        climbStairs(n, nums);
        return nums[n];
    }

    public void climbStairs(int n, int[] nums) {
        if (nums[n] != 0) return;
        climbStairs(n - 1, nums);
        nums[n] = nums[n - 1] + nums[n - 2];
    }
}
