import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.*;

import com.github.kwhat.jnativehook.GlobalScreen;
import com.github.kwhat.jnativehook.NativeHookException;
import com.github.kwhat.jnativehook.keyboard.NativeKeyListener;

class simulateKeyPress extends TimerTask{
	private final int o;
	private final ArrayList<ArrayList<String>> l;
	Timer timer = new Timer();
	simulateKeyPress (int o, ArrayList<ArrayList<String>> l) {
		this.o=o;
		this.l=l;
	}
	private int q=0;
	public void run() {
		ArrayList<ArrayList<String>> alist = l;
		System.out.println(o);
		//Robot reads the array, and simulate the corresponding keypress on the SS13 keyboard, playing the designated note.
		//Future Fix: I'd love to find a way to shrink this, but because the notes on the keyboard didn't seem to follow an easilly replicated pattern
		//I couldn't seem to find a way to make this without simply assigning each case a keypress.
		try {
			Robot robot = new Robot();
			if (q<alist.get(0).size()) {
				if (alist.get(o).get(q).equals("R")) {
					System.out.println("rest here");
				}else if (alist.get(o).get(q).equals("c2")) {
					robot.keyPress(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_1);
				}else if (alist.get(o).get(q).equals("C2")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_1);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("d2")) {
					robot.keyPress(KeyEvent.VK_2);
					robot.keyRelease(KeyEvent.VK_2);
				}else if (alist.get(o).get(q).equals("D2")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_2);
					robot.keyRelease(KeyEvent.VK_2);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("e2")) {
					robot.keyPress(KeyEvent.VK_3);
					robot.keyRelease(KeyEvent.VK_3);
				}else if (alist.get(o).get(q).equals("f2")) {
					robot.keyPress(KeyEvent.VK_4);
					robot.keyRelease(KeyEvent.VK_4);
				}else if (alist.get(o).get(q).equals("F2")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_4);
					robot.keyRelease(KeyEvent.VK_4);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("g2")) {
					robot.keyPress(KeyEvent.VK_5);
					robot.keyRelease(KeyEvent.VK_5);
				}else if (alist.get(o).get(q).equals("G2")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_5);
					robot.keyRelease(KeyEvent.VK_5);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("a2")) {
					robot.keyPress(KeyEvent.VK_6);
					robot.keyRelease(KeyEvent.VK_6);
				}else if (alist.get(o).get(q).equals("A2")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_6);
					robot.keyRelease(KeyEvent.VK_6);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("b2")) {
					robot.keyPress(KeyEvent.VK_7);
					robot.keyRelease(KeyEvent.VK_7);
				}else if (alist.get(o).get(q).equals("c3")) {
					robot.keyPress(KeyEvent.VK_8);
					robot.keyRelease(KeyEvent.VK_8);
				}else if (alist.get(o).get(q).equals("C3")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_8);
					robot.keyRelease(KeyEvent.VK_8);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("d3")) {
					robot.keyPress(KeyEvent.VK_9);
					robot.keyRelease(KeyEvent.VK_9);
				}else if (alist.get(o).get(q).equals("D3")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_9);
					robot.keyRelease(KeyEvent.VK_9);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("e3")) {
					robot.keyPress(KeyEvent.VK_0);
					robot.keyRelease(KeyEvent.VK_0);
				}else if (alist.get(o).get(q).equals("f3")) {
					robot.keyPress(KeyEvent.VK_Q);
					robot.keyRelease(KeyEvent.VK_Q);
				}else if (alist.get(o).get(q).equals("F3")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_Q);
					robot.keyRelease(KeyEvent.VK_Q);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("g3")) {
					robot.keyPress(KeyEvent.VK_W);
					robot.keyRelease(KeyEvent.VK_W);
				}else if (alist.get(o).get(q).equals("G3")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_W);
					robot.keyRelease(KeyEvent.VK_W);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("a3")) {
					robot.keyPress(KeyEvent.VK_E);
					robot.keyRelease(KeyEvent.VK_E);
				}else if (alist.get(o).get(q).equals("A3")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_E);
					robot.keyRelease(KeyEvent.VK_E);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("b3")) {
					robot.keyPress(KeyEvent.VK_R);
					robot.keyRelease(KeyEvent.VK_R);
				}else if (alist.get(o).get(q).equals("c4")) {
					robot.keyPress(KeyEvent.VK_T);
					robot.keyRelease(KeyEvent.VK_T);
				}else if (alist.get(o).get(q).equals("C4")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_T);
					robot.keyRelease(KeyEvent.VK_T);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("d4")) {
					robot.keyPress(KeyEvent.VK_Y);
					robot.keyRelease(KeyEvent.VK_Y);
				}else if (alist.get(o).get(q).equals("D4")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_Y);
					robot.keyRelease(KeyEvent.VK_Y);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("e4")) {
					robot.keyPress(KeyEvent.VK_U);
					robot.keyRelease(KeyEvent.VK_U);
				}else if (alist.get(o).get(q).equals("f4")) {
					robot.keyPress(KeyEvent.VK_I);
					robot.keyRelease(KeyEvent.VK_I);
				}else if (alist.get(o).get(q).equals("F4")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_I);
					robot.keyRelease(KeyEvent.VK_I);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("g4")) {
					robot.keyPress(KeyEvent.VK_O);
					robot.keyRelease(KeyEvent.VK_O);
				}else if (alist.get(o).get(q).equals("G4")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_O);
					robot.keyRelease(KeyEvent.VK_O);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("a4")) {
					robot.keyPress(KeyEvent.VK_P);
					robot.keyRelease(KeyEvent.VK_P);
				}else if (alist.get(o).get(q).equals("A4")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_P);
					robot.keyRelease(KeyEvent.VK_P);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("b4")) {
					robot.keyPress(KeyEvent.VK_A);
					robot.keyRelease(KeyEvent.VK_A);
				}else if (alist.get(o).get(q).equals("c5")) {
					robot.keyPress(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_S);
				}else if (alist.get(o).get(q).equals("C5")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_S);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("d5")) {
					robot.keyPress(KeyEvent.VK_D);
					robot.keyRelease(KeyEvent.VK_D);
				}else if (alist.get(o).get(q).equals("D5")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_D);
					robot.keyRelease(KeyEvent.VK_D);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("e5")) {
					robot.keyPress(KeyEvent.VK_F);
					robot.keyRelease(KeyEvent.VK_F);
				}else if (alist.get(o).get(q).equals("f5")) {
					robot.keyPress(KeyEvent.VK_G);
					robot.keyRelease(KeyEvent.VK_G);
				}else if (alist.get(o).get(q).equals("F5")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_G);
					robot.keyRelease(KeyEvent.VK_G);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("g5")) {
					robot.keyPress(KeyEvent.VK_H);
					robot.keyRelease(KeyEvent.VK_H);
				}else if (alist.get(o).get(q).equals("G5")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_H);
					robot.keyRelease(KeyEvent.VK_H);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("a5")) {
					robot.keyPress(KeyEvent.VK_J);
					robot.keyRelease(KeyEvent.VK_J);
				}else if (alist.get(o).get(q).equals("A5")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_J);
					robot.keyRelease(KeyEvent.VK_J);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("b5")) {
					robot.keyPress(KeyEvent.VK_K);
					robot.keyRelease(KeyEvent.VK_K);
				}else if (alist.get(o).get(q).equals("c6")) {
					robot.keyPress(KeyEvent.VK_L);
					robot.keyRelease(KeyEvent.VK_L);
				}else if (alist.get(o).get(q).equals("C6")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_L);
					robot.keyRelease(KeyEvent.VK_L);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("d6")) {
					robot.keyPress(KeyEvent.VK_Z);
					robot.keyRelease(KeyEvent.VK_Z);
				}else if (alist.get(o).get(q).equals("D6")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_Z);
					robot.keyRelease(KeyEvent.VK_Z);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("e6")) {
					robot.keyPress(KeyEvent.VK_X);
					robot.keyRelease(KeyEvent.VK_X);
				}else if (alist.get(o).get(q).equals("f6")) {
					robot.keyPress(KeyEvent.VK_C);
					robot.keyRelease(KeyEvent.VK_C);
				}else if (alist.get(o).get(q).equals("F6")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_C);
					robot.keyRelease(KeyEvent.VK_C);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("g6")) {
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
				}else if (alist.get(o).get(q).equals("G6")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_V);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("a6")) {
					robot.keyPress(KeyEvent.VK_B);
					robot.keyRelease(KeyEvent.VK_B);
				}else if (alist.get(o).get(q).equals("A6")) {
					robot.keyPress(KeyEvent.VK_SHIFT);
					robot.keyPress(KeyEvent.VK_B);
					robot.keyRelease(KeyEvent.VK_B);
					robot.keyRelease(KeyEvent.VK_SHIFT);
				}else if (alist.get(o).get(q).equals("b6")) {
					robot.keyPress(KeyEvent.VK_N);
					robot.keyRelease(KeyEvent.VK_N);
				}else if (alist.get(o).get(q).equals("c7")) {
					robot.keyPress(KeyEvent.VK_M);
					robot.keyRelease(KeyEvent.VK_M);
				}
			q++;
		} else {
			timer.cancel();
		}
		} catch (AWTException e) {
			e.printStackTrace();
		}
		
	}
}
class pianoThreadNonAudio implements Runnable {
	private static int rest;
	public static void setRest(int a) {
		rest = a;
	}
	private Thread t;
	Timer timer = new Timer();	
	private String threadName;
	private int barNum; 
	private ArrayList<ArrayList<String>> alist;
	
