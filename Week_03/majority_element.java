package com.jyh.deliver.app.week2;


import java.util.Arrays;

public class majority_element {

    public int majorityElement(int[] nums) {
        Arrays.sort(nums);
        return nums[nums.length / 2];
    }
}
