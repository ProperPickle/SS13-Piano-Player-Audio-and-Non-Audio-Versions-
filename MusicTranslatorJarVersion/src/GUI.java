import java.awt.AWTException;
import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUI implements ActionListener{
	private JFrame frame;
	private JPanel cards;
	private JPanel card1;
	private JPanel card2;
	private JPanel card3;
	private JPanel card4;
	private JButton playPresetButton;
	private JButton oldPresetButton;
	private JButton newPresetButton;
	private JButton songButton;
	private JButton backButton;
	private JButton finishNewSongButton;
	private JButton playComposedSongButton;
	private JComboBox<String> songList;
	private JLabel songInputLabel;
	private JLabel tempoInputLabel;
	private JLabel statusLabel;
	private JTextField tempoText;
	private JTextField nameText;
	private JTextArea songText;
	private int startWidth = 800;
	private int startHeight = 800;
	private CardLayout cl;
	public GUI() {
		
		frame = new JFrame();
		frame.setSize(startWidth,startHeight);
		
		//Components for the Main Menu
		
		JLabel title = new JLabel("ProperPickle's Piano Player (Non-Audio)");
		title.setFont(new Font("Georgia", Font.PLAIN, 32));
		title.setBounds(startWidth/7,startHeight/100,startWidth-(startWidth/7),startHeight/7);
		
		oldPresetButton = new JButton("Preset Songs");
		oldPresetButton.addActionListener(this);
		oldPresetButton.setBounds(startWidth/10,startHeight/7,startWidth-(startWidth/5),startHeight/7);
		
		newPresetButton = new JButton("Add a Preset");
		newPresetButton.addActionListener(this);
		newPresetButton.setBounds(startWidth/10,startHeight*3/7,startWidth-(startWidth/5),startHeight/7);
		
		songButton = new JButton("Play a New Song");
		songButton.addActionListener(this);
		songButton.setBounds(startWidth/10,startHeight*5/7,startWidth-(startWidth/5),startHeight/7);
		
		backButton = new JButton("Return to Main Menu");
		backButton.addActionListener(this);
		backButton.setBounds(startWidth/6,startHeight*11/14,(startWidth*2)/3,startHeight/7);
		
		//Components for the playing presets window
		
		JLabel presetChoosingLabel = new JLabel("Choose which preset you'd like to play below: ");
		presetChoosingLabel.setBounds(startWidth*4/12, startHeight/15, startWidth, startHeight/10);
		
		File directoryPath = new File(System.getenv("APPDATA")+"\\.pianoplayer\\Songs");
		String[] songs = directoryPath.list();
		songList = new JComboBox<String>(songs);
		songList.setBounds(startWidth/6,startHeight*2/10,startWidth*2/3, startHeight/20	);
		
		playPresetButton = new JButton("Play Selected Preset");
		playPresetButton.addActionListener(this);
		playPresetButton.setBounds(startWidth/4,startHeight*33/56,(startWidth)/2,startHeight/10);
		
		//Components for the adding new presets window
		songInputLabel = new JLabel("Enter Song Code Here: ");
		songInputLabel.setBounds(startWidth*5/12, startHeight/10, startWidth, startHeight/10);
		
		songText = new JTextArea();
		songText.setBounds(startWidth/12,startHeight/6,5*startWidth/6, startHeight/4);
		
		tempoInputLabel = new JLabel("Enter Song Tempo Here (Typically around 100): ");
		tempoInputLabel.setBounds(startWidth*4/12, 3*startHeight/7, startWidth, startHeight/10);
		
		tempoText = new JTextField();
		tempoText.setBounds(startWidth/4,startHeight/2,startWidth/2, startHeight/12);
		tempoText.setHorizontalAlignment(JTextField.CENTER);
		
		JLabel nameInputLabel = new JLabel("Enter Song Name Here: ");
		nameInputLabel.setBounds(startWidth*497/1200, startHeight/100, startWidth, startHeight/10);
		
		nameText = new JTextField();
		nameText.setBounds(startWidth/4,startHeight/12, startWidth/2, startHeight/20);
		nameText.setHorizontalAlignment(JTextField.CENTER);
		
		statusLabel = new JLabel("");
		statusLabel.setBounds(startWidth*4/12, startHeight*19/28, startWidth, startHeight/10);
		
		finishNewSongButton = new JButton("Save New Preset");
		finishNewSongButton.addActionListener(this);
		finishNewSongButton.setBounds(startWidth/4,startHeight*33/56,(startWidth)/2,startHeight/10);
		
		//Components for the playing new songs window (Also uses components from the adding new presets window so you can type a song in this window and save in the other.)
		playComposedSongButton = new JButton("Play Composed Song");
		playComposedSongButton.addActionListener(this);
		playComposedSongButton.setBounds(startWidth/4,startHeight*33/56,(startWidth)/2,startHeight/10);
		
		card1 = new JPanel();
		card1.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
		card1.setLayout(null);
		card1.add(oldPresetButton);
		card1.add(newPresetButton);
		card1.add(songButton);
		card1.add(title);
		
		card2 = new JPanel();
		card2.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
		card2.setLayout(null);
		card2.add(presetChoosingLabel);
		card2.add(songList);
		card2.add(playPresetButton);
		
		card3 = new JPanel();
		card3.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
		card3.setLayout(null);
		card3.add(finishNewSongButton);
		card3.add(nameInputLabel);
		card3.add(nameText);
		
		card4 = new JPanel();
		card4.setBorder(BorderFactory.createEmptyBorder(30,30,10,10));
		card4.setLayout(null);
		card4.add(playComposedSongButton);
		
		cards = new JPanel(new CardLayout());
		cards.add(card1, "Starting Menu");
		cards.add(card2, "Playing Presets Menu");
		cards.add(card3, "Adding Presets Menu");
		cards.add(card4, "Playing Non-Preset Songs Menu");
		
		frame.add(cards, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SS13 Piano Player ohne Audio : Something Already Broke");
		int windowNameRandomizer = (int) (Math.random()*10);
		switch(windowNameRandomizer) {
		case 0:
			frame.setTitle("SS13 Piano Player ohne Audio (Cool if I use it 'cause I made it)");
			break;
		case 1:
			frame.setTitle("SS13 Piano Player ohne Audio : Piano finger fingerer");
			break;
		case 2:
			frame.setTitle("SS13 Piano Player ohne Audio : I like music but I only learnt drums and coding smh");
			break;
		case 3:
			frame.setTitle("SS13 Piano Player ohne Audio : Also check out Minecraft!");
			break;
		case 4:
			frame.setTitle("SS13 Piano Player ohne Audio : This is going on my resume");
			break;
		case 5:
			frame.setTitle("SS13 Piano Player ohne Audio : Proudly coded entirely in boilerplate!");
			break;
		case 6:
			frame.setTitle("SS13 Piano Player ohne Audio Java Edition");
			break;
		case 7:
			frame.setTitle("SS13 Piano Player ohne Audio : Worst Practice");
			break;
		case 8:
			frame.setTitle("SS13 Piano Player ohne Audio : Remember to drink water!");
			break;
		case 9:
			//frame.setTitle("SS13 Piano Player : man...");
			frame.setTitle("SS15 Piano Player ohne Audio: Back to the Present");
			break;
		case 10:
			frame.setTitle("SS13 Piano Player ohne Audio : I'm scared that I'm never going to be enough.");
			break;
		}
		frame.setVisible(true);
	}
	public static void main(String[] args) {
		//This is where the Jar executes.
		initializer.main(null);
		new GUI();
	}
	private void clRefresh() {
		cl = (CardLayout)(cards.getLayout());
	}
	public static boolean isNumeric(String strNum) {
	    if (strNum == null) {
	        return false;
	    }
	    try {
	        @SuppressWarnings("unused")
			int d = Integer.parseInt(strNum);
	    } catch (NumberFormatException nfe) {
	        return false;
	    }
	    return true;
	}
	public void actionPerformed(ActionEvent e) {
		System.out.println("A button was pressed!");
		if(e.getSource()==oldPresetButton) {
			card2.add(backButton);
			clRefresh();
			cl.show(cards, "Playing Presets Menu");
		} else if (e.getSource()==newPresetButton) {
			card3.add(backButton);
			card3.add(songText);
			card3.add(songInputLabel);
			card3.add(tempoText);
			card3.add(tempoInputLabel);
			card3.add(statusLabel);
			clRefresh();
			cl.show(cards, "Adding Presets Menu");
		} else if (e.getSource()==songButton) {
			card4.add(backButton);
			card4.add(songText);
			card4.add(songInputLabel);
			card4.add(tempoText);
			card4.add(tempoInputLabel);
			card4.add(statusLabel);
			clRefresh();
			cl.show(cards, "Playing Non-Preset Songs Menu");
		} else if (e.getSource()==backButton) {
			clRefresh();
			cl.show(cards, "Starting Menu");
			statusLabel.setText("");
		} else if (e.getSource()==playPresetButton) {
			String songPath = (String) songList.getSelectedItem();
			Song song = null;
	        try {
	            FileInputStream fileIn = new FileInputStream(System.getenv("APPDATA")+"\\.pianoplayer\\Songs\\"+songPath);
	            ObjectInputStream in = new ObjectInputStream(fileIn);
	            song = (Song) in.readObject();
	            in.close();
	            fileIn.close();
	        } catch (IOException i) {
	            i.printStackTrace();
	            return;
	        } catch (ClassNotFoundException c) {
	            System.out.println("Song class not found");
	            c.printStackTrace();
	            return;
	        }
	        if (song == null) {
	        	System.out.println("Song Preset could not be found? Oh no!");
	        	System.exit(0);	
	        } else {
	        	try {
					FormattingFileInput.FormatWithString(song.getString());
				} catch (IOException e1) {
					System.out.println("Something fucked up in the formatting with file stage.");
					e1.printStackTrace();
				}
	        	try {
					MusicTranslatorImproved.main(null);
				} catch (IOException e1) {
					System.out.println("Something fucked up in the translating stage.");
					e1.printStackTrace();
				}
	        	try {
					ThreadApplicationTestWithRestInput.mainButWithRest(song.getTempo());
				} catch (IOException | AWTException | InterruptedException e1) {
					System.out.println("Something fucked up in the playing stage... but you probably already knew that.");
					e1.printStackTrace();
				}
	        }
		} else if (e.getSource()==finishNewSongButton) {
			String name = nameText.getText();
			String song = songText.getText();
			if(tempoText.getText()==null||!isNumeric(tempoText.getText())) {
				System.out.println("Tempo is not a parseable integer!");
				statusLabel.setText("Tempo was not a parseable integer! Please try again with an integer tempo!");
			} else if (name.isBlank()) {
				System.out.println("Name field was left empty!");
				statusLabel.setText("Name field is a required field! Please fill out this field!");
			} else if (song.isBlank()) {
				System.out.println("Song text was left empty!");
				statusLabel.setText("Song field left empty! Saving of empty songs not permitted!");
			} else {
				int tempo = Integer.parseInt(tempoText.getText());
				Song newSong = new Song (song, tempo);
				try {
		            FileOutputStream fileOut = new FileOutputStream(System.getenv("APPDATA")+"\\.pianoplayer\\Songs\\"+name+".son");
		            ObjectOutputStream out = new ObjectOutputStream(fileOut);
		            out.writeObject(newSong);
		            out.close();
		            fileOut.close();
		            statusLabel.setText("New song preset succesfully saved in " + name + ".son");
		            System.out.println("New song saved in " + name + ".son");
		        } catch (IOException i) {
		            i.printStackTrace();
		        }
			}
			
		} else if (e.getSource()==playComposedSongButton) {
			String song = songText.getText();
			if(tempoText.getText()==null||!isNumeric(tempoText.getText())) {
				System.out.println("Tempo is not a parseable integer!");
				statusLabel.setText("Tempo was not a parseable integer! Please try again with an integer tempo!");
			} else if (song.isBlank()) {
				System.out.println("Song text was left empty!");
				statusLabel.setText("Song field left empty! Playing of empty songs not permitted!");
			} else {
				int tempo = Integer.parseInt(tempoText.getText());
				try {
					FormattingFileInput.FormatWithString(song);
				} catch (IOException e1) {
					System.out.println("Something fucked up in the formatting with file stage.");
					e1.printStackTrace();
				}
	        	try {
					MusicTranslatorImproved.main(null);
				} catch (IOException e1) {
					System.out.println("Something fucked up in the translating stage.");
					e1.printStackTrace();
				}
	        	try {
					ThreadApplicationTestWithRestInput.mainButWithRest(tempo);
				} catch (IOException | AWTException | InterruptedException e1) {
					System.out.println("Something fucked up in the playing stage... but you probably already knew that.");
					e1.printStackTrace();
				}
			}
		}
	}

}
