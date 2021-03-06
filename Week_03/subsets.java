package com.jyh.deliver.app.week2;


import java.util.ArrayList;
import java.util.List;

public class subsets {
    public List<List<Integer>> subsets(int[] nums) {
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<Integer>());
        if (nums.length < 1) return res;
        for (int i = 0; i < nums.length; i++) {
            int all = res.size();
            for (int j = 0; j < all; j++) {
                List<Integer> temp = new ArrayList<>(res.get(j));
                //res.add(new ArrayList<Integer>(nums[i]));
                temp.add(nums[i]);
                res.add(temp);
            }
        }

        return res;
    }
}
