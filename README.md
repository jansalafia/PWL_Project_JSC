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

#### `regex(String fileName)`
- **Purpose**: Cleans an article string by removing apostrophes, non-alphabetic characters, and extra spaces.
  - Removes apostrophes.
  - Replaces non-letter characters with spaces.
  - Trims consecutive spaces to a single space.
- **Returns**: A cleaned string.

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
