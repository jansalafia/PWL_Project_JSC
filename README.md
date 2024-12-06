# Programming Workshop News Lab Jan Salafia, Sean Salafia, Carlos Castillo

## Developer Contact:
- **Jan Salafia** - jan.salafia@student.fairfield.edu
- **Sean Salafia** - sean.salafia@student.fairfield.edu
- **Carlos Castillo** - carlos.castillo@student.fairfield.edu

## Features
- Take input articles as text files and convert them to arrays of words.
- Clean the articles, removing punctuation.
- Take the word count of the articles.
- Further clean articles, removing stop words.
- Analyze word frequency.

## Overview of Classes

### Main
Combines methods from all files and performs analysis on input articles.

- Assigns all filepaths of articles to variables
- Uses `fileToArrayList(filepath)` to convert the text file to an clean array of strings (no punctuation) and assigns it to variable `cleanArray#`.
- Uses `removeStopWords(cleanArray#)` to remove all stop words from all files.
- Preprocessing completed, GUI printed into console and switchcase opened, listening for user input.
- Prompts user to select which which article topic they want to explore
- Prompts user to select what function they want to use on the article
- GUI continues to offer choices until user selects Exit Program.



### WordCount
Provides methods to count words from input strings.

#### `countWordsUsingSplit(String input)`
- **Purpose**: Counts the number of words in a given string using the `split()` method.
- **Parameters**: A string `input` (the text to analyze).
- **Returns**: An integer representing the word count.

#### `countWordsInArrayList(ArrayList<String> wordsList)`
- **Purpose**: Concatenates a list of strings into a single string and counts the words in it.
- **Parameters**: An `ArrayList<String>` of words.
- **Returns**: An integer representing the word count of the combined list.

### ArticleCleaner
Provides utilities for reading, cleaning, and processing article text.

#### `ArticleCleaner(String data)`
- **Purpose**: Initializes the `userInputArticle` with the provided string data.

#### `readFileAsString(String fileName)`
- **Purpose**: Reads the content of a file and returns it as a string.
- **Parameters**: A string `fileName` representing the file path.
- **Returns**: The contents of the file as a string.

#### `assignArticle(String article)`
- **Purpose**: Splits the article string into individual words in an array.
- **Parameters**: A string which represents the article.
- **Returns**: A string array containing the article split into an `ArrayList` whose elements are each individual word.

### Stop word sort

Provides functionality to take remove stop words from a string of text

#### `loadStopWords(String filePath)`
- **Purpose**: Reads stop words from a text file and returns them as a list.
- **Parameters**: 
  - `String filePath`: The file path to the stop words file.
- **Returns**: A `List<String>` containing the stop words.

#### `removeStopWords(String articleContent, List<String> stopWords)`
- **Purpose**: Removes stop words from a string of article content.
- **Parameters**: 
  - `String articleContent`: The content of the article.
  - `List<String> stopWords`: The list of stop words.
- **Returns**: A `String` with the stop words removed.

#### `loadAllArticles(String directoryPath)`
- **Purpose**: Reads all text files from a directory and returns their contents as a list of strings.
- **Parameters**: 
  - `String directoryPath`: The directory path containing article text files.
- **Returns**: A `List<String>` of article content.

### WordFrequency
Provides functionality to count and sort word frequencies in an article.

#### `countWordFrequencies(ArrayList<String> cleanedArticle)`
- **Purpose**: Counts the frequency of each unique word in the provided `cleanedArticle` list.
- **Parameters**: An `ArrayList<String>` containing the words from a cleaned article.
- **Process**:
  - Manipulates two lists: one for unique words and another for their corresponding counts.
  - If a word is not found in the list, it adds the word and starts its count at 1.
  - If a word is already present, it increments its corresponding count.
- **Returns**: The method handles the counting process internally, likely for further processing or display.

### RichWordCount
Provides functionality to count word frequencies in a cleaned article.

