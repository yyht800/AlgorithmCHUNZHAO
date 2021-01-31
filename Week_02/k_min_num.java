package com.jyh.deliver.app.week2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;


public class k_min_num {
    public int[] getLeastNumbers(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        Queue<Integer> queue = new PriorityQueue<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int num : arr) {
            if (queue.size() < k) {
                queue.offer(num);
            } else if (num < queue.peek()) {
                queue.poll();
                queue.offer(num);
            }
        }
        int[] ans = new int[queue.size()];
        for (int i = 0; i < ans.length; i++) {
            ans[i] = queue.poll();
        }

        return ans;
    }


    public int[] getLeastNumbers2(int[] arr, int k) {
        if (k == 0 || arr.length == 0) {
            return new int[0];
        }
        Arrays.sort(arr);
        int[] ans = new int[k];
        for (int i = 0; i < k; i++) {
            ans[i] = arr[i];
        }

        return ans;
    }
}
