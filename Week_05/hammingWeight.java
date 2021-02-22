package com.jyh.deliver.app.week2;


public class hammingWeight {
    public int hammingWeight(int n) {
        int count = 0;

        while (n != 0) {
            count++;
            n = n & (n - 1);
        }

        return count;
    }

}
