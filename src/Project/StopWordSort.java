package Project;
import java.io.*;
import java.util.*;

public class StopWordSort {

    // Method to read stop words from a text file and return a List of stop words
    private static List<String> loadStopWords(String filePath) {
        List<String> stopWords = new ArrayList<>();
        try (BufferedReader br = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = br.readLine()) != null) {
                stopWords.add(line.trim().toLowerCase()); // Convert words to lowercase for case-insensitive matching
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stopWords;
    }

    // Method to remove stop words from the article content
    public static String removeStopWords(String articleContent, List<String> stopWords) {
        StringBuilder result = new StringBuilder();
        String[] words = articleContent.split("\\s+"); // Split the article into words

        for (String word : words) {
            // Check if the word is not a stop word and add it to the result
            if (!stopWords.contains(word.toLowerCase())) {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim(); // Convert StringBuilder to String and remove trailing spaces
    }

    public static void main(String[] args) {
        // File path for the ListOfStopWords.txt
        String stopWordsFilePath = "ListOfStopWords.txt";
        
        // Load stop words from the file
        List<String> stopWords = loadStopWords(stopWordsFilePath);
        
        // Example article from the Article class
        Article article = new Article();
        String articleContent = article.getArticleContent(); // Assuming Article class has getArticleContent method
        
        // Remove stop words from the article
        String filteredArticle = removeStopWords(articleContent, stopWords);
        
        // Output the result
        System.out.println("Filtered Article: ");
        System.out.println(filteredArticle);
    }
}
