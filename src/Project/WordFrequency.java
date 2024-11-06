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

    public static void main(String[] args) throws Exception {


        String fileName1 = "Topic 1 Articles\\Center1.txt";
        String fileName2 = "Topic 1 Articles\\Left1.txt";
        String fileName3 = "Topic 1 Articles\\Right1.txt";

        String fileName4 = "Topic 2 Articles\\Center2.txt";
        String fileName5 = "Topic 2 Articles\\Left2.txt";
        String fileName6 = "Topic 2 Articles\\Right2.txt";

        String fileName7 = "Topic 3 Articles\\Center3.txt";
        String fileName8 = "Topic 3 Articles\\Left3.txt";
        String fileName9 = "Topic 3 Articles\\Right3.txt";

        // Convert file content to ArrayList
        ArrayList<String> cleanArray1 = ArticleCleaner.fileToArrayList(fileName1);
        ArrayList<String> cleanArray2 = ArticleCleaner.fileToArrayList(fileName2);
        ArrayList<String> cleanArray3 = ArticleCleaner.fileToArrayList(fileName3);
    
        ArrayList<String> cleanArray4 = ArticleCleaner.fileToArrayList(fileName4);
        ArrayList<String> cleanArray5 = ArticleCleaner.fileToArrayList(fileName5);
        ArrayList<String> cleanArray6 = ArticleCleaner.fileToArrayList(fileName6);
    
        ArrayList<String> cleanArray7 = ArticleCleaner.fileToArrayList(fileName7);
        ArrayList<String> cleanArray8 = ArticleCleaner.fileToArrayList(fileName8);
        ArrayList<String> cleanArray9 = ArticleCleaner.fileToArrayList(fileName9);
        
        WordFrequency wordFrequency = new WordFrequency();
        wordFrequency.countWordFrequencies(cleanArray1);
        wordFrequency.countWordFrequencies(cleanArray2);
        wordFrequency.countWordFrequencies(cleanArray3);
        wordFrequency.countWordFrequencies(cleanArray4);
        wordFrequency.countWordFrequencies(cleanArray5);
        wordFrequency.countWordFrequencies(cleanArray6);
        wordFrequency.countWordFrequencies(cleanArray7);
        wordFrequency.countWordFrequencies(cleanArray8);
        wordFrequency.countWordFrequencies(cleanArray9);

    }
}
 