#### `countUniqueWordFrequency(ArrayList<String> cleanedArticle)`
- **Purpose**: Counts the frequency of each unique word in the `cleanedArticle` list and outputs the total number of unique words.
- **Parameters**: 
  - `cleanedArticle`: An `ArrayList<String>` containing words from a preprocessed article.
- **Process**:
  - Uses two lists, `uniqueWords` for storing unique words and `wordCounts` for tracking their frequencies.
  - Iterates over `cleanedArticle`. If a word is not in `uniqueWords`, it adds the word and initializes its count to 1 in `wordCounts`. If the word is already present, it increments the corresponding count.
  - Calculates the total count of unique words by summing all entries in `wordCounts`.
- **Returns**: Total number of unique words in `cleanedArticle`. 

### RepeatedWords
Provides functionality to identify the most frequently used words in a given list.

#### `findMostUsedWords(ArrayList<String> words)`
- **Purpose**: Finds and returns the top 10 most frequently used words in the provided list.
- **Parameters**: 
  - `words`: An `ArrayList<String>` containing words to analyze for frequency.
- **Process**:
  - Creates a `Map<String, Integer> wordCountMap` to store each word and its frequency count.
  - Iterates over `words`, updating the count for each word in `wordCountMap`.
  - Converts `wordCountMap` entries to a list, `sortedEntries`, and sorts it by frequency in descending order.
  - Collects the top 10 most frequently used words from `sortedEntries` and adds them to `mostUsedWords`.
- **Returns**: A `List<String>` of the 10 most frequently used words in descending order of frequency.


### Attitude
A Java class for analyzing the sentiment of text based on predefined sets of positive and negative words.

#### `loadWordsFromFile(String filePath)`
- **Purpose**: Reads words from a file and returns them as a `Set<String>`.
- **Parameters**: 
  - `filePath`: The path to the file containing the list of words.
- **Returns**: A `Set<String>` with words from the file, eliminating duplicates.

#### `countPositiveSentiment(ArrayList<String> words)`
- **Purpose**: Counts the number of positive words in a list.
- **Parameters**: 
  - `words`: An `ArrayList<String>` containing words to analyze.
- **Process**: Iterates over `words`, checking each word against `positiveWords`.
- **Returns**: An integer representing the positive word count, also printed to the console.

#### `countNegativeSentiment(ArrayList<String> words)`
- **Purpose**: Counts the number of negative words in a list.
- **Parameters**: 
  - `words`: An `ArrayList<String>` containing words to analyze.
- **Process**: Iterates over `words`, checking each word against `negativeWords`.
- **Returns**: An integer representing the negative word count, also printed to the console.

#### `analyzeSentiment(ArrayList<String> words)`
- **Purpose**: Analyzes the sentiment of the text by comparing positive and negative word counts.
- **Parameters**: 
  - `words`: An `ArrayList<String>` containing words to analyze.
- **Process**: Calls `countPositiveSentiment` and `countNegativeSentiment`, comparing their results.
- **Returns**: A `String` indicating overall sentiment, either `"Positive"` or `"Negative"`.

 

## How to Run:
1. Add your article text files into the respective `Topic` folders within the project directory.
2. Copy and paste text for up to three articles in the "Custom Articles" folder for custom article option in the GUI)
3. Execute the main program. It will automatically preprocess the articles (the load the articles, assign them to ArrayList of strings, remove stop words)
4. Use number keys to navigate the GUI to select topics and functions.

## Reflection
Although our program is functional and checks all of the boxes asked for by the milestones, there are still many things to be desired. First of all, the presentation via the GUI is very wordy, and could be recolored and better arranged if we had more time. Besides that, the way that all of our data is stored in variable has much to be desired. Firstly, every article is assigned to a number which it is hardcoded to. Furthermore, each article is assigned to a variable, cleaned, and stop word sorted in individual lines of code, which makes a lot of our codebase redundant. What we could have done was applied `articleCleaner(String data)` and `removeStopWords(String articleContent, List<String> stopWords)` in a lamda function which iterates using a `forEach()` loop. This would eliminate close to a hundred lines of code and make it much easier to process different inputs. At the end of the day, however, we are satisfied with how our program and it's functionality.
