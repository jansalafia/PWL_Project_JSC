package Project;
import java.util.*;

public class RichVocab {
    
    public static void main(String[] args) {
        
        // Add all lists to a list of lists
        List<ArrayList<String>> allLists = new ArrayList<>();
        allLists.add(cleanArray1);
        allLists.add(cleanArray2);
        allLists.add(cleanArray3);
        
        // Rank lists based on vocabulary richness
        List<ArrayList<String>> rankedLists = rankByVocabularyRichness(allLists);
        
        
        for (int i = 0; i < rankedLists.size(); i++) {
            System.out.println("Rank " + (i+1) + ": " + rankedLists.get(i));        // Print ranked lists
        }
    }
    
    public static List<ArrayList<String>> rankByVocabularyRichness(List<ArrayList<String>> allLists) {          // Sort the lists based on the number of unique words (size of the set)
        Collections.sort(allLists, (list1, list2) -> {
            int uniqueWordCount1 = new HashSet<>(list1).size();
            int uniqueWordCount2 = new HashSet<>(list2).size();
            return Integer.compare(uniqueWordCount2, uniqueWordCount1);
        });
        return allLists;
    }
}
