package Project;

import java.util.ArrayList;

public class RichWordCount {
    
    // Method to count and sort word frequencies in a cleaned article
    public static void countUniqueWordFrequency(ArrayList<String> cleanedArticle) {
        ArrayList<String> uniqueWords = new ArrayList<>();
        ArrayList<Integer> wordCounts = new ArrayList<>();

        for (String word : cleanedArticle) {
            int index = uniqueWords.indexOf(word);
            if (index == -1) {
                // Word not found in uniqueWords, so add it
                uniqueWords.add(word);
                wordCounts.add(1);
            } else {
                // Word found, increment its count
                int currentCount = wordCounts.get(index);
                wordCounts.set(index, currentCount + 1);
            }
        }

    int UniqueWordCount = wordCounts.stream()
    .reduce(0, (accumulator,number) -> accumulator + number);
    System.out.println("Amount of Unique Words: " + UniqueWordCount);
    }
}
