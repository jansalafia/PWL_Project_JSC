package Project;
import java.util.List;
import java.util.ArrayList;

//import java.util.Scanner;



import static Project.WordCount.countWordsInArrayList;


public class Main {
    public static void main(String[] args) throws Exception {


        //ASSIGNS FILENAMES
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



        // WORD COUNT

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


            //WORD FREQUENCY
        WordFrequency wordFrequency = new WordFrequency();
        wordFrequency.countWordFrequencies(cleanArray1);
        wordFrequency.countWordFrequencies(cleanArray2);
        wordFrequency.countWordFrequencies(cleanArray3);
        wordFrequency.countWordFrequencies(cleanArray4);
        wordFrequency.countWordFrequencies(cleanArray5);
        wordFrequency.countWordFrequencies(cleanArray6);
        wordFrequency.countWordFrequencies(cleanArray7);
        wordFrequency.countWordFrequencies(cleanArray8);
        wordFrequency.countWordFrequencies(cleanArray9);


        List<ArrayList<String>> allLists = new ArrayList<>();
        allLists.add(cleanArray1);
        allLists.add(cleanArray2);
        allLists.add(cleanArray3);
        

    //    List<ArrayList<String>> rankedLists = rankByVocabularyRichness(allLists);
        













//        Scanner scanner = new Scanner(System.in);
//        int UserInput = scanner.nextInt();
//        boolean runMainLine = true;
//
//        System.out.println("Welcome to our Article Comperator!");
//        System.out.println("Please make sure that you have properly structured the files you want to compare in you OS file explorer.");
//        System.out.println("There should be three topics, each with three articles inside of them!");
//        System.out.println("");
//        System.out.println("----------------------------------------------------------------------");
//        System.out.println("Choose an option you would like to use!");
//        System.out.println("1. Clean articles by removing unneccessary characters:");
//        System.out.println("2. Remove stop words from the articles:");
//        System.out.println("3. Get word count for each article: ");
//        System.out.println("4. Get the word frequency for each article: ");
//        System.out.println("5. ");
//        System.out.println("6. ");
//        System.out.println("7. ");
//
//
//        while (runMainLine = true) {
//            switch (UserInput) {
//                case 1:

//                case 2:
//
//                case 3:
//
//                case 4:
//
//                case 5:
//
//                case 6:
//
//                case 7:
//
//            }
//        }
//    }
    }
}

