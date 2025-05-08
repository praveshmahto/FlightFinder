package com.flightcentre.service;

import java.util.HashMap;
import java.util.Map;

public class WordCounterInJumbledString {

	public static void main(final String[] args) {
		final String jumbled = "fflliigghhttFl ghtfli";
		final String word = "flight ";
		final int count = countWordInJumbledString(jumbled, word);
		System.out.println(word + " appears " + count + " times in the string.");

	}

	public static int countWordInJumbledString(String jumbled, String word) {
		// conver to lowercase for both the supplied string and the word
		jumbled = jumbled.toLowerCase().trim();
		word = word.toLowerCase().trim();

		// count character frequencies in the supplied string and the user input word
		final Map<Character, Integer> jumbledFreq = getCharFrequency(jumbled);
		final Map<Character, Integer> wordFreq = getCharFrequency(word);

		// Find how many times a word can be formed
		int count = Integer.MAX_VALUE;
		for (final char c : wordFreq.keySet()) {
			if (!jumbledFreq.containsKey(c)) {
				return 0;
			}
			count = Math.min(count, jumbledFreq.get(c) / wordFreq.get(c));
		}

		return count;
	}

	private static Map<Character, Integer> getCharFrequency(final String str) {
		final Map<Character, Integer> freq = new HashMap<>();
		for (final char c : str.toCharArray()) {
			freq.put(c, freq.getOrDefault(c, 0) + 1);
		}

		return freq;

	}
}
