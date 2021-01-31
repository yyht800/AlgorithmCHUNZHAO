package com.jyh.deliver.app.week2;


import java.util.LinkedList;

public class sliding_window_maximum {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums == null || nums.length < 2) return nums;
        // 双向队列 保存当前窗口最大值的数组位置 保证队列中数组位置的数值按从大到小排序
        LinkedList<Integer> queue = new LinkedList();
        // 结果数组
        int[] result = new int[nums.length - k + 1];
        for (int i = 0; i < nums.length; i++) {
            while (!queue.isEmpty() && nums[i] >= nums[queue.peekLast()]) queue.pollLast();
            queue.offer(i);
            if (i - queue.peek() >= k) queue.poll();

            if (i - k + 1 >= 0) {
                result[i - k + 1] = nums[queue.peek()];
            }
        }
        return result;

    }
}
