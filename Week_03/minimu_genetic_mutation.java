package com.jyh.deliver.app.week2;


import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class minimu_genetic_mutation {

    public static int minMutation(String start, String end, String[] bank) {
        if (start.equals(end)) return 0;

        Set<String> bankSet = new HashSet<>();
        for (String b : bank) bankSet.add(b);

        char[] charSet = new char[]{'A', 'C', 'G', 'T'};

        int level = 0;
        Set<String> visited = new HashSet<>();
        Queue<String> queue = new LinkedList<>();
        queue.offer(start);
        visited.add(start);

        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String currWord = queue.poll();
                if (end.equals(currWord)) return level;

                char[] currArray = currWord.toCharArray();
                for (int i = 0; i < currArray.length; i++) {
                    char old = currArray[i];
                    for (char c : charSet) {
                        currArray[i] = c;
                        String temp = new String(currArray);
                        if (!visited.contains(temp) && bankSet.contains(temp)) {
                            visited.add(temp);
                            queue.offer(temp);
                        }
                    }

                    currArray[i] = old;
                }
            }

            level++;
        }
        return -1;

    }
}
