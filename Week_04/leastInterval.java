package com.jyh.deliver.app.week2;


import java.util.Arrays;

public class leastInterval {

    public int leastInterval(char[] tasks, int n) {
        int[] count = new int[26];
        for (char ch : tasks) {
            count[ch - 'A']++;
        }

        Arrays.sort(count);

        int maxCount = count[25];
        int retCount = (maxCount - 1) * (n + 1) + 1;
        int index = 24;
        while (index >= 0 && count[index] == maxCount) {
            retCount++;
            index--;
        }

        return Math.max(retCount, tasks.length);
    }
}
