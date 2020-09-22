package com.challenge.stringoperator.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.challenge.stringoperator.model.Palindrome;
import com.challenge.stringoperator.service.PalindromeService;

@RestController
public class StringOperationsController {

	@Autowired
	PalindromeService palindromeService;

	@GetMapping("/getAllPalindromes")
	public ResponseEntity<List<Palindrome>> getAllPalindromes() {
		return new ResponseEntity<List<Palindrome>>(palindromeService.getAllPalindromes(), HttpStatus.OK);
	}

	@GetMapping("/getPalindromeById")
	public ResponseEntity<String> getStoredPalindrome(@RequestParam long id) {
		return new ResponseEntity<String>(palindromeService.getStoredPalindrome(id), HttpStatus.OK);
	}

	@GetMapping("/storePalindrome")
	public ResponseEntity<Palindrome> storePalindrome(@RequestParam String value) {
		String palindrome = palindromeService.findLongestPalindrome(value);
		Palindrome pal = new Palindrome();
		pal.setValue(palindrome);
		return new ResponseEntity<Palindrome>(palindromeService.savePalindrome(pal), HttpStatus.CREATED);
	}
}
