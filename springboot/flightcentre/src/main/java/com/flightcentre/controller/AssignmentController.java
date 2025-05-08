package com.flightcentre.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightcentre.model.Word;
import com.flightcentre.service.WordCounterInJumbledString;

@RestController
@RequestMapping("/api")
public class AssignmentController {
	/*
	 * Can be invoked as a standalone in the browser. 
	 * Eg: http://localhost:8080/api/wordCount?jumbled=flightGhtFli&word=flight
	 */
	@GetMapping("/wordCount")
	public int getWordCount(@RequestParam("jumbled") String jumbled,@RequestParam("word") String word) {
		return WordCounterInJumbledString.countWordInJumbledString(jumbled, word);
	}
	
	/*
	 * Interfacing from React UI using request body in the POST method
	 */
	@PostMapping("/postWordCount")
	public ResponseEntity<?> postWordCount(@RequestBody Word resource) {
		
		String word = resource.getWord();
		String jumbled = resource.getJumbled();
		int wordCount = WordCounterInJumbledString.countWordInJumbledString(jumbled, word);
		 return new ResponseEntity<>(new Word(word, jumbled,wordCount), HttpStatus.OK);
	}
}
