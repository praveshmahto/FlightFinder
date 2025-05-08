package com.flightcentre.model;

public class Word {
	
	private String word;
	private String jumbled;
	private int wordCount;
	
	public Word(String word, String jumbled, int wordCount) {
		super();
		this.word = word;
		this.jumbled = jumbled;
		this.wordCount = wordCount;
	}
	public String getWord() {
		return word;
	}
	public void setWord(String word) {
		this.word = word;
	}
	public String getJumbled() {
		return jumbled;
	}
	public void setJumbled(String jumbled) {
		this.jumbled = jumbled;
	}
	public int getWordCount() {
		return wordCount;
	}
	public void setWordCount(int wordCount) {
		this.wordCount = wordCount;
	}
	

}
