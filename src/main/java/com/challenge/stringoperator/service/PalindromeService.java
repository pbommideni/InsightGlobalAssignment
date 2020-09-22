package com.challenge.stringoperator.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.challenge.stringoperator.model.Palindrome;
import com.challenge.stringoperator.repo.PalindromeRepository;

@Service
public class PalindromeService {
	@Autowired
	PalindromeRepository palindromeRepo;
	
	public List<Palindrome> getAllPalindromes(){
		return (List<Palindrome>) palindromeRepo.findAll();
	}
	public String getStoredPalindrome(long id){
		Optional<Palindrome> pal= palindromeRepo.findById(id);
		if(pal.isPresent()){
			return pal.get().getValue();
		}
		return "No palindrome found with the id";
	}
	
	public Palindrome savePalindrome(Palindrome pal){
		return palindromeRepo.save(pal);
	}
	public  String findLongestPalindrome(String s) {
	    if (s == null || s.length() < 1) return "";
	    int start = 0, end = 0;
	    for (int i = 0; i < s.length(); i++) {
	        int len1 = generate(s, i, i);
	        int len2 = generate(s, i, i + 1);
	        int len = Math.max(len1, len2);
	        if (len > end - start) {
	            start = i - (len - 1) / 2;
	            end = i + len / 2;
	        }
	    }
	    return s.substring(start, end + 1);
	}

	private static int generate(String s, int l, int r) {
	    int L = l, R = r;
	    while (L >= 0 && R < s.length() && s.charAt(L) == s.charAt(R)) {
	        L--;
	        R++;
	    }
	    return R - L - 1;
	}
	
}
