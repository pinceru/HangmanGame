package forca;

import java.util.ArrayList;
import java.util.List;

public class CorrectLetters {

//	public static List<Character> getCorrectLetters(String secretWord) {
//		
//		List<Character> letters = new ArrayList<>();
//		for(int i = 0; i < secretWord.length(); i++) {
//			letters.add(secretWord.charAt(i));
//		}
//		
//		StringBuilder stringBuilder = new StringBuilder();
//		
////		for(Character letter : letters) {
////			letter.s
////		}
//		
//	}
//	
	
	public static char[] hideLetters(String secretWord) {
		String wordHided = secretWord.replaceAll("[A-Z]", "_");
		return wordHided.toCharArray();
	}
	
}
