package Project;

import java.util.ArrayList;

public class WordCount {
    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static int countWordsInArrayList(ArrayList<String> wordsList) {
        StringBuilder combinedString = new StringBuilder();
        for (String word : wordsList) {
            combinedString.append(word).append(" ");
        }
        return countWordsUsingSplit(combinedString.toString().trim());
    }

    public static void main(String[] args) throws Exception {
        String fileName1 = "News Articles\\Center.txt";
        String fileName2 = "News Articles\\Left.txt";
        String fileName3 = "News Articles\\Right.txt";
        
        // Convert file content to ArrayList
        ArrayList<String> cleanArray1 = Article1.getArticleContent(fileName1);
        ArrayList<String> cleanArray2 = Article1.getArticleContent(fileName2);
        ArrayList<String> cleanArray3 = Article1.getArticleContent(fileName3);
        
        // Print the ArrayList
        //System.out.println(cleanArray1);
        
        // Count words in cleanArray1
        int wordCount1 = countWordsInArrayList(cleanArray1);
        int wordCount2 = countWordsInArrayList(cleanArray2);
        int wordCount3 = countWordsInArrayList(cleanArray3);
        System.out.println("Word count for Article 1: " + wordCount1);
        System.out.println("Word count for Article 2: " + wordCount2);
        System.out.println("Word count for Article 3: " + wordCount3);
    }
}
