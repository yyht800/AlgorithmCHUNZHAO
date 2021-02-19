package com.jyh.deliver.app.week2;


public class longest_common_subsequence {

    public int longestCommonSubsequence(String text1, String text2) {
        char[] mArray = text1.toCharArray();
        char[] nArray = text2.toCharArray();
        int[][] dp = new int[mArray.length + 1][nArray.length + 1];

        for (int i = 1; i <= mArray.length; i++) {
            for (int j = 1; j <= nArray.length; j++) {
                if (mArray[i - 1] == nArray[j - 1]) {
                    dp[i][j] = dp[i - 1][j - 1] + 1;
                }

                dp[i][j] = Math.max(dp[i - 1][j], Math.max(dp[i][j], dp[i][j - 1]));

            }
        }

        return dp[mArray.length][nArray.length];
    }
}
