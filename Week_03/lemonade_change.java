package com.jyh.deliver.app.week2;


public class lemonade_change {
    public boolean lemonadeChange(int[] bills) {
        int[] money = new int[3];
        for (int temp : bills) {
            if (temp == 5) {
                money[0]++;
            } else if (temp == 10) {
                if (money[0] == 0) return false;
                money[0]--;
                money[1]++;
            } else {
                if (money[0] < 1) return false;
                if (money[1] > 0) {
                    money[1]--;
                    money[0]--;
                    money[2]++;
                } else if (money[0] > 2) {
                    money[0] -= 3;
                    money[2]++;
                } else {
                    return false;
                }
            }
        }

        return true;
    }
}
