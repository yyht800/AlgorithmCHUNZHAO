package com.jyh.deliver.app.week2;


import java.util.ArrayList;
import java.util.List;

public class permutations {

    public List<List<Integer>> permute(int[] nums) {

        List<List<Integer>> res = new ArrayList<>();
        if (nums.length < 1) return res;
        boolean[] visited = new boolean[nums.length];
        helper(res, nums, new ArrayList<Integer>(), visited);

        return res;
    }

    public void helper(List<List<Integer>> res, int[] nums, List<Integer> temp, boolean[] visited) {
        if (temp.size() == nums.length) {
            res.add(new ArrayList<Integer>(temp));
            return;
        }

        for (int i = 0; i < nums.length; i++) {
            if (!visited[i]) {
                visited[i] = true;
                temp.add(nums[i]);

                helper(res, nums, temp, visited);

                temp.remove(temp.size() - 1);
                visited[i] = false;
            }

        }
    }
}
