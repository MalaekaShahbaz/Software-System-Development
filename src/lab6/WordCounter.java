package lab6;

import java.util.HashMap;
import java.util.Map;

public class WordCounter {
	/**
	 * Maps words to their occurrence count.
	 */
	private final Map<String, Integer> wordMap = new HashMap<String, Integer>();

    // Method to add a word and count its occurrences
    public void addWord(String word) {
        // Convert the word to lower case to ensure case insensitivity
        word = word.toLowerCase();
        
        // If the word is not in the map, insert it with an initial count of 1
        if (!wordMap.containsKey(word)) {
            wordMap.put(word, 1);
        } else {
            // If the word is already in the map, increment its count
            wordMap.put(word, wordMap.get(word) + 1);
        }
    }

    // Method to add a sentence by splitting it into words
    public void addSentence(String sentence) {
        // Split the sentence by spaces and process each word
        String[] words = sentence.split("\\s+");
        for (String word : words) {
            addWord(word);
        }
    }

    // Method to output the results: word and its occurrence count
    public void outputResults() {
        // Iterate through the map and display each word and its count
        for (Map.Entry<String, Integer> entry : wordMap.entrySet()) {
            System.out.println(entry.getKey() + " : " + entry.getValue());
        }
    }
}
