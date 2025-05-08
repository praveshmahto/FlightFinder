package com.flightcentre.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.flightcentre.service.WordCounterInJumbledString;

@RestController
@RequestMapping("/api")
public class AssignmentController {
	
	@GetMapping("/wordCount")
	public int getWordCount(@RequestParam("jumbled") String jumbled,@RequestParam("word") String word) {
		return WordCounterInJumbledString.countWordInJumbledString(jumbled, word);
	}

}
