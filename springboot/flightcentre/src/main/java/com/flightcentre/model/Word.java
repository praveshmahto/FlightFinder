package com.flightcentre.model;

import java.util.Objects;

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
	


	@Override
	public int hashCode() {
		return Objects.hash(jumbled, word, wordCount);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Word other = (Word) obj;
		return Objects.equals(jumbled, other.jumbled) && Objects.equals(word, other.word)
				&& wordCount == other.wordCount;
	}

}
