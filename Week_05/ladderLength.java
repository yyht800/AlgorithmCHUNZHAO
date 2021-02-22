package com.jyh.deliver.app.week2;


import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class ladderLength {

    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> wordBank = new HashSet<>(wordList);
        if (!wordBank.contains(endWord)) {
            return 0;
        }

        Set<String> visited = new HashSet<>();
        Set<String> start = new HashSet<>();
        start.add(beginWord);
        Set<String> end = new HashSet<>();
        end.add(endWord);

        int step = 1;

        while (!start.isEmpty() && !end.isEmpty()) {
            if (start.size() > end.size()) {
                Set<String> temp = start;
                start = end;
                end = temp;
            }

            Set<String> nextLevelVisited = new HashSet<>();
            //bfs
            for (String word : start) {
                if (changeWordEveryOneLetter(word, end, visited, wordBank, nextLevelVisited)) {
                    return step + 1;
                }
            }

            step++;
            start = nextLevelVisited;

        }
        return 0;
    }


    /**
     * 尝试对 word 修改每一个字符，看看是不是能落在 endVisited 中，扩展得到的新的 word 添加到 nextLevelVisited 里
     *
     * @param word
     * @param endVisited
     * @param visited
     * @param wordSet
     * @param nextLevelVisited
     * @return
     */
    private boolean changeWordEveryOneLetter(String word, Set<String> endVisited,
                                             Set<String> visited,
                                             Set<String> wordSet,
                                             Set<String> nextLevelVisited) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < word.length(); i++) {
            char originChar = charArray[i];
            for (char c = 'a'; c <= 'z'; c++) {
                if (originChar == c) {
                    continue;
                }
                charArray[i] = c;
                String nextWord = String.valueOf(charArray);
                if (wordSet.contains(nextWord)) {
                    if (endVisited.contains(nextWord)) {
                        return true;
                    }
                    if (!visited.contains(nextWord)) {
                        nextLevelVisited.add(nextWord);
                        visited.add(nextWord);
                    }
                }
            }
            // 恢复，下次再用
            charArray[i] = originChar;
        }
        return false;
    }
}
