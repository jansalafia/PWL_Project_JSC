package Project;
import java.nio.file.*;
import java.util.ArrayList;
import java.util.Arrays;

public class ArticleCleaner {

    public String Article;
    public String userInputArticle;

    public ArticleCleaner(String data) {
        this.userInputArticle = data;
    }

    public String[] assignArticle(String article) {
        String[] splitArticle = article.split(article);
        System.out.println(Arrays.toString(splitArticle));
        return splitArticle;
    }

    public static String readFileAsString(String fileName)
        throws Exception {
        String data;
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
        ArrayList<String> cleanArray1 = ArticleCleaner.fileToArrayList(fileName1);
        ArrayList<String> cleanArray2 = ArticleCleaner.fileToArrayList(fileName2);
        ArrayList<String> cleanArray3 = ArticleCleaner.fileToArrayList(fileName3);

        ArrayList<String> cleanArray4 = ArticleCleaner.fileToArrayList(fileName4);
        ArrayList<String> cleanArray5 = ArticleCleaner.fileToArrayList(fileName5);
        ArrayList<String> cleanArray6 = ArticleCleaner.fileToArrayList(fileName6);

        ArrayList<String> cleanArray7 = ArticleCleaner.fileToArrayList(fileName7);
        ArrayList<String> cleanArray8 = ArticleCleaner.fileToArrayList(fileName8);
        ArrayList<String> cleanArray9 = ArticleCleaner.fileToArrayList(fileName9);


    }
    
}
