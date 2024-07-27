import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
public class FormattingFileInput{
	public static void main(String args[]) throws IOException {
		
	}
	public static void FormatWithString(String a) throws IOException {
		//Scans the song code, finding the chunk with x lines, where x is the largest number of lines any chunk in the song has.
		//The song therefore requires x threads to play, and x is prepended to the front of the song code.
		//This class is able to accept file input, making it more modular than its consoleIO counterpart.
		System.out.println("Formatting the Song (Prepending Thread Count) w/ File Input");
		Scanner scaboo = new Scanner(a);
		ArrayList<String> formatted = new ArrayList<String>();
		int Pianos = 0;
		int temp = 0;
		FileWriter writer = new FileWriter(System.getenv("APPDATA")+"\\.pianoplayer\\formatted");
		PrintWriter printwriter = new PrintWriter(writer);
		printwriter.print("");
		while(scaboo.hasNextLine()) {
			String notPerm = scaboo.nextLine();
			if (notPerm.equals("")) {
				if (temp>Pianos) {
					Pianos=temp;
				}
				temp=0;
			} else {
				temp++;
			}
			formatted.add(notPerm);
		}
		if (temp>Pianos) {
			Pianos=temp;
		}
		printwriter.print(Pianos+"\n");
		for(int i=0;i<formatted.size();i++) {
			printwriter.print(formatted.get(i)+("\n"));
		}
		scaboo.close();
		writer.close();
	}
}