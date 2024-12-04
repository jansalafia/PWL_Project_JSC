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

}

