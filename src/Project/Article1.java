package Project;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;

public class Article1 {

    public String Article;
    public String userInputArticle;

    public Article1(String data) {
        this.userInputArticle = data;
    }

    public String[] assignArticle(String article) {
        String[] splitArticle = article.split(article);
        System.out.println(Arrays.toString(splitArticle));
        return splitArticle;
    }

    public static String readFileAsString(String fileName)
        throws Exception {
        String data = "";
        data = new String(
            Files.readAllBytes(Paths.get(fileName)));
        return data;
    }

    public String regex(String fileName) {
        String ArticleApostrophe = fileName.replaceAll("[\'’]", "");
        String ArticleLowercase = ArticleApostrophe.replaceAll("[^a-zA-Z]", " ");
        String CleanArticle = ArticleLowercase.replaceAll("( )+", " ");
        return CleanArticle;
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

    public static ArrayList<String> getArticleContent(String fileName) throws Exception {
        return fileToArrayList(fileName);
    }

    public static void main(String[] args) throws Exception {
        String fileName1 = "News Articles\\Center.txt";
        String fileName2 = "News Articles\\Left.txt";
        String fileName3 = "News Articles\\Right.txt";
        
        // Convert file content to ArrayList
        ArrayList<String> cleanArray1 = Article1.fileToArrayList(fileName1);
        ArrayList<String> cleanArray2 = Article1.fileToArrayList(fileName2);
        ArrayList<String> cleanArray3 = Article1.fileToArrayList(fileName3);
        

    }
    
}
