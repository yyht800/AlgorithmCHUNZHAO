package com.jyh.deliver.app.week2;


import java.util.ArrayList;
import java.util.List;

public class phone_number {

    public List<String> letterCombinations(String digits) {
        List<String> ans = new ArrayList<>();
        if (digits == null || digits.length() < 1) return ans;
        dfs(ans, new char[digits.length()], digits, 0);
        return ans;
    }

    public void dfs(List<String> ans, char[] temp, String digits, int index) {
        if (index == digits.length()) {
            ans.add(String.valueOf(temp));
            return;
        }

        for (char ch : getKey(digits.charAt(index)).toCharArray()) {
            temp[index] = ch;
            dfs(ans, temp, digits, index + 1);
        }
    }

    public String getKey(char ch) {
        String value = "";
        switch (ch) {
            case '2':
                value = "abc";
                break;
            case '3':
                value = "def";
                break;
            case '4':
                value = "ghi";
                break;
            case '5':
                value = "jkl";
                break;
            case '6':
                value = "mno";
                break;
            case '7':
                value = "pqrs";
                break;
            case '8':
                value = "tuv";
                break;
            case '9':
                value = "wxyz";
                break;
            default:
                break;
        }

        return value;
    }
}
