package gallows;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.List;

public class Writer {
	public static void writeFile() throws Exception {
		FileWriter writer = new FileWriter("words.txt");
		writer.write("ARANHA,");
		writer.write(System.lineSeparator());
		writer.write("HIPOPOTAMO,");
		writer.write(System.lineSeparator());
		writer.write("PEIXE,");
		writer.write(System.lineSeparator());
		writer.write("BALEIA,");
		writer.write(System.lineSeparator());
		writer.write("CACHORRO,");
		writer.write(System.lineSeparator());
		writer.write("GOLFINHO,");
		writer.write(System.lineSeparator());
		writer.write("PELICANO,");
		writer.write(System.lineSeparator());
		writer.write("IGUANA,");
		writer.write(System.lineSeparator());
		writer.write("MACACO,");
		writer.write(System.lineSeparator());
		writer.write("JUMENTO");
		writer.write(System.lineSeparator());
		writer.close();
	}
}
