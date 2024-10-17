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



## How to Run:
1. Add your article text files into the respective `Topic` folders within the project directory.
2. Execute the main program. It will automatically load the articles, remove stop words, and analyze word frequencies for comparison.