	pianoThreadNonAudio(String name, int bar, ArrayList<ArrayList<String>> list) {
		barNum = bar;
		threadName = name;
		alist = list;
		System.out.println("Creating " +  threadName );
	}
	   
	public void run() {
		System.out.println("Running " +  threadName );
		ArrayList<ArrayList<String>> n = alist;
		int o = barNum;
		timer.scheduleAtFixedRate(new simulateKeyPress(o, n), 0, rest);
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
public class ThreadApplicationNonAudioWithRestInput implements NativeKeyListener{
	public static void mainButWithRest (int a) throws IOException, AWTException, InterruptedException {
		pianoThreadNonAudio.setRest(a);
		main(null);
	}
	
	public static void main(String[] args) throws IOException,
						AWTException, InterruptedException
	{
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
		//declaring shit
		BufferedReader testing = new BufferedReader(new FileReader(System.getenv("APPDATA")+"\\.pianoplayer\\formatted2"));
		int Pianos = Integer.parseInt(testing.readLine());
		//A small pause before the keypresses start, possibly is what leads to the "bunching" of notes at the beginning of a song, but the user needs time to alt+tab back into the application.
		Thread.sleep(5000);
		//Testing output in notepad
		/*
		if (scanning.hasNextLine()) {
			String command = "notepad.exe";
			Runtime run = Runtime.getRuntime();
			run.exec(command);
		}
		*/
		//Turns player piano code into an array ready to be read by robot, which will simulate keypresses to play the designated note on a digital piano.
		for(int i=0;i<Pianos;i++) {
			ArrayList<String> temp = new ArrayList<String>();
			System.out.println(i);
			String temporary = testing.readLine();
			for(int l = 0; l<((temporary.length()-1)/8);l++) {
					String str = temporary.substring(((l*8)+1),((l*8)+9));
				if (str.equals("R,R,R,R|")) {
					temp.add("R");
				}else if (str.equals("C,N,N,2|")) {
					temp.add("c2");
				}else if (str.equals("C,S,N,2|")) {
					temp.add("C2");
				}else if (str.equals("D,N,N,2|")) {
					temp.add("d2");
				}else if (str.equals("D,S,N,2|")) {
					temp.add("D2");
				}else if (str.equals("E,N,N,2|")) {
					temp.add("e2");
				}else if (str.equals("F,N,N,2|")) {
					temp.add("f2");
				}else if (str.equals("F,S,N,2|")) {
					temp.add("F2");
				}else if (str.equals("G,N,N,2|")) {
					temp.add("g2");
				}else if (str.equals("G,S,N,2|")) {
					temp.add("G2");
				}else if (str.equals("A,N,N,3|")) {
					temp.add("a3");
				}else if (str.equals("A,S,N,3|")) {
					temp.add("A3");
				}else if (str.equals("B,N,N,3|")) {
					temp.add("b3");
				}else if (str.equals("C,N,N,3|")) {
					temp.add("c3");
				}else if (str.equals("C,S,N,3|")) {
					temp.add("C3");
				}else if (str.equals("D,N,N,3|")) {
					temp.add("d3");
				}else if (str.equals("D,S,N,3|")) {
					temp.add("D3");
				}else if (str.equals("E,N,N,3|")) {
					temp.add("e3");
				}else if (str.equals("F,N,N,3|")) {
					temp.add("f3");
				}else if (str.equals("F,S,N,3|")) {
					temp.add("F3");
				}else if (str.equals("G,N,N,3|")) {
					temp.add("g3");
				}else if (str.equals("G,S,N,3|")) {
					temp.add("G3");
				}else if (str.equals("A,N,N,4|")) {
					temp.add("a4");
				}else if (str.equals("A,S,N,4|")) {
					temp.add("A4");
				}else if (str.equals("B,N,N,4|")) {
					temp.add("b4");
				}else if (str.equals("C,N,N,4|")) {
					temp.add("c4");
				}else if (str.equals("C,S,N,4|")) {
					temp.add("C4");
				}else if (str.equals("D,N,N,4|")) {
					temp.add("d4");
				}else if (str.equals("D,S,N,4|")) {
					temp.add("D4");
				}else if (str.equals("E,N,N,4|")) {
					temp.add("e4");
				}else if (str.equals("F,N,N,4|")) {
					temp.add("f4");
				}else if (str.equals("F,S,N,4|")) {
					temp.add("F4");
				}else if (str.equals("G,N,N,4|")) {
					temp.add("g4");
				}else if (str.equals("G,S,N,4|")) {
					temp.add("G4");
				}else if (str.equals("A,N,N,5|")) {
					temp.add("a5");
				}else if (str.equals("A,S,N,5|")) {
					temp.add("A5");
				}else if (str.equals("B,N,N,5|")) {
					temp.add("b5");
				}else if (str.equals("C,N,N,5|")) {
					temp.add("c5");
				}else if (str.equals("C,S,N,5|")) {
					temp.add("C5");
				}else if (str.equals("D,N,N,5|")) {
					temp.add("d5");
				}else if (str.equals("D,S,N,5|")) {
					temp.add("D5");
				}else if (str.equals("E,N,N,5|")) {
					temp.add("e5");
				}else if (str.equals("F,N,N,5|")) {
					temp.add("f5");
				}else if (str.equals("F,S,N,5|")) {
					temp.add("F5");
				}else if (str.equals("G,N,N,5|")) {
					temp.add("g5");
				}else if (str.equals("G,S,N,5|")) {
					temp.add("G5");
				}else if (str.equals("A,N,N,6|")) {
					temp.add("a6");
				}else if (str.equals("A,S,N,6|")) {
					temp.add("A6");
				}else if (str.equals("B,N,N,6|")) {
					temp.add("b6");
				}else if (str.equals("C,N,N,6|")) {
					temp.add("c6");
				}else if (str.equals("C,S,N,6|")) {
					temp.add("C6");
					System.out.println("Testing");
				}else if (str.equals("D,N,N,6|")) {
					temp.add("d6");
				}else if (str.equals("D,S,N,6|")) {
					temp.add("D6");
				}else if (str.equals("E,N,N,6|")) {
					temp.add("e6");
				}else if (str.equals("F,N,N,6|")) {
					temp.add("f6");
				}else if (str.equals("F,S,N,6|")) {
					temp.add("F6");
				}else if (str.equals("G,N,N,6|")) {
					temp.add("g6");
				}else if (str.equals("G,S,N,6|")) {
					temp.add("G6");
				}else if (str.equals("C,N,N,7|")) {
					temp.add("c7");
				}else {
					System.out.println("Tried to play an incorrectly formatted note, or a note outside of the capabilities of the piano " + str);
					temp.add("R");
				}
			}
			alist.add(temp);
		}
		//Switch case to initialize the threads, as given by x during the Formatting stage. An artificial cap of 33 threads has been imposed here, but it could be increased if needed.
		for (int i=1;i<Pianos+1;i++) {
			switch (i) {
			case 1:
				pianoThreadNonAudio R1 = new pianoThreadNonAudio("Thread-1",0,alist);
				R1.start();
				break;
			case 2:
				pianoThreadNonAudio R2 = new pianoThreadNonAudio("Thread-2",1,alist);
				R2.start();
				break;
			case 3:
				pianoThreadNonAudio R3 = new pianoThreadNonAudio("Thread-3",2,alist);
				R3.start();
				break;
			case 4:
				pianoThreadNonAudio R4 = new pianoThreadNonAudio("Thread-4",3,alist);
				R4.start();
				break;
			case 5:
				pianoThreadNonAudio R5 = new pianoThreadNonAudio("Thread-5",4,alist);
				R5.start();
				break;
			case 6:
				pianoThreadNonAudio R6 = new pianoThreadNonAudio("Thread-6",5,alist);
				R6.start();
				break;
			case 7:
				pianoThreadNonAudio R7 = new pianoThreadNonAudio("Thread-7",6,alist);
				R7.start();
				break;
			case 8:
				pianoThreadNonAudio R8 = new pianoThreadNonAudio("Thread-8",7,alist);
				R8.start();
				break;
			case 9:
				pianoThreadNonAudio R9 = new pianoThreadNonAudio("Thread-9",8,alist);
				R9.start();
				break;
			case 10:
				pianoThreadNonAudio R10 = new pianoThreadNonAudio("Thread-10",9,alist);
				R10.start();
				break;
			case 11:
				pianoThreadNonAudio R11 = new pianoThreadNonAudio("Thread-11",10,alist);
				R11.start();
				break;
			case 12:
				pianoThreadNonAudio R12 = new pianoThreadNonAudio("Thread-12",11,alist);
				R12.start();
				break;
			case 13:
				pianoThreadNonAudio R13 = new pianoThreadNonAudio("Thread-13",12,alist);
				R13.start();
				break;
			case 14:
				pianoThreadNonAudio R14 = new pianoThreadNonAudio("Thread-14",13,alist);
				R14.start();
				break;
			case 15:
				pianoThreadNonAudio R15 = new pianoThreadNonAudio("Thread-15",14,alist);
				R15.start();
				break;
			case 16:
				pianoThreadNonAudio R16 = new pianoThreadNonAudio("Thread-16",15,alist);
				R16.start();
				break;
			case 17:
				pianoThreadNonAudio R17 = new pianoThreadNonAudio("Thread-17",16,alist);
				R17.start();
				break;
			case 18:
				pianoThreadNonAudio R18 = new pianoThreadNonAudio("Thread-18",17,alist);
				R18.start();
				break;
			case 19:
				pianoThreadNonAudio R19 = new pianoThreadNonAudio("Thread-19",18,alist);
				R19.start();
				break;
			case 20:
				pianoThreadNonAudio R20 = new pianoThreadNonAudio("Thread-20",19,alist);
				R20.start();
				break;
			case 21:
				pianoThreadNonAudio R21 = new pianoThreadNonAudio("Thread-21",20,alist);
				R21.start();
				break;
			case 22:
				pianoThreadNonAudio R22 = new pianoThreadNonAudio("Thread-22",21,alist);
				R22.start();
				break;
			case 23:
				pianoThreadNonAudio R23 = new pianoThreadNonAudio("Thread-23",22,alist);
				R23.start();
				break;
			case 24:
				pianoThreadNonAudio R24 = new pianoThreadNonAudio("Thread-24",23,alist);
				R24.start();
				break;
			case 25:
				pianoThreadNonAudio R25 = new pianoThreadNonAudio("Thread-25",24,alist);
				R25.start();
				break;
			case 26:
				pianoThreadNonAudio R26 = new pianoThreadNonAudio("Thread-26",25,alist);
				R26.start();
				break;
			case 27:
				pianoThreadNonAudio R27 = new pianoThreadNonAudio("Thread-27",26,alist);
				R27.start();
				break;
			case 28:
				pianoThreadNonAudio R28 = new pianoThreadNonAudio("Thread-28",27,alist);
				R28.start();
				break;
			case 29:
				pianoThreadNonAudio R29 = new pianoThreadNonAudio("Thread-29",28,alist);
				R29.start();
				break;
			case 30:
				pianoThreadNonAudio R30 = new pianoThreadNonAudio("Thread-30",29,alist);
				R30.start();
				break;
			case 31:
				pianoThreadNonAudio R31 = new pianoThreadNonAudio("Thread-31",30,alist);
				R31.start();
				break;
			case 32:
				pianoThreadNonAudio R32 = new pianoThreadNonAudio("Thread-32",31,alist);
				R32.start();
				break;
			case 33:
				pianoThreadNonAudio R33 = new pianoThreadNonAudio("Thread-33",32,alist);
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
