package forca;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class GenerateWord {
	public static List<String> generateListWords() throws Exception {
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

	public static String getWord(List<String> possibleWords) {
		return possibleWords.get(new Random().nextInt(possibleWords.size()));
	}
}
