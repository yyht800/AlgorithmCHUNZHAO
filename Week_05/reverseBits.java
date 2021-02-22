package com.jyh.deliver.app.week2;


public class reverseBits {

    public int reverseBits(int n) {
        int ans = 0;

        for (int i = 0; i < 32; i++) {
            //获取最后一位
            int bit = n & 1;
            //n右移一位
            n = n >> 1;
            //ans左移一位
            ans = (ans << 1) + bit;
        }

        return ans;
    }
}
