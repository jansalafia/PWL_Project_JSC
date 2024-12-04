package Project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Attitude {


    final String ANSI_GREEN = "\u001B[32m";
    final String ANSI_RESET = "\u001B[0m";
    final String ANSI_RED = "\u001B[31m";

    
    private static Set<String> positiveWords;
    private static Set<String> negativeWords;

    // Static block to load the words only once
    static {
        try {
            positiveWords = loadWordsFromFile("positive-words.txt");
            negativeWords = loadWordsFromFile("negative-words.txt");
        } catch (IOException e) {
            e.printStackTrace();
            positiveWords = new HashSet<>();
            negativeWords = new HashSet<>();
        }
    }

    public Attitude() {
        // Constructor is empty since words are loaded in static initializer
    }

    // Helper method to load words from a file
    private static Set<String> loadWordsFromFile(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        return new HashSet<>(lines);
    }

    // Method to count positive sentiment
    public static int countPositiveSentiment(ArrayList<String> words) {
        int positiveWordCount = 0;
        for (String word : words) {
            if (positiveWords.contains(word.toLowerCase())) {
                positiveWordCount++;
            }
        }
        System.out.println("Positive word count: " + positiveWordCount);
        return positiveWordCount;
    }

    // Method to count negative sentiment
    public static int countNegativeSentiment(ArrayList<String> words) {
        int negativeWordCount = 0;
        for (String word : words) {
            if (negativeWords.contains(word.toLowerCase())) {
                negativeWordCount++;
            }
        }
        System.out.println("Negative word count: " + negativeWordCount);
        return negativeWordCount;
    }

    public String analyzeSentiment(ArrayList<String> words) {
        int positiveCount = countPositiveSentiment(words);
        int negativeCount = countNegativeSentiment(words);

        // Determine overall sentiment and return as string
        if (positiveCount > negativeCount) {
            return ANSI_GREEN + "Positive" + ANSI_RESET;
        }
        else {
            return ANSI_RED + "Negative" + ANSI_RESET;
        }
    }
}
