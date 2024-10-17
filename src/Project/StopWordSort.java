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
                stopWords.add(line.trim().toLowerCase());
            }
        } catch (FileNotFoundException e) {
            System.out.println("Error: Stop words file not found: " + filePath);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return stopWords;
    }

    // Method to remove stop words from the article content
    public static String removeStopWords(String articleContent, List<String> stopWords) {
        StringBuilder result = new StringBuilder();
        String[] words = articleContent.split("\\s+"); 

        for (String word : words) {
            // Check if the word is not a stop word and add it to the result
            if (!stopWords.contains(word.toLowerCase())) {
                result.append(word).append(" ");
            }
        }
        return result.toString().trim(); 
    }

    // Method to read all articles from a directory and return a list of article content
    public static List<String> loadAllArticles(String directoryPath) {
        List<String> articles = new ArrayList<>();
        File dir = new File(directoryPath);

        if (dir.exists() && dir.isDirectory()) {
            File[] files = dir.listFiles((d, name) -> name.endsWith(".txt")); 
            if (files != null) {
                for (File file : files) {
                    try (BufferedReader br = new BufferedReader(new FileReader(file))) {
                        StringBuilder articleContent = new StringBuilder();
                        String line;
                        while ((line = br.readLine()) != null) {
                            articleContent.append(line).append(" ");
                        }
                        articles.add(articleContent.toString().trim());
                    } catch (IOException e) {
                        System.out.println("Error reading article file: " + file.getName());
                        e.printStackTrace();
                    }
                }
            }
        } else {
            System.out.println("Directory not found: " + directoryPath);
        }
        return articles;
    }

    public static void main(String[] args) {
        // File path for the ListOfStopWords.txt
        String stopWordsFilePath = "ListOfStopWords.txt";
        
        // Load stop words from the file
        List<String> stopWords = loadStopWords(stopWordsFilePath);
        
        // Load all articles from Topic 1, 2, and 3 directories
        String[] articleDirectories = {
            "Topic 1 Articles",
            "Topic 2 Articles",
            "Topic 3 Articles"
        };

        // Process articles from all directories
        for (String directory : articleDirectories) {
            List<String> articles = loadAllArticles(directory);
            for (String article : articles) {
                // Remove stop words from the article
                String filteredArticle = removeStopWords(article, stopWords);
                
                // Output the result
                System.out.println("Filtered Article from " + directory + ": ");
                System.out.println(filteredArticle);
                System.out.println("---------------------------------------");
            }
        }
    }
}