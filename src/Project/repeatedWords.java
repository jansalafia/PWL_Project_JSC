package Project;

import java.util.*;

public class RepeatedWords {

    public static void main(String[] args) throws Exception {
        String[] fileNames = {
                "Topic 1 Articles\\Center1.txt", "Topic 1 Articles\\Left1.txt", "Topic 1 Articles\\Right1.txt",
                "Topic 2 Articles\\Center2.txt", "Topic 2 Articles\\Left2.txt", "Topic 2 Articles\\Right2.txt",
                "Topic 3 Articles\\Center3.txt", "Topic 3 Articles\\Left3.txt", "Topic 3 Articles\\Right3.txt"
        };

        ArrayList<String> allWords = new ArrayList<>();

        // Find the 20 most used words
        List<String> mostUsedWords = findMostUsedWords(allWords, 20);
        System.out.println("The 20 most used words are: ");
        for (String word : mostUsedWords) {
              System.out.println(word);
        }
    }

    public static List<String> findMostUsedWords(ArrayList<String> words, int n) {
        Collections.sort(words);

        List<String> mostUsedWords = new ArrayList<>();
        int count = 1;
        int maxCount = 0;
        String prevWord = "";
        String maxWord = "";
        ArrayList<String> topWords = new ArrayList<>();

        for (int i = 0; i < words.size(); i++) {
            String word = words.get(i);

            // Check if the word matches with previous word
            if (word.equals(prevWord)) {
                count++;
            } else {
                if (count > maxCount) {
                    maxCount = count;
                    maxWord = prevWord;
                    topWords.add(maxWord);
                }
                count = 1;
                prevWord = word;
            }
        }

        Collections.sort(topWords, new Comparator<String>() {
            public int compare(String a, String b) {
                return a.compareTo(b);
            }
        });

        for (int i = 0; i < Math.min(n, topWords.size()); i++) {
            mostUsedWords.add(topWords.get(i));
        }

        return mostUsedWords;
    }
}

