package forca;

import java.util.List;
import java.util.Scanner;

public class Forca {
	public static void main(String args[]) throws Exception {
		boolean died = false, won = false;
		int mistake = 0;
		char attempt = '0';
		Scanner scan = new Scanner(System.in);
		
		try {
			List<String> possibleWords = GenerateWord.generateListWords();
			String secretWord = GenerateWord.getWord(possibleWords);
			char[] lettersOfWord = CorrectLetters.hideLetters(secretWord);
			
			System.out.println("A palavra é: ");
			
			for(char letter : lettersOfWord) {
				System.out.print(letter + " ");
			}
			
			while(!died && !won) {
				attempt = getAttempt(scan);
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	public static char getAttempt(Scanner scan) {
		String letter = scan.next();
		if(letter.length() > 1) {
			throw new CharException();
		}
		
		String treatedLetter = letter.toUpperCase();
		return treatedLetter.charAt(0);
	}
	
}
