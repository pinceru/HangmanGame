package gallows;

public class DrawGallows {
	public static void draw(int mistakes) {
		System.out.println("  _______     ");
		System.out.println(" |/      | ");   
		
		if(mistakes == 1) {
			System.out.println(" |      (_)   ");
			System.out.println(" |            ");
			System.out.println(" |            ");
			System.out.println(" |            ");
		}
		
		if(mistakes == 2) {
			System.out.println(" |      (_)   ");
			System.out.println(" |       |    ");
			System.out.println(" |            ");
			System.out.println(" |            ");
		}
		
		if(mistakes == 3) {
			System.out.println(" |      (_)   ");
			System.out.println(" |      /|    ");
			System.out.println(" |            ");
			System.out.println(" |            ");
		}
		
		if(mistakes == 4) {
			System.out.println(" |      (_)   ");
			System.out.println(" |      /|/   ");
			System.out.println(" |            ");
			System.out.println(" |            ");
		}
		
		if(mistakes == 5) {
			System.out.println(" |      (_)   ");
			System.out.println(" |      /|/   ");
			System.out.println(" |       |    ");
			System.out.println(" |            ");
		}
		
		if(mistakes == 6) {
			System.out.println(" |      (_)   ");
			System.out.println(" |      /|/   ");
			System.out.println(" |       |    ");
			System.out.println(" |      /     ");
		}
		
		if(mistakes == 7) {
			System.out.println(" |      (_)   ");
			System.out.println(" |      /|/   ");
			System.out.println(" |       |    ");
			System.out.println(" |      / /   ");
		}
		
		System.out.println(" |            ");
		System.out.println("_|___         ");
	}
	
	public static void winner() {
		System.out.println("\nParabéns, você ganhou!");
		System.out.println("       ___________      ");
		System.out.println("      '._==_==_=_.'     ");
		System.out.println("      .-\\:      /-.    ");
		System.out.println("     | (|:.     |) |    ");
		System.out.println("      '-|:.     |-'     ");
		System.out.println("        \\::.    /      ");
		System.out.println("         '::. .'        ");
		System.out.println("           ) (          ");
		System.out.println("         _.' '._        ");
		System.out.println("        '-------'       ");
	}
}
