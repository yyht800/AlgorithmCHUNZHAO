package com.jyh.deliver.app.week2;


import java.util.Arrays;

public class rob2 {

    public int rob(int[] nums) {
        if (nums.length == 1) return nums[0];

        return Math.max(myRob(Arrays.copyOfRange(nums, 0, nums.length - 1)),
                myRob(Arrays.copyOfRange(nums, 1, nums.length)));

    }

    public int myRob(int[] nums) {
        int pre = 0, curr = 0;
        int temp = 0;
        for (int num : nums) {
            temp = curr;
            curr = Math.max(pre + num, curr);
            pre = temp;
        }

        return curr;
    }
}
