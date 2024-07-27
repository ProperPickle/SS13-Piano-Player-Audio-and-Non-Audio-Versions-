import java.awt.AWTException;
import java.io.*;
import java.util.*;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

class playNote extends TimerTask{
	private final int o;
	private final ArrayList<ArrayList<String>> l;
	Timer timer = new Timer();
	playNote (int o, ArrayList<ArrayList<String>> l) {
		this.o=o;
		this.l=l;
	}
	private int q=0;
	public void run() {
		ArrayList<ArrayList<String>> alist = l;
		System.out.println(o);
		if (q<alist.get(0).size()) {
			Mp3Player mp3Player = new Mp3Player();
			mp3Player.findFile(alist.get(o).get(q));
		q++;
} else {
		timer.cancel();
}
		
	}
}
class pianoThreadAudio implements Runnable {
	private static int rest;
	public static void setRest(int a) {
		rest = a;
	}
	private Thread t;
	Timer timer = new Timer();	
	private String threadName;
	private int barNum; 
	private ArrayList<ArrayList<String>> alist;
	
	pianoThreadAudio(String name, int bar, ArrayList<ArrayList<String>> list) {
		barNum = bar;
		threadName = name;
		alist = list;
		System.out.println("Creating " +  threadName );
	}
	   
	public void run() {
		System.out.println("Running " +  threadName );
		ArrayList<ArrayList<String>> n = alist;
		int o = barNum;
		timer.scheduleAtFixedRate(new playNote(o, n), 0, rest);
		System.out.println("Thread " +  threadName + " exiting.");
	}
	   
	public void start () {
		System.out.println("Starting " +  threadName );
		if (t == null) {
			t = new Thread (this, threadName);
			t.start ();
	    }
	}
}
public class ThreadApplicationAudioWithRestInput implements NativeKeyListener{
	public static void mainButWithRest (int a) throws IOException, AWTException, InterruptedException {
		pianoThreadAudio.setRest(a);
		main(null);
	}
	
