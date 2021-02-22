package com.jyh.deliver.app.week2;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class minMutation {
    private static char[] charArray = new char[]{'A', 'G', 'C', 'T'};

    public static int minMutation(String start, String end, String[] bank) {
        if (start.equals(end)) return 0;

        Set<String> visited = new HashSet<>();
        visited.add(start);
        Set<String> wordBank = new HashSet<>();
        for (String word : bank) {
            wordBank.add(word);
        }

        Queue<String> queue = new LinkedList<>();
        queue.offer(start);

        if (!wordBank.contains(end)) return -1;

        int level = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            while (size-- > 0) {
                String pop = queue.poll();
                if (pop.equals(end)) return level;
                char[] tempArray = pop.toCharArray();

                for (int i = 0; i < start.length(); i++) {
                    char old = tempArray[i];
                    for (char c : charArray) {
                        tempArray[i] = c;
                        String tempWord = new String(tempArray);
                        if (!visited.contains(tempWord) && wordBank.contains(tempWord)) {
                            visited.add(tempWord);
                            queue.offer(tempWord);
                        }

                    }
                    tempArray[i] = old;
                }
            }

            level++;
        }
        return -1;
    }
}
