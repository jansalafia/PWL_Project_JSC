package Project;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Attitude {
    
    private static Set<String> positiveWords;
    private static Set<String> negativeWords;
        
            // Constructor: Load stop words from a specified file
            public Attitude(String filePath) throws IOException {
                Attitude.positiveWords = loadAttituteTxt(filePath);
                Attitude.negativeWords = loadAttituteTxt(filePath);
            }
        
            // Method to load stop words from a file into a Set for fast lookup
            private Set<String> loadAttituteTxt(String filePath) throws IOException {
                List<String> lines = Files.readAllLines(Paths.get(filePath));
                return new HashSet<>(lines);
            }
        
            // Method to remove stop words from a given list of words
            public static int countPositiveSentiment(ArrayList<String> words) {
                int PositveWordCount = 0;
                for (String word : words) {
                    if (positiveWords.contains(word.toLowerCase())) { 
                PositveWordCount ++;
            }
        }
        System.out.println(PositveWordCount);
        return PositveWordCount;
    }
    public int countNegativeSentiment(ArrayList<String> words) {
        int NegativeWordCount = 0;
        for (String word : words) {
            if (negativeWords.contains(word.toLowerCase())) { 
                NegativeWordCount ++;
            }
        }
        System.out.println(NegativeWordCount);
        return NegativeWordCount;
    }
    public Boolean compareSentiment(int PositveWordCount, int NegativeWordCount){

        Boolean Sentiment;

        if (PositveWordCount > NegativeWordCount){
            Sentiment = true;
        }
        else{
            Sentiment = false;
        }
        return Sentiment;

    }}