	public static void main(String[] args) throws IOException,
						AWTException, InterruptedException
	{
		//Starts the KeyListener which ends the program on an F5 press.
		try {
			GlobalScreen.registerNativeHook();
		}
		catch (NativeHookException ex) {
			System.err.println("There was a problem registering the native hook.");
			System.err.println(ex.getMessage());

			System.exit(1);
		}
		GlobalScreen.addNativeKeyListener(new forceExitOnF5());
		ArrayList<ArrayList<String>> alist = new ArrayList<ArrayList<String>>();
		BufferedReader testing = new BufferedReader(new FileReader(System.getenv("APPDATA")+"\\.pianoplayer\\formatted2"));
		//Parsing the first line, which is the number of required threads as prepended by Formatting class.
		int Pianos = Integer.parseInt(testing.readLine());
		System.out.println(Pianos);
		//Testing output in notepad
		/*
		if (scanning.hasNextLine()) {
			String command = "notepad.exe";
			Runtime run = Runtime.getRuntime();
			run.exec(command);
		}
		*/
		//Turns player piano code into an array ready to be read by robot, this version of the code doesn't use a robot, and every simulated keypress is instead replaced by an Mp3Player/
		for(int i=0;i<Pianos;i++) {
			ArrayList<String> temp = new ArrayList<String>();
			System.out.println(i);
			String temporary = testing.readLine();
			for(int l = 0; l<((temporary.length()-1)/8);l++) {
				String str = temporary.substring(((l*8)+1),((l*8)+9));
				if (str.equals("R,R,R,R|")) {
					temp.add("R");
				} else {
					StringBuilder newString = new StringBuilder();
					if (str.charAt(2)=='S') {
						newString.append(str.charAt(0));
					} else if (str.charAt(2)=='N') {
						newString.append(Character.toLowerCase(str.charAt(0)));
					} else {
						System.out.println("Something is messed up in the translating from piano player to notes section. Not sharp or flat.");
						System.exit(0);
					}
					if (!Character.isDigit(str.charAt(6))) {
						System.out.println("Something is messed up in the translating from piano player to notes section. Octave not number.");
						System.exit(0);
					}
					newString.append(str.charAt(6));
					temp.add(newString.toString());
				}
			}
			alist.add(temp);
		}
		//Switch case to initialize the threads, as given by x during the Formatting stage. An artificial cap of 33 threads has been imposed here, but it could be increased if needed.
		for (int i=1;i<Pianos+1;i++) {
			switch (i) {
			case 1:
				pianoThreadAudio R1 = new pianoThreadAudio("Thread-1",0,alist);
				R1.start();
				break;
			case 2:
				pianoThreadAudio R2 = new pianoThreadAudio("Thread-2",1,alist);
				R2.start();
				break;
			case 3:
				pianoThreadAudio R3 = new pianoThreadAudio("Thread-3",2,alist);
				R3.start();
				break;
			case 4:
				pianoThreadAudio R4 = new pianoThreadAudio("Thread-4",3,alist);
				R4.start();
				break;
			case 5:
				pianoThreadAudio R5 = new pianoThreadAudio("Thread-5",4,alist);
				R5.start();
				break;
			case 6:
				pianoThreadAudio R6 = new pianoThreadAudio("Thread-6",5,alist);
				R6.start();
				break;
			case 7:
				pianoThreadAudio R7 = new pianoThreadAudio("Thread-7",6,alist);
				R7.start();
				break;
			case 8:
				pianoThreadAudio R8 = new pianoThreadAudio("Thread-8",7,alist);
				R8.start();
				break;
			case 9:
				pianoThreadAudio R9 = new pianoThreadAudio("Thread-9",8,alist);
				R9.start();
				break;
			case 10:
				pianoThreadAudio R10 = new pianoThreadAudio("Thread-10",9,alist);
				R10.start();
				break;
			case 11:
				pianoThreadAudio R11 = new pianoThreadAudio("Thread-11",10,alist);
				R11.start();
				break;
			case 12:
				pianoThreadAudio R12 = new pianoThreadAudio("Thread-12",11,alist);
				R12.start();
				break;
			case 13:
				pianoThreadAudio R13 = new pianoThreadAudio("Thread-13",12,alist);
				R13.start();
				break;
			case 14:
				pianoThreadAudio R14 = new pianoThreadAudio("Thread-14",13,alist);
				R14.start();
				break;
			case 15:
				pianoThreadAudio R15 = new pianoThreadAudio("Thread-15",14,alist);
				R15.start();
				break;
			case 16:
				pianoThreadAudio R16 = new pianoThreadAudio("Thread-16",15,alist);
				R16.start();
				break;
			case 17:
				pianoThreadAudio R17 = new pianoThreadAudio("Thread-17",16,alist);
				R17.start();
				break;
			case 18:
				pianoThreadAudio R18 = new pianoThreadAudio("Thread-18",17,alist);
				R18.start();
				break;
			case 19:
				pianoThreadAudio R19 = new pianoThreadAudio("Thread-19",18,alist);
				R19.start();
				break;
			case 20:
				pianoThreadAudio R20 = new pianoThreadAudio("Thread-20",19,alist);
				R20.start();
				break;
			case 21:
				pianoThreadAudio R21 = new pianoThreadAudio("Thread-21",20,alist);
				R21.start();
				break;
			case 22:
				pianoThreadAudio R22 = new pianoThreadAudio("Thread-22",21,alist);
				R22.start();
				break;
			case 23:
				pianoThreadAudio R23 = new pianoThreadAudio("Thread-23",22,alist);
				R23.start();
				break;
			case 24:
				pianoThreadAudio R24 = new pianoThreadAudio("Thread-24",23,alist);
				R24.start();
				break;
			case 25:
				pianoThreadAudio R25 = new pianoThreadAudio("Thread-25",24,alist);
				R25.start();
				break;
			case 26:
				pianoThreadAudio R26 = new pianoThreadAudio("Thread-26",25,alist);
				R26.start();
				break;
			case 27:
				pianoThreadAudio R27 = new pianoThreadAudio("Thread-27",26,alist);
				R27.start();
				break;
			case 28:
				pianoThreadAudio R28 = new pianoThreadAudio("Thread-28",27,alist);
				R28.start();
				break;
			case 29:
				pianoThreadAudio R29 = new pianoThreadAudio("Thread-29",28,alist);
				R29.start();
				break;
			case 30:
				pianoThreadAudio R30 = new pianoThreadAudio("Thread-30",29,alist);
				R30.start();
				break;
			case 31:
				pianoThreadAudio R31 = new pianoThreadAudio("Thread-31",30,alist);
				R31.start();
				break;
			case 32:
				pianoThreadAudio R32 = new pianoThreadAudio("Thread-32",31,alist);
				R32.start();
				break;
			case 33:
				pianoThreadAudio R33 = new pianoThreadAudio("Thread-33",32,alist);
				R33.start();
				break;
			default:
				System.out.println("Too many threads, or other error.");
				System.exit(0);
			}
		}
		
		testing.close();
	}
}
