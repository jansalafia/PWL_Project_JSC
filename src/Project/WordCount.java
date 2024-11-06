package Project;

import java.util.ArrayList;

public class WordCount {

    //Method for splitting the string input
    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");
        return words.length;
    }
    //Method for counting words in the array
    public static int countWordsInArrayList(ArrayList<String> wordsList) {
        StringBuilder combinedString = new StringBuilder();
        for (String word : wordsList) {
            combinedString.append(word).append(" ");
        }
        return countWordsUsingSplit(combinedString.toString().trim());
    }
        //Mainline
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
        ArrayList<String> cleanArray1 = ArticleCleaner.getArticleContent(fileName1);
        ArrayList<String> cleanArray2 = ArticleCleaner.getArticleContent(fileName2);
        ArrayList<String> cleanArray3 = ArticleCleaner.getArticleContent(fileName3);

        ArrayList<String> cleanArray4 = ArticleCleaner.getArticleContent(fileName4);
        ArrayList<String> cleanArray5 = ArticleCleaner.getArticleContent(fileName5);
        ArrayList<String> cleanArray6 = ArticleCleaner.getArticleContent(fileName6);

        ArrayList<String> cleanArray7 = ArticleCleaner.getArticleContent(fileName7);
        ArrayList<String> cleanArray8 = ArticleCleaner.getArticleContent(fileName8);
        ArrayList<String> cleanArray9 = ArticleCleaner.getArticleContent(fileName9);
         
        // Print the ArrayList
        //System.out.println(cleanArray1);
        
        // Count words in all three articles for topic 1
        int wordCount1 = countWordsInArrayList(cleanArray1);
        int wordCount2 = countWordsInArrayList(cleanArray2);
        int wordCount3 = countWordsInArrayList(cleanArray3);
        System.out.println("Word count for Topic 2, Article 1: " + wordCount1);
        System.out.println("Word count for Topic 2, Article 2: " + wordCount2);
        System.out.println("Word count for Topic 2, Article 3: " + wordCount3);


        // Count words in all three articles for topic 2
        int wordCount4 = countWordsInArrayList(cleanArray4);
        int wordCount5 = countWordsInArrayList(cleanArray5);
        int wordCount6 = countWordsInArrayList(cleanArray6);
        System.out.println("Word count for Topic 2, Article 1: " + wordCount4);
        System.out.println("Word count for Topic 2, Article 2: " + wordCount5);
        System.out.println("Word count for Topic 2, Article 3: " + wordCount6);

        // Count words in all three articles for topic 3
        int wordCount7 = countWordsInArrayList(cleanArray7);
        int wordCount8 = countWordsInArrayList(cleanArray8);
        int wordCount9 = countWordsInArrayList(cleanArray9);
        System.out.println("Word count for Topic 3, Article 1: " + wordCount7);
        System.out.println("Word count for Topic 3, Article 2: " + wordCount8);
        System.out.println("Word count for Topic 3, Article 3: " + wordCount9);
    }
}
  