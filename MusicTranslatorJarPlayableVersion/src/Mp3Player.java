import javazoom.jl.decoder.JavaLayerException;
import javazoom.jl.player.Player;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

//Simple class for playing Mp3 files.
public class Mp3Player implements Runnable{
	
	private Player player;
	private Thread thread;
    public void main(String[] args) {
    	
    }

    public void createMp3Player(String filePath) {
        try {
            FileInputStream fileInputStream = new FileInputStream(filePath);
            player = new Player(fileInputStream);
            thread = new Thread(this);
            thread.start();
        } catch (FileNotFoundException | JavaLayerException e) {
            e.printStackTrace();
        }
    }
    public void findFile(String note) {
    	//Called every time a note needs to be played, finding the required note in the note directory and creating an Mp3Player which plays the note.
    	if (note.equals("R")) {
    		createMp3Player(System.getenv("APPDATA")+"/.pianoplayer/notes/rrr.mp3");
    	} else if (note.length()==2 && Character.isLetter(note.charAt(0)) && Character.isDigit(note.charAt(1))) {
    		StringBuilder fileName = new StringBuilder(System.getenv("APPDATA")+"/.pianoplayer/Notes/");
    		fileName.append(Character.toLowerCase(note.charAt(0)));
    		if (Character.isUpperCase(note.charAt(0))) {
    			fileName.append("-");
    		}
    		fileName.append(note.charAt(1)+".mp3");
    		createMp3Player(fileName.toString());
    	} else {
    		System.out.println("Tried to find a note that doesn't exist for string: " +note);
    	}
    }

	@Override
	public void run() {
			try {
				player.play();
			} catch (JavaLayerException e) {
				System.out.println("Issue in running Mp3Player Thread.");
				e.printStackTrace();
			}
		
	}
}
