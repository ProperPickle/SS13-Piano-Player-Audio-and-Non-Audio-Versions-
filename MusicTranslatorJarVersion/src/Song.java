import java.io.Serializable;

public class Song implements Serializable{
	//Representation of a song, basically just a serializable int and string duct-taped together.
	private static final long serialVersionUID = 1L;
	private int tempo;
	private String songCode;
	public Song(String a, int i) {
		this.setTempo(i);
		this.setString(a);
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int theInt) {
		this.tempo = theInt;
	}
	public String getString() {
		return songCode;
	}
	public void setString(String theString) {
		this.songCode = theString;
	}
	
}
