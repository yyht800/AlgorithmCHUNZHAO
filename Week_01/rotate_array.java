package com.jyh.deliver.app.week;


public class rotate_array {
    class Solution {
        public void rotate(int[] nums, int k) {
            if (nums.length < 2 || k == 0) return;
            k %= nums.length;
            int len = nums.length;
            reverse(nums, 0, len - 1);
            reverse(nums, 0, k - 1);
            reverse(nums, k, len - 1);

        }

        public void reverse(int[] nums, int start, int end) {
            while (start < end) {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;
                start++;
                end--;
            }
        }


    }

}
