package com.jyh.deliver.app.week2;


import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

public class topk {
    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> priorityQueue = new PriorityQueue<>(new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[1] - o2[1];
            }
        });
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int num = entry.getKey(), count = entry.getValue();
            if (priorityQueue.size() == k) {
                if (priorityQueue.peek()[1] < count) {
                    priorityQueue.poll();
                    priorityQueue.offer(new int[]{num, count});
                }
            } else {
                priorityQueue.offer(new int[]{num, count});
            }
        }

        int[] ret = new int[k];
        for (int i = 0; i < k; ++i) {
            ret[i] = priorityQueue.poll()[0];
        }
        return ret;


    }
}

    public void recur(int level, int param) {  
        // terminator  
        if (level > MAX_LEVEL) { 
              // process result    
             return;   }  // process current logic   process(level, param);   // drill down   recur( level: level + 1, newParam);   // restore current status  }
