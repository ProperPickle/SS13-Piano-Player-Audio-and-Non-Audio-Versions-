import java.util.ArrayList;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;
//Takes the song, currently encoded in pianoletternotes.blogspot.com code, and translates it into SS13 Player Piano Code and saves it in formatted2.
//This step is a holdover from when I played music using contraptions of 20+ player pianos, and the code in formatted2 could still be used that way.
public class MusicTranslatorImproved{
    public static void main(String args[]) throws IOException {
      System.out.println("Translating the song into Player Piano code.");
      BufferedReader testing = new BufferedReader(new FileReader(System.getenv("APPDATA")+"\\.pianoplayer\\formatted"));
      ArrayList<ArrayList<String>> untranslatedLines = new ArrayList<ArrayList<String>>();
      ArrayList<String> musics = new ArrayList<String>();
      FileWriter writer = new FileWriter(System.getenv("APPDATA")+"\\.pianoplayer\\formatted2");
      PrintWriter printWriter = new PrintWriter(writer);
      printWriter.print("");
      char octave;
      int lineEnd;
      int lineBegin;
      int pianos = Integer.parseInt(testing.readLine());
      for (int t=0; t<pianos;t++) {
          musics.add("|");
      }
      for (int w = 0; w<pianos; w++) {
    	  untranslatedLines.add(new ArrayList<String>());
      }
      int m = 0;
      String line = testing.readLine();
      while (line != null) {
    	  if (line.isEmpty()) {
    		  for (int n = 0;n<pianos;n++) {
    			  while (untranslatedLines.get(n).size()<untranslatedLines.get(0).size()) {
    				  untranslatedLines.get(n).add("r");
    			  }
    			  m = 0;
    		  }
    	  } else {
    		  untranslatedLines.get(m).add(line);
    		  m++;
    	  }
    	  line = testing.readLine();
      }
      for (int q = 0; q<pianos;q++) {
    	  while(untranslatedLines.get(q).size()<untranslatedLines.get(0).size()) {
    		  untranslatedLines.get(q).add("r");
    	  }
      }
      /*
      for (int r = 0; r<pianos;r++) {
    	  for (int l = 0; l<untranslatedLines.get(0).size();l++) {
    		  System.out.println("Untranslated line: "+ r +" " + untranslatedLines.get(r).get(l));
    	  }
      }
      */
      for (int l = 0; l<pianos;l++) {
    	  for (int p = 0; p<untranslatedLines.get(0).size();p++) {
    		  String funk = untranslatedLines.get(l).get(p);
    		  if (funk == "r") {
    			  for (int w = 0; w<26;w++) {
    				  musics.set(l,musics.get(l).concat("R,R,R,R|"));
    			  }
    		  } else {
    			  if (funk.charAt(1)=='H') {
                      lineBegin=5;
                      lineEnd=31;
                  } else {
                      lineBegin=2;
                      lineEnd=28;
                  }
    			  for (int i = lineBegin; i<lineEnd; i++) {
    	                char accidental;
    	                if (funk.charAt(i)=='-') {
    	                	musics.set(l,musics.get(l).concat("R,R,R,R|"));
    	                } else {
    	                    if (Character.isUpperCase(funk.charAt(i))) {
    	                        accidental='S';
    	                    } else {
    	                        accidental='N';
    	                    }
    	                    if (funk.charAt(1)=='H') {
    	                        octave=funk.charAt(3);
    	                    } else {
    	                        octave=funk.charAt(0);
    	                    }
    	                    musics.set(l, musics.get(l).concat(String.format("%c,%c,N,%c|",Character.toUpperCase(funk.charAt(i)),accidental,octave)));
    	                    //System.out.println(String.format("%c,%c,N,%c|",Character.toUpperCase(line.charAt(i)),accidental,octave));
    	                }   
    	            }
    			  
    		  }
    	  }
      }
      printWriter.print(pianos+"\n");
      for (int o=0; o<pianos;o++) {
        printWriter.print(musics.get(o)+"\n");
      }
      testing.close();
      writer.close();
    }
}