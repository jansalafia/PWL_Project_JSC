package Project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class StopWordSort {
    
    private Set<String> stopWords;

    // Constructor: Load stop words from a specified file
    public StopWordSort(String stopWordsFilePath) throws IOException {
        this.stopWords = loadStopWords(stopWordsFilePath);
    }

    // Method to load stop words from a file into a Set for fast lookup
    private Set<String> loadStopWords(String filePath) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(filePath));
        return new HashSet<>(lines);
    }

    // Method to remove stop words from a given list of words
    public ArrayList<String> removeStopWords(ArrayList<String> words) {
        ArrayList<String> filteredWords = new ArrayList<>();
        for (String word : words) {
            if (!stopWords.contains(word.toLowerCase())) { 
                filteredWords.add(word);
            }
        }
        return filteredWords;
    }

    // Main method for testing
    public static void main(String[] args) throws Exception {
        // Example usage
        String stopWordsFilePath = "ListOfStopWords";  // Path to stop words file
        StopWordSort stopWordSort = new StopWordSort(stopWordsFilePath);

        // Example article content loaded from ArticleCleaner
        String fileName = "Topic 1 Articles\\Center1.txt";
        ArrayList<String> cleanArray = ArticleCleaner.fileToArrayList(fileName);
        
        // Remove stop words from cleanArray
        ArrayList<String> filteredArray = stopWordSort.removeStopWords(cleanArray);
        
        System.out.println("Original Array: " + cleanArray);
        System.out.println("Filtered Array (no stop words): " + filteredArray);
    }
}

