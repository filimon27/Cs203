package myutil;

public class WordCounterTester {
	public static void main(String [] args) {
		
		WordCount wordCount= new WordCount("hey abela");
		wordCount.wordCounter();
		//System.out.println(wordCount.wordCounter());
		wordCount.setCount();
		wordCount.coounterDisplay();
		wordCount.wordCounter();
		wordCount.coounterDisplay();
		wordCount.incrementCounter();
		wordCount.coounterDisplay();
	
		
	}

}
