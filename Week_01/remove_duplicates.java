package com.jyh.deliver.app.week;

public class remove_duplicates {

    class Solution {
        public int removeDuplicates(int[] nums) {
            int res = 0;
            for (int i = 0; i < nums.length; i++) {
                if (i == 0 || nums[i - 1] != nums[i]) {
                    nums[res] = nums[i];
                    res++;
                }

            }
            return res;
        }
    }
}
