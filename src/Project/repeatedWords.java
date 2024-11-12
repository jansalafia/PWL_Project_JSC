package Project;

import java.util.*;

public class repeatedWords {

    public static List<String> findMostUsedWords(ArrayList<String> words) {
        Map<String, Integer> wordCountMap = new HashMap<>();

        for (String word : words) {
            wordCountMap.put(word, wordCountMap.getOrDefault(word, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedEntries = new ArrayList<>(wordCountMap.entrySet());
        sortedEntries.sort((entry1, entry2) -> entry2.getValue().compareTo(entry1.getValue()));

        List<String> mostUsedWords = new ArrayList<>();
        for (int i = 0; i < Math.min(10, sortedEntries.size()); i++) {
            mostUsedWords.add(sortedEntries.get(i).getKey());
        }

        return mostUsedWords;
    }
}
