package com.jyh.deliver.app.week2;


import java.util.Arrays;

public class assign_cookies {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);


        int cookieIndex = 0;
        int childIndex = 0;
        while (childIndex < g.length && cookieIndex < s.length) {
            if (g[childIndex] <= s[cookieIndex]) {
                childIndex++;
            }
            cookieIndex++;
        }


        return childIndex;
    }
}
