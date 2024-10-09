package Project;
public class StopWordSort {

    import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class RemoveByIterator {
    public static void main(String[] args) {
        ArrayList<String> list1 = new ArrayList<>(Arrays.asList("I", "Love", "coding", "and", "sleeping"));
        ArrayList<String> list2 = new ArrayList<>(Arrays.asList("I", "and"));
        
        // Using an iterator to remove elements from list1 if present in list2
        Iterator<String> iterator = list1.iterator();
        
        while (iterator.hasNext()) {
            String word = iterator.next();
            if (list2.contains(word)) {
                iterator.remove();
            }
        }
        
        System.out.println(list1);
    }
}
}
