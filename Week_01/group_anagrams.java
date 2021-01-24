package com.jyh.deliver.app.week;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;

public class group_anagrams {
    class Solution {
        public List<List<String>> groupAnagrams(String[] strs) {
            List<List<String>> res = new ArrayList<>();
            if (strs.length < 1) return res;
            HashMap<String, List<String>> map = new HashMap<>();
            for (String s : strs) {
                char[] temp = s.toCharArray();
                Arrays.sort(temp);
                String key = String.valueOf(temp);
                if (!map.containsKey(key)) map.put(key, new ArrayList<String>());
                map.get(key).add(s);
            }

            return new ArrayList(map.values());
        }
    }
}
