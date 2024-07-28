import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

//Initializes files for the player: notes, file structure, and generally everything needed for the program to function.
public class initializer {
	public static void main(String[] args) {
		System.out.println(Path.of(System.getenv("APPDATA")).resolve(".pianoplayer"));
		System.out.println(System.getenv("APPDATA")+"\\.pianoplayer");
		File f = new File(System.getenv("APPDATA")+"\\.pianoplayer");
		if (f.mkdir() == true) { 
			System.out.println("Directory .pianoplayer has been created successfully"); 
			
		} 
		else { 
			System.out.println("Directory .pianoplayer cannot be created"); 
		}
		initializeFiles();
	}
	public static void initializeFiles() {
		System.out.println("Initializing files, just in case.");
		try {
			File f1 = new File(System.getenv("APPDATA")+"\\.pianoplayer\\formatted");
			File f2 = new File(System.getenv("APPDATA")+"\\.pianoplayer\\formatted2");
			File s = new File(System.getenv("APPDATA")+"\\.pianoplayer\\Songs");
			File n = new File(System.getenv("APPDATA")+"\\.pianoplayer\\Notes");
		    if (f1.createNewFile()) {
		      System.out.println("File created: " + f1.getName());
		    } else {
		    	System.out.println("File already exists.");
		    }
		    if (f2.createNewFile()) {
		    	System.out.println("File created: " + f2.getName());
			} else {
				System.out.println("File already exists.");
			}
		    if (s.mkdir() == true) { 
				System.out.println("Directory songs has been created successfully, adding example songs so empty combobox isn't called."); 
				copyFileSongs("All I want for Christmas is you");
				copyFileSongs("All Star");
				copyFileSongs("Another Day of Sun");
				copyFileSongs("Beggin");
				copyFileSongs("Californication by RHCP");
				copyFileSongs("Can't Stop by RHCP");
				copyFileSongs("Everybody Wants to Rule the World");
				copyFileSongs("Paint It, Black");
				copyFileSongs("Young Girl A");
			} 
			else { 
				System.out.println("Directory songs could not be created."); 
			}
			if (n.mkdir() == true) {
		    	for (int i = 1; i<8;i++) {
		    		for (int l = 0;l<8;l++) {
		    			if (!(l==0 && !(i==1 || i==2))) {
		    				copyFileNotes(charFromInt(i)+l);
		    				copyFileNotes(charFromInt(i)+"-"+l);
		    			}
		    		}
		    	}
		    	copyFileNotes("rrr");
		    }else { 
				System.out.println("Directory notes could not be created."); 
			}
		    } catch (IOException e) {
		      System.out.println("An error occurred while initializing files.");
		      e.printStackTrace();
		    }
	}
	//Method for copying files from the jar files to the APPDATA directories.
	public static void copyFileNotes(String fileName) throws IOException {
		InputStream inputStream = initializer.class.getResourceAsStream("src/Notes/"+fileName+".mp3");
    	Path pathTarget = Paths.get(System.getenv("APPDATA"),"/.pianoplayer/Notes/"+fileName+".mp3");
    	Files.copy(inputStream, pathTarget, StandardCopyOption.REPLACE_EXISTING);
	}
	public static void copyFileSongs(String fileName) throws IOException {
		InputStream inputStream = initializer.class.getResourceAsStream("src/Songs/"+fileName+".son");
    	Path pathTarget = Paths.get(System.getenv("APPDATA"),"/.pianoplayer/Songs/"+fileName+".son");
    	Files.copy(inputStream, pathTarget, StandardCopyOption.REPLACE_EXISTING);
	}
	private static String charFromInt(int i) {
		if (i>0 && i <27) {
			return String.valueOf((char)(i+96));
		}
		System.out.println("Null");
		return null;
	}
}
