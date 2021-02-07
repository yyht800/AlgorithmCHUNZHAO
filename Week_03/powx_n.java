package com.jyh.deliver.app.week2;


public class powx_n {
    public double myPow(double x, int n) {
        if (n == 0) return 1;
        if (n == Integer.MIN_VALUE) {
            x = x * x;
            n /= 2;
        }

        if (n < 0) {
            n = -n;
            x = 1 / x;
        }

        return n % 2 == 1 ? myPow(x * x, n / 2) * x : myPow(x * x, n / 2);
    }

}
