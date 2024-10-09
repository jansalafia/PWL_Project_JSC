package Project;

public class WordCount {
    public static int countWordsUsingSplit(String input) {
        if (input == null || input.isEmpty()) {
            return 0;
        }

        String[] words = input.trim().split("\\s+");
        return words.length;
    }

    public static void main(String[] args) {
        String input = firstArticle.getArticleContent();
        System.out.println("Word count: " + countWordsUsingSplit(input));
    }
}
