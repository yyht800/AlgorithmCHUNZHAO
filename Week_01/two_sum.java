package com.jyh.deliver.app.week;

import java.util.HashMap;

public class two_sum {
    class Solution {
        public int[] twoSum(int[] nums, int target) {
            HashMap<Integer, Integer> map = new HashMap<>();
            int[] res = new int[2];
            for (int i = 0; i < nums.length; i++) {
                if (map.containsKey(nums[i])) {
                    res[1] = i;
                    res[0] = map.get(nums[i]);
                    return res;
                } else {
                    map.put(target - nums[i], i);
                }
            }

            return res;
        }
    }
}
