package Project;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArticleCleaner {

        //Initialize Variables
    public String Article;
    public String userInputArticle;

        //Constructor
    public ArticleCleaner(String data) {
        this.userInputArticle = data;
    }
        //Assign articles
    public String[] assignArticle(String article) {
        String[] splitArticle = article.split(article);
        System.out.println(Arrays.toString(splitArticle));
        return splitArticle;
    }
        //Reader method
    public static String readFileAsString(String fileName)
        throws Exception {
        String data;
        data = new String(
            Files.readAllBytes(Paths.get(fileName)));
        return data;
    }
        // Method to turn the file content into an ArrayList<String>
    public static ArrayList<String> fileToArrayList(String fileName)
        throws Exception {
        // Read file as a single string
        String fileContent = readFileAsString(fileName);
        
        // Use regex to clean the file content (optional)
        String cleanedContent = fileContent.replaceAll("[\'’]", "")
                                .replaceAll("[^a-zA-Z]", " ")
                                .replaceAll("( )+", " ");
        
        // Split the cleaned content into individual words and add to ArrayList
        ArrayList<String> wordList = new ArrayList<>(Arrays.asList(cleanedContent.split(" ")));
        return wordList;
    }
        //Method for getting article content
    public static ArrayList<String> getArticleContent(String fileName) throws Exception {
        return fileToArrayList(fileName);
    }

}
     
