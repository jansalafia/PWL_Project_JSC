package Project;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class WordFrequency {

    // Helper class to store word-frequency pairs
    class WordCount {
        String word;
        int count;

        WordCount(String word, int count) {
            this.word = word;
            this.count = count;
        }
    }

    // Method to count and sort word frequencies in a cleaned article
    public void countWordFrequencies(ArrayList<String> cleanedArticle) {
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

        // Create an ArrayList of WordCount objects for sorting
        ArrayList<WordCount> wordCountList = new ArrayList<>();
        for (int i = 0; i < uniqueWords.size(); i++) {
            wordCountList.add(new WordCount(uniqueWords.get(i), wordCounts.get(i)));
        }

        // Sort the wordCountList by count in descending order
        Collections.sort(wordCountList, new Comparator<WordCount>() {
            @Override
            public int compare(WordCount wc1, WordCount wc2) {
                return wc2.count - wc1.count;  // Sort by count in descending order
            }
        });

        // Display sorted word frequencies
        for (WordCount wordCount : wordCountList) {
            System.out.println(wordCount.word + ": " + wordCount.count);


        }
    }
}
