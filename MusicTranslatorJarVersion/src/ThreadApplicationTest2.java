//Importing shit
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.*;
import java.util.*;
class MyTimerTask2 extends TimerTask{
	private final int o;
	private final ArrayList<ArrayList<String>> l;
	Timer timer = new Timer();
	MyTimerTask2 (int o, ArrayList<ArrayList<String>> l) {
		this.o=o;
		this.l=l;
	}
	private int q=0;
	public void run() {
		ArrayList<ArrayList<String>> alist = l;
		System.out.println(o);
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
class RunnableDemo2 implements Runnable {
		int rest = 145;
	   private Thread t;
	   Timer timer = new Timer();	
	   private String threadName;
	   private int barNum; 
	   private ArrayList<ArrayList<String>> alist;
	   
	   RunnableDemo2(String name, int bar, ArrayList<ArrayList<String>> list) {
		  barNum = bar;
	      threadName = name;
	      alist = list;
	      System.out.println("Creating " +  threadName );
	   }
	   
	   public void run() {
	      System.out.println("Running " +  threadName );
	      ArrayList<ArrayList<String>> n = alist;
		 int o = barNum;
		 timer.scheduleAtFixedRate(new MyTimerTask2(o, n), 0, rest);
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
public class ThreadApplicationTest2{
	public static void main(String[] args) throws IOException,
						AWTException, InterruptedException
	{
		ArrayList<ArrayList<String>> alist = new ArrayList<ArrayList<String>>();
		//declaring shit
		BufferedReader testing = new BufferedReader(new FileReader(System.getenv("APPDATA")+"\\.pianoplayer\\formatted2"));
		int Pianos = Integer.parseInt(testing.readLine());
		System.out.println(Pianos);
		//Testing output in notepad
		Thread.sleep(5000);
		/*
		if (scanning.hasNextLine()) {
			String command = "notepad.exe";
			Runtime run = Runtime.getRuntime();
			run.exec(command);
		}
		*/
		//fucked way to turn player piano code into code ready to be read by robot. It sucks.
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
					System.out.println("Shit's fucked " + str);
					temp.add("R");
				}
			}
			alist.add(temp);
		}
		for (int i=1;i<Pianos+1;i++) {
			switch (i) {
			case 1:
				RunnableDemo2 R1 = new RunnableDemo2("Thread-1",0,alist);
				R1.start();
				break;
			case 2:
				RunnableDemo2 R2 = new RunnableDemo2("Thread-2",1,alist);
				R2.start();
				break;
			case 3:
				RunnableDemo2 R3 = new RunnableDemo2("Thread-3",2,alist);
				R3.start();
				break;
			case 4:
				RunnableDemo2 R4 = new RunnableDemo2("Thread-4",3,alist);
				R4.start();
				break;
			case 5:
				RunnableDemo2 R5 = new RunnableDemo2("Thread-5",4,alist);
				R5.start();
				break;
			case 6:
				RunnableDemo2 R6 = new RunnableDemo2("Thread-6",5,alist);
				R6.start();
				break;
			case 7:
				RunnableDemo2 R7 = new RunnableDemo2("Thread-7",6,alist);
				R7.start();
				break;
			case 8:
				RunnableDemo2 R8 = new RunnableDemo2("Thread-8",7,alist);
				R8.start();
				break;
			case 9:
				RunnableDemo2 R9 = new RunnableDemo2("Thread-9",8,alist);
				R9.start();
				break;
			case 10:
				RunnableDemo2 R10 = new RunnableDemo2("Thread-10",9,alist);
				R10.start();
				break;
			case 11:
				RunnableDemo2 R11 = new RunnableDemo2("Thread-11",10,alist);
				R11.start();
				break;
			case 12:
				RunnableDemo2 R12 = new RunnableDemo2("Thread-12",11,alist);
				R12.start();
				break;
			case 13:
				RunnableDemo2 R13 = new RunnableDemo2("Thread-13",12,alist);
				R13.start();
				break;
			case 14:
				RunnableDemo2 R14 = new RunnableDemo2("Thread-14",13,alist);
				R14.start();
				break;
			case 15:
				RunnableDemo2 R15 = new RunnableDemo2("Thread-15",14,alist);
				R15.start();
				break;
			case 16:
				RunnableDemo2 R16 = new RunnableDemo2("Thread-16",15,alist);
				R16.start();
				break;
			case 17:
				RunnableDemo2 R17 = new RunnableDemo2("Thread-17",16,alist);
				R17.start();
				break;
			case 18:
				RunnableDemo2 R18 = new RunnableDemo2("Thread-18",17,alist);
				R18.start();
				break;
			case 19:
				RunnableDemo2 R19 = new RunnableDemo2("Thread-19",18,alist);
				R19.start();
				break;
			case 20:
				RunnableDemo2 R20 = new RunnableDemo2("Thread-20",19,alist);
				R20.start();
				break;
			case 21:
				RunnableDemo2 R21 = new RunnableDemo2("Thread-21",20,alist);
				R21.start();
				break;
			case 22:
				RunnableDemo2 R22 = new RunnableDemo2("Thread-22",21,alist);
				R22.start();
				break;
			case 23:
				RunnableDemo2 R23 = new RunnableDemo2("Thread-23",22,alist);
				R23.start();
				break;
			case 24:
				RunnableDemo2 R24 = new RunnableDemo2("Thread-24",23,alist);
				R24.start();
				break;
			case 25:
				RunnableDemo2 R25 = new RunnableDemo2("Thread-25",24,alist);
				R25.start();
				break;
			case 26:
				RunnableDemo2 R26 = new RunnableDemo2("Thread-26",25,alist);
				R26.start();
				break;
			case 27:
				RunnableDemo2 R27 = new RunnableDemo2("Thread-27",26,alist);
				R27.start();
				break;
			case 28:
				RunnableDemo2 R28 = new RunnableDemo2("Thread-28",27,alist);
				R28.start();
				break;
			case 29:
				RunnableDemo2 R29 = new RunnableDemo2("Thread-29",28,alist);
				R29.start();
				break;
			case 30:
				RunnableDemo2 R30 = new RunnableDemo2("Thread-30",29,alist);
				R30.start();
				break;
			case 31:
				RunnableDemo2 R31 = new RunnableDemo2("Thread-31",30,alist);
				R31.start();
				break;
			case 32:
				RunnableDemo2 R32 = new RunnableDemo2("Thread-32",31,alist);
				R32.start();
				break;
			case 33:
				RunnableDemo2 R33 = new RunnableDemo2("Thread-33",32,alist);
				R33.start();
				break;
			default:
				System.out.println("Too many lines, or other fuckup");
				System.exit(0);
			}
		}
		
		testing.close();
	}
}
