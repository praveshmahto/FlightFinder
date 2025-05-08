package com.flightcentre;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.flightcentre.service.WordCounterInJumbledString;

@SpringBootTest
class FlightcentreApplicationTests {
	
	private static final String word = "flight";
	
	@Test
	public void testWordLengthInSequence(){
		String suppliedString="flight";
		assertEquals(1,WordCounterInJumbledString.countWordInJumbledString(suppliedString, word));
		
		suppliedString="flightflight";
		assertEquals(2,WordCounterInJumbledString.countWordInJumbledString(suppliedString, word));
	}
	
	@Test
	public void testWordLengthInJumbledString(){
		String suppliedString="flight Ght fli";
		assertEquals(2,WordCounterInJumbledString.countWordInJumbledString(suppliedString, word));
		
		suppliedString="lightf";
		assertEquals(1,WordCounterInJumbledString.countWordInJumbledString(suppliedString, word));
		
		suppliedString="lightfabc";
		assertEquals(1,WordCounterInJumbledString.countWordInJumbledString(suppliedString, word));
		
	}
	
	@Test
	public void testNoOccurence(){
		assertEquals(0,WordCounterInJumbledString.countWordInJumbledString("abc", word));
	}
	
	@Test
	public void testWordOtherThanFlight(){
		String suppliedString="abc";
		assertEquals(0,WordCounterInJumbledString.countWordInJumbledString(suppliedString, "center"));
	}

}
