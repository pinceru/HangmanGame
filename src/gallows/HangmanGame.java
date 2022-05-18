package gallows;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class HangmanGame {
	public static void main(String args[]) throws Exception {
		boolean died = false, won = false;
		int mistake = 0;
		String attempt = "";
		Scanner scan = new Scanner(System.in);
		Writer.writeFile();
		System.out.println("*******************************");
		System.out.println("**** Jogo da forca em Java ****");
		System.out.println("**** Por Welington Pincer  ****");
		System.out.println("*******************************");
		
		try {
			List<String> possibleWords = generateListWords();
			String secretWord = getWord(possibleWords);
			char[] wordInCharacters = secretWord.toCharArray(); 
			char[] lettersOfWord = hideLetters(secretWord);
			
			System.out.println("A palavra é: ");
			
			for(char letter : lettersOfWord) {
				System.out.print(letter + " ");
			}
			
			while(!died && !won) {
				attempt = getAttempt(scan);
				if(secretWord.contains(attempt)) {
					addScore(wordInCharacters, attempt, lettersOfWord);
				} else {
					mistake +=1;
					DrawGallows.draw(mistake);
				}
				
				for(char letter : lettersOfWord) {
					System.out.print(letter + " ");
				}
				if(mistake == 7) {
					died = true;
					System.out.println("Puxa, você foi enforcado! :( ");
					System.out.println("A palavra era : " + secretWord);
				}

				if(win(lettersOfWord)) {
					won = true;
					DrawGallows.winner();
				}
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
	private static void addScore(char[] wordInCharacters, String attempt, char[] lettersOfWord) {
		int index = 0;
		for(char letter : wordInCharacters) {
			if(letter == attempt.charAt(0)) {
				lettersOfWord[index] = letter;
			}
			index++;
		}
	}

	public static String getAttempt(Scanner scan) {
		System.out.print("\n\nChute uma letra: ");
		String letter = scan.next();
		if(letter.length() > 1) {
			throw new CharException();
		}
		
		return letter.toUpperCase();
	}
	
	public static char[] hideLetters(String secretWord) {
		String wordHided = secretWord.replaceAll("[A-Z]", "_");
		return wordHided.toCharArray();
	}
	
	private static List<String> generateListWords() throws Exception {
		Scanner scan = new Scanner(new File("words.txt"));
		List<String> possibleWords = new ArrayList<String>();
		
		while(scan.hasNextLine()) {
			String line = scan.nextLine();
			
			Scanner lineScan = new Scanner(line);
			lineScan.useDelimiter(",");
			
			String word = lineScan.next();
			possibleWords.add(word);
			lineScan.close();
		}	
		scan.close();
		
		return possibleWords;
	}
	
	private static String getWord(List<String> possibleWords) {
		return possibleWords.get(new Random().nextInt(possibleWords.size()));
	}
	
	public static boolean win(char[] lettersOfWord) {
		List<Character> comparator = new ArrayList<>();
		for(char letter : lettersOfWord) {
			if(letter != '_') {
				comparator.add(letter);
			}
		}
		if(comparator.size() == lettersOfWord.length) {
			return true;
		}
		return false;
	}
	
}
