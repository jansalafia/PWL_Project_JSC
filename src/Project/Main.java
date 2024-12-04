package Project;
import static Project.WordCount.countWordsInArrayList;
import java.util.ArrayList;
import java.util.Scanner;




public class Main {
    public static void main(String[] args) throws Exception {


        final String ANSI_RESET = "\u001B[0m";
        final String ANSI_WHITE = "\u001B[37m";
        

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

        String fileNameCustom1 = "Custom Articles\\CustomArticle1.txt";
        String fileNameCustom2 = "Custom Articles\\CustomArticle2.txt";
        String fileNameCustom3 = "Custom Articles\\CustomArticle3.txt";


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

        ArrayList<String> cleanArrayCustom1 = ArticleCleaner.fileToArrayList(fileNameCustom1);
        ArrayList<String> cleanArrayCustom2 = ArticleCleaner.fileToArrayList(fileNameCustom2);
        ArrayList<String> cleanArrayCustom3 = ArticleCleaner.fileToArrayList(fileNameCustom3);

        //STOP WORD SORT
        String stopWordsFilePath = "ListOfStopWords";
        StopWordSort stopWordSort = new StopWordSort(stopWordsFilePath);
           
        ArrayList<String> filteredArray1 = stopWordSort.removeStopWords(cleanArray1);
        ArrayList<String> filteredArray2 = stopWordSort.removeStopWords(cleanArray2);
        ArrayList<String> filteredArray3 = stopWordSort.removeStopWords(cleanArray3);
        ArrayList<String> filteredArray4 = stopWordSort.removeStopWords(cleanArray4);
        ArrayList<String> filteredArray5 = stopWordSort.removeStopWords(cleanArray5);
        ArrayList<String> filteredArray6 = stopWordSort.removeStopWords(cleanArray6);
        ArrayList<String> filteredArray7 = stopWordSort.removeStopWords(cleanArray7);
        ArrayList<String> filteredArray8 = stopWordSort.removeStopWords(cleanArray8);
        ArrayList<String> filteredArray9 = stopWordSort.removeStopWords(cleanArray9);
        ArrayList<String> filteredArrayCustom1 = stopWordSort.removeStopWords(cleanArrayCustom1);
        ArrayList<String> filteredArrayCustom2 = stopWordSort.removeStopWords(cleanArrayCustom1);
        ArrayList<String> filteredArrayCustom3 = stopWordSort.removeStopWords(cleanArrayCustom1);


        // //WORD FREQUENCY
        WordFrequency wordFrequency = new WordFrequency();
        
        // //Sentiment Analysis
        Attitude attitudeAnalyzer = new Attitude();



        
        Scanner scanner = new Scanner(System.in);
        boolean exit = false;

        System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
        System.out.println("Welcome to our Article Comperator!");
        System.out.println("There should be three topic folders, each with three articles inside of them!" + ANSI_RESET);
        
        while (!exit) {
            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
            System.out.println("");
            System.out.println("");
            System.out.println("Use the number keys to navigate the CLI");
            System.out.println("");
            System.out.println("1: Topic 1 (Middle East Conflict)");
            System.out.println("2: Topic 2 (Interest Rate Cuts)");
            System.out.println("3: Topic 3 (Election)");
            System.out.println("4: Topic 4 (Custom Topic)");
            System.out.println("5: Exit");
            System.out.print("Your Input: " + ANSI_RESET);

            int mainChoice = scanner.nextInt();
            


            switch (mainChoice) {
            
                case 1:
                    System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                    System.out.println("You have selected Topic 1");
                    System.out.println("Select the option you want: ");
                    System.out.println("1: Word Count");
                    System.out.println("2: Word Frequency");
                    System.out.println("3: Rich Word Count");
                    System.out.println("4: List of Repeated Words");
                    System.out.println("5: Sentiment Analysis");
                    System.out.println("6: Exit");
                    System.out.print("Your Input: ");
        
                    int topic1Choice = scanner.nextInt();

                    switch (topic1Choice) {
                        case 1:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have selected Topic 1");
                            System.out.println("You have chosen to see the word count of Topic 1");
                            int wordCount1 = countWordsInArrayList(cleanArray1);
                            int wordCount2 = countWordsInArrayList(cleanArray2);
                            int wordCount3 = countWordsInArrayList(cleanArray3);
                            System.out.println("Word count for Topic 1, Article 1: " + wordCount1);
                            System.out.println("Word count for Topic 1, Article 2: " + wordCount2);
                            System.out.println("Word count for Topic 1, Article 3: " + wordCount3);
                            break;

                            
                        case 2:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have selected Topic 1");
                            System.out.println("You have chosen to see the word frequency of Topic 1");
                            wordFrequency.countWordFrequencies(filteredArray1);
                            wordFrequency.countWordFrequencies(filteredArray2);
                            wordFrequency.countWordFrequencies(filteredArray3);
                            break;
                            
                            
                        case 3:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have selected Topic 1");
                            System.out.println("You have chosen to see the rich word count for Topic 1");
                            System.out.print("Topic 1 Article 1 ");
                            RichWordCount.countUniqueWordFrequency(filteredArray1);
                            System.out.print("Topic 1 Article 2 ");
                            RichWordCount.countUniqueWordFrequency(filteredArray2);
                            System.out.print("Topic 1 Article 3 ");
                            RichWordCount.countUniqueWordFrequency(filteredArray3);
                            break;
                            
                        case 4:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have selected Topic 1");
                            System.out.println("You have chosen to see the list of repeated words for Topic 1");
                            System.out.print("10 Most Repeated Words for Topic 1 Article 1 ");
                            System.out.println(repeatedWords.findMostUsedWords(filteredArray1));
                            System.out.print("10 Most Repeated Words for Topic 1 Article 2 ");
                            System.out.println(repeatedWords.findMostUsedWords(filteredArray2));
                            System.out.print("10 Most Repeated Words for Topic 1 Article 3 ");
                            System.out.println(repeatedWords.findMostUsedWords(filteredArray3));
                            break;

                        case 5:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have selected Topic 1");
                            System.out.println("You have chosen to see the sentiment analysis for Topic 1");
                            String overallSentiment1 = attitudeAnalyzer.analyzeSentiment(filteredArray1);
                            System.out.println("Topic 1, Article 1 Overall Sentiment: " + overallSentiment1);

                            String overallSentiment2 = attitudeAnalyzer.analyzeSentiment(filteredArray2);
                            System.out.println("Topic 1, Article 2 Overall Sentiment: " + overallSentiment2);

                            String overallSentiment3 = attitudeAnalyzer.analyzeSentiment(filteredArray3);
                            System.out.println("Topic 1, Article 3 Overall Sentiment: " + overallSentiment3);
                            System.out.println();
                            break;

                        case 6:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have selected Topic 1");
                            System.out.println("Exiting topic 1.");
                            break;
                        default:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have selected Topic 1");
                            System.out.println("Invalid option. Please try again.");
                    }
                    break;
        
                    case 2:
                    System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                    System.out.println("You have selected Topic 1");
                    System.out.println("You have selected Topic 2");
                    System.out.println("Select the option you want: ");
                    System.out.println("1: Word Count");
                    System.out.println("2: Word Frequency");
                    System.out.println("3: Rich Word Count");
                    System.out.println("4: List of Repeated Words");
                    System.out.println("5: Sentiment Analysis");
                    System.out.println("6: Exit");
                    System.out.print("Your Input: ");
        
                    int topic2Choice = scanner.nextInt();

                    switch (topic2Choice) {
                        case 1:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the word count of Topic 2");
                            int wordCount4 = countWordsInArrayList(cleanArray4);
                            int wordCount5 = countWordsInArrayList(cleanArray5);
                            int wordCount6 = countWordsInArrayList(cleanArray6);
                            System.out.println("Word count for Topic 1, Article 1: " + wordCount4);
                            System.out.println("Word count for Topic 1, Article 2: " + wordCount5);
                            System.out.println("Word count for Topic 1, Article 3: " + wordCount6);
                            break;

                            
                        case 2:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the word frequency of Topic 2");
                            wordFrequency.countWordFrequencies(filteredArray4);
                            wordFrequency.countWordFrequencies(filteredArray5);
                            wordFrequency.countWordFrequencies(filteredArray6);
                            break;
                            
                            
                        case 3:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the rich word count for Topic 2");
                            System.out.print("Topic 2 Article 1 ");
                            RichWordCount.countUniqueWordFrequency(filteredArray4);
                            System.out.print("Topic 2 Article 2 ");
                            RichWordCount.countUniqueWordFrequency(filteredArray5);
                            System.out.print("Topic 2 Article 3 ");
                            RichWordCount.countUniqueWordFrequency(filteredArray6);
                            break;
                            
                        case 4:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the list of repeated words for Topic 2");
                            System.out.print("10 Most Repeated Words for Topic 2 Article 1 ");
                            System.out.println(repeatedWords.findMostUsedWords(filteredArray4));
                            System.out.print("10 Most Repeated Words for Topic 2 Article 2 ");
                            System.out.println(repeatedWords.findMostUsedWords(filteredArray5));
                            System.out.print("10 Most Repeated Words for Topic 2 Article 3 ");
                            System.out.println(repeatedWords.findMostUsedWords(filteredArray6));
                            break;

                        case 5:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the sentiment analysis for Topic 2");
                            String overallSentiment4 = attitudeAnalyzer.analyzeSentiment(filteredArray4);
                            System.out.println("Topic 2, Article 1 Overall Sentiment: " + overallSentiment4);

                            String overallSentiment5 = attitudeAnalyzer.analyzeSentiment(filteredArray5);
                            System.out.println("Topic 2, Article 2 Overall Sentiment: " + overallSentiment5);

                            String overallSentiment6 = attitudeAnalyzer.analyzeSentiment(filteredArray6);
                            System.out.println("Topic 2, Article 3 Overall Sentiment: " + overallSentiment6);
                            break;

                        case 6:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("Exiting topic 2");
                            break;
                        default:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("Invalid option. Please try again.");
                    }
                    break;


                    case 3:
                    System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                    System.out.println("You have selected Topic 3");
                    System.out.println("Select the option you want: ");
                    System.out.println("1: Word Count");
                    System.out.println("2: Word Frequency");
                    System.out.println("3: Rich Word Count");
                    System.out.println("4: List of Repeated Words");
                    System.out.println("5: Sentiment Analysis");
                    System.out.println("6: Exit");
                    System.out.print("Your Input: ");
        
                    int topic3Choice = scanner.nextInt();

                    switch (topic3Choice) {
                        case 1:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the word count of Topic 3");
                            int wordCount7 = countWordsInArrayList(cleanArray7);
                            int wordCount8 = countWordsInArrayList(cleanArray8);
                            int wordCount9 = countWordsInArrayList(cleanArray9);
                            System.out.println("Word count for Topic 3, Article 1: " + wordCount7);
                            System.out.println("Word count for Topic 3, Article 2: " + wordCount8);
                            System.out.println("Word count for Topic 3, Article 3: " + wordCount9);
                            break;

                            
                        case 2:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the word frequency of Topic 3");
                            wordFrequency.countWordFrequencies(filteredArray7);
                            wordFrequency.countWordFrequencies(filteredArray8);
                            wordFrequency.countWordFrequencies(filteredArray9);
                            break;
                            
                            
                        case 3:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the rich word count for Topic 3");
                            System.out.print("Topic 3 Article 1 ");
                            RichWordCount.countUniqueWordFrequency(filteredArray7);
                            System.out.print("Topic 3 Article 2 ");
                            RichWordCount.countUniqueWordFrequency(filteredArray8);
                            System.out.print("Topic 3 Article 3 ");
                            RichWordCount.countUniqueWordFrequency(filteredArray9);
                            break;
                            
                        case 4:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the list of repeated words for Topic 3");
                            System.out.print("10 Most Repeated Words for Topic 3 Article 1 ");
                            System.out.println(repeatedWords.findMostUsedWords(filteredArray7));
                            System.out.print("10 Most Repeated Words for Topic 3 Article 2 ");
                            System.out.println(repeatedWords.findMostUsedWords(filteredArray8));
                            System.out.print("10 Most Repeated Words for Topic 3 Article 3 ");
                            System.out.println(repeatedWords.findMostUsedWords(filteredArray9));
                            break;

                        case 5:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("You have chosen to see the sentiment analysis for Topic 3");
                            String overallSentiment7 = attitudeAnalyzer.analyzeSentiment(filteredArray7);
                            System.out.println("Topic 3, Article 1 Overall Sentiment: " + overallSentiment7);

                            String overallSentiment8 = attitudeAnalyzer.analyzeSentiment(filteredArray8);
                            System.out.println("Topic 3, Article 2 Overall Sentiment: " + overallSentiment8);

                            String overallSentiment9 = attitudeAnalyzer.analyzeSentiment(filteredArray9);
                            System.out.println("Topic 3, Article 3 Overall Sentiment: " + overallSentiment9);
                            break;

                        case 6:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("Exiting topic 3");
                            break;
                        default:
                            System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                            System.out.println("Invalid option. Please try again.");
                    }  
                    break;

        
                case 4:
                System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                System.out.println("You have selected Custom Topic");
                System.out.println("Select the option you want: ");
                System.out.println("1: Word Count");
                System.out.println("2: Word Frequency");
                System.out.println("3: Rich Word Count");
                System.out.println("4: List of Repeated Words");
                System.out.println("5: Sentiment Analysis");
                System.out.println("6: Exit");
                System.out.print("Your Input: ");
    
                int topic4Choice = scanner.nextInt();

                switch (topic4Choice) {
                    case 1:
                        System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                        System.out.println("You have chosen to see the word count of Custom Articles");
                        int wordCountCustom1 = countWordsInArrayList(cleanArrayCustom1);
                        int wordCountCustom2 = countWordsInArrayList(cleanArrayCustom2);
                        int wordCountCustom3 = countWordsInArrayList(cleanArrayCustom3);
                        System.out.println("Word count for Custom Topic, Article 1: " + wordCountCustom1);
                        System.out.println("Word count for Custom Topic, Article 2: " + wordCountCustom2);
                        System.out.println("Word count for Custom Topic, Article 3: " + wordCountCustom3);
                        break;

                        
                    case 2:
                        System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                        System.out.println("You have chosen to see the word frequency of Custom Articles");
                        wordFrequency.countWordFrequencies(filteredArrayCustom1);
                        wordFrequency.countWordFrequencies(filteredArrayCustom2);
                        wordFrequency.countWordFrequencies(filteredArrayCustom3);
                        break;
                        
                        
                    case 3:
                        System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                        System.out.println("You have chosen to see the rich word count for Custom Articles");
                        System.out.print("Custom Articles: Article 1 ");
                        RichWordCount.countUniqueWordFrequency(filteredArrayCustom1);
                        System.out.print("Custom Articles: Article 2 ");
                        RichWordCount.countUniqueWordFrequency(filteredArrayCustom1);
                        System.out.print("Custom Articles: Article 3 ");
                        RichWordCount.countUniqueWordFrequency(filteredArrayCustom1);
                        break;
                        
                    case 4:
                        System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                        System.out.println("You have chosen to see the list of repeated words for Custom Articles");
                        System.out.print("10 Most Repeated Words for Custom Articles: Article 1 ");
                        System.out.println(repeatedWords.findMostUsedWords(filteredArrayCustom1));
                        System.out.print("10 Most Repeated Words for Custom Articles: Article 2 ");
                        System.out.println(repeatedWords.findMostUsedWords(filteredArrayCustom2));
                        System.out.print("10 Most Repeated Words for Custom Articles: Article 3 ");
                        System.out.println(repeatedWords.findMostUsedWords(filteredArrayCustom3));
                        break;

                    case 5:
                        System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                        System.out.println("You have chosen to see the sentiment analysis for Custom Articles");
                        String overallSentimentCustom1 = attitudeAnalyzer.analyzeSentiment(filteredArrayCustom1);
                        System.out.println("Custom Articles, Article 1 Overall Sentiment: " + overallSentimentCustom1);

                        String overallSentimentCustom2 = attitudeAnalyzer.analyzeSentiment(filteredArrayCustom2);
                        System.out.println("Custom Articles, Article 2 Overall Sentiment: " + overallSentimentCustom2);

                        String overallSentimentCustom3 = attitudeAnalyzer.analyzeSentiment(filteredArrayCustom3);
                        System.out.println("Custom Articles, Article 3 Overall Sentiment: " + overallSentimentCustom3);
                        break;

                    case 6:
                        System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                        System.out.println("Exiting Custom Articles");
                        break;
                    default:
                        System.out.println(ANSI_WHITE + "------------------------------------------------------" + ANSI_RESET);
                        System.out.println("Invalid option. Please try again.");
                }
                break;
        
                case 5:
                System.out.println("Exiting program");
                exit = true;
                break;

                default:
                    System.out.println("Invalid topic choice. Please try again.");
                    break;
            }
        }
        scanner.close();
    }
}    