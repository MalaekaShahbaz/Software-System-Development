package lab6;

public class Driver2 {
	public static void main(String[] args) {
        // Create an instance of WordCounter
        WordCounter wc = new WordCounter();
        
        // Add a sentence to the WordCounter
        wc.addSentence("This sentence has the word has in it twice");

        // Output the results: display each word and its count
        wc.outputResults();
    }
}