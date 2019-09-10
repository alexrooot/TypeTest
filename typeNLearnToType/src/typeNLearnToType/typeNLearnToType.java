package typeNLearnToType;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;

import javax.swing.*;

public class typeNLearnToType extends JFrame implements ItemListener, ActionListener, Runnable, KeyListener  {
	Thread sTread ;
	StartButton threadbtnStart = new StartButton(this);
	textSync threadSync = new textSync(this);
	LighKey LightKey = new LighKey(this);
	int intPhrase = 0;
	public String[] phrases = {
			"ff jj ff jj ff jj ff jj ff jj ff jj ff jj ff jj ff jj ff jj ff jj ff jj ff jj ff jj ff jj",
			"dd kk dd kk dd kk dd kk dd kk dd kk dd kk dd kk dd kk dd kk dd kk dd kk dd kk dd kk dd kk",
			"ss ll ss ll ss ll ss ll ss ll ss ll ss ll ss ll ss ll ss ll ss ll ss ll ss ll ss ll ss ll",
			"aa ;; aa ;; aa ;; aa ;; aa ;; aa ;; aa ;; aa ;; aa ;; aa ;; aa ;; aa ;; aa ;; aa ;; aa ;;",
			"gg aa gg aa gg aa gg aa gg ff gg ff gg aa gg aa gg aa gg aa gg ff gg ff gg aa gg aa gg aa",
			"hh ;; hh ;; hh ;; hh ;; hh jj hh jj hh ;; hh ;; hh ;; hh ;; hh jj hh jj hh ;; hh ;; hh ;;",
			
			"zz // zz // zz // zz // zz // zz // zz zz // // zz zz // // zz zz // // zz // zz // zz //",
			"xx .. xx .. xx .. xx .. xx .. xx .. xx xx .. .. xx xx .. .. xx xx .. .. xx .. xx .. xx ..",
			"cc ,, cc ,, cc ,, cc ,, cc ,, cc ,, cc cc ,, ,, cc cc ,, ,, cc cc ,, ,, cc ,, cc ,, cc ,,",
			"vv mm vv mm vv mm vv mm vv mm vv mm vv vv mm mm vv vv mm mm vv vv mm mm vv mm vv mm vv mm",
			"bb nn bb nn bb nn bb nn bb nn bb nn bb bb nn nn bb bb nn nn bb bb nn nn bb nn bb nn bb nn",
			
			"qq pp qq pp qq pp qq pp qq pp qq pp qq qq pp pp qq qq pp pp qq qq pp pp qq pp qq pp qq pp",
			"ww oo ww oo ww oo ww oo ww oo ww oo ww ww oo oo ww ww oo oo ww ww oo oo ww oo ww oo ww oo",
			"ee ii ee ii ee ii ee ii ee ii ee ii ee ee ii ii ee ee ii ii ee ee ii ii ee ii ee ii ee ii",
			"rr uu rr uu rr uu rr uu rr uu rr uu rr rr uu uu rr rr uu uu rr rr uu uu rr uu rr uu rr uu",
			"tt yy tt yy tt yy tt yy tt yy tt yy tt tt yy yy tt tt yy yy tt tt yy yy tt yy tt yy tt yy",
			
			"11 == 11 == 11 == 11 == 11 == 11 == 11 11 == == 11 11 == == 11 11 == == 11 == 11 == 11 ==",
			"22 -- 22 -- 22 -- 22 -- 22 -- 22 -- 22 22 -- -- 11 11 -- -- 22 22 -- -- 22 -- 22 -- 22 --",
			"33 00 33 00 33 00 33 00 33 00 33 00 33 33 00 00 33 33 00 00 33 33 00 00 33 00 33 00 33 00",
			"44 99 44 99 44 99 44 99 44 99 44 99 44 44 99 99 44 44 99 99 44 44 99 99 44 99 44 99 44 99",
			"55 88 55 88 55 88 55 88 55 88 55 88 55 55 88 88 55 55 88 88 55 55 88 88 55 88 55 88 55 88",
			"66 77 66 77 66 77 66 77 66 77 66 77 66 66 77 77 66 66 77 77 66 66 77 77 66 77 66 77 66 77",
			
			"I live in house that has no windows, if I whant to go out side I must destroy a wall open; Who I'm I? --- A baby chike?",
			"I am a word of six; my first three letters refer to an automobile; my last three letters refer to a household animal; my first four letters is a fish; my whole is found in your room. What am I? --- A carpet.",
			"Which of the following words don't belong in the group and why? CORSET, COSTER, SECTOR, ESCORT, COURTS -- Courts, all of the other words are anagrams of each other.",
			"Who makes it, has no need of it. Who buys it, has no use for it. Who uses it can neither see nor feel it. What is it? -- Coffin.",
			"A user interface is like a joke. If you have to explain it, it's not that good.",
			"So, where do couples meet this day's ? Windows User - At the office, Mac Users - At Starbucks, Lunux users - GitHum",
			"Commenting your code is like cleaning your bathroom; you never want to do it, but it really does create a more pleasant experience for you and your guests.",
			"Gaze at this sentence for just about sixty seconds and then explain what makes it quite different from the average sentence. Quick! -- It contains all the letters in the alphabet.",
			
	};
	
//	phrase[1] = "I live in house that has no windows , if want to go out side I must destroy a wall open; Who i'll I?";
		
	JFrame JFtemp = new JFrame();//for pop-up dialog OR JOptionPane
		
	JButton btnComfirm = new JButton("<html> <center>Press the Space-Bar <br> to Start <br>or<br> Click her </center> </html>");
		
	JPanel panel = new JPanel();
	JPanel row1 = new JPanel();
	JPanel row2 = new JPanel();
	JPanel keyRow1 = new JPanel();
	JPanel keyRow2 = new JPanel();
	JPanel keyRow3 = new JPanel();
	JPanel keyRow4 = new JPanel();
	JPanel keyRow5 = new JPanel();
	JPanel phraseList = new JPanel();
	JPanel row3 = new JPanel();
	JPanel eastP = new JPanel();
	JTextArea topText = new JTextArea("set up");
	//JTextArea txtScrollReading = new JTextArea("I live in house that has no windows , if want to go out side I must destroy a wall open; Who i'll I?", 5,10);
	//JScrollPane rowScroll = new JScrollPane(txtScrollReading);
	//rowScroll.setVeritalScrollBarPolicy(ScrollPanelConstants.VERTICAL_SCROLLBAR_ALLWAYS);
	JLabel txtReading = new JLabel("I live in house that has no windows , if want to go out side I must destroy a wall open; Who i'll I");
	
	JButton btnNull = new JButton ("__________________________");
	
	JButton charTilda = new JButton ("`");
	JButton char1 = new JButton ("1");
	JButton char2 = new JButton ("2");
	JButton char3 = new JButton ("3");
	JButton char4 = new JButton ("4");
	JButton char5 = new JButton ("5");
	JButton char6 = new JButton ("6");
	JButton char7 = new JButton ("7");
	JButton char8 = new JButton ("8");
	JButton char9 = new JButton ("9");
	JButton char0 = new JButton ("0");
	JButton charNeg = new JButton ("-");
	JButton charEqual = new JButton ("=");
	JButton charBackSpace = new JButton ("Backspace");
	
	
	JButton charTab = new JButton("TAB");
	JButton charQ = new JButton("Q");
	JButton charW = new JButton("W");
	JButton charE = new JButton ("E");
	JButton charR = new JButton ("R");
	JButton charT = new JButton("T");
	JButton charY = new JButton("Y");
	JButton charU = new JButton("U");
	JButton charI = new JButton("I");
	JButton charO = new JButton("O");
	JButton charP = new JButton("P");
	JButton charOpenCap = new JButton("{");
	JButton charCloseCap = new JButton("}");
	JButton charBackSlash = new JButton("\\");
	
	JButton charCaps = new JButton("Caps");
	JButton charA = new JButton("A");
	JButton charS = new JButton("S");
	JButton charD = new JButton ("D");
	JButton charF = new JButton ("F");
	JButton charG = new JButton ("G");
	JButton charH = new JButton ("H");
	JButton charJ = new JButton ("J");
	JButton charK = new JButton ("K");
	JButton charL = new JButton ("L");
	JButton charSemiColan = new JButton (";");
	JButton charQuote = new JButton ("'");
	JButton charEnter = new JButton ("Enter");
	
	JButton charShiftLeft = new JButton ("Shift");
	JButton charShiftRight = new JButton ("Shift");
	JButton charZ = new JButton ("Z");
	JButton charX = new JButton ("X");
	JButton charC = new JButton ("C");
	JButton charV = new JButton ("V");
	JButton charB = new JButton ("B");
	JButton charN = new JButton ("N");
	JButton charM = new JButton ("M");
	JButton charLessThen = new JButton ("<");
	JButton charHigherThen = new JButton (">");
	JButton charFowardSlash = new JButton ("/");
	
	JButton charCtrlLeft = new JButton ("Ctrl");
	JButton charCtrlRight = new JButton ("Ctrl");
	JButton charFN = new JButton ("Fn");
	JButton charWinLeft = new JButton ("Win");
	JButton charWinRight = new JButton ("Win");
	JButton charSpace = new JButton ("_____________________________");
	JButton charAltLeft = new JButton ("Alt");
	JButton charAltRight = new JButton ("Alt");
	
	JLabel phr0 = new JLabel("1");
	JLabel phr1 = new JLabel ("2");
	JLabel phr2 = new JLabel ("3");
	JLabel phr3 = new JLabel ("4");
	JLabel phr4 = new JLabel ("5");
	JLabel phr5 = new JLabel ("6");
	JLabel phr6 = new JLabel ("7");
	JLabel phr7 = new JLabel ("8");
	JLabel phr8 = new JLabel ("9");
	JLabel phr9 = new JLabel ("10");
	JLabel phr10 = new JLabel ("11");
	JLabel phr11 = new JLabel ("12");
	JLabel phr12 = new JLabel ("13");
	JLabel phr13 = new JLabel ("14");
	JLabel phr14 = new JLabel ("15");
	JLabel phr15 = new JLabel ("16");
	JLabel phr16 = new JLabel ("17");
	JLabel phr17 = new JLabel ("18");
	JLabel phr18 = new JLabel ("19");
	JLabel phr19 = new JLabel ("20");
	JLabel phr20 = new JLabel ("21");
	JLabel phr21 = new JLabel ("22");
	JLabel phr22 = new JLabel ("23");
	JLabel phr23 = new JLabel ("24");
	JLabel phr24 = new JLabel ("25");
	JLabel phr25 = new JLabel ("26");
	JLabel phr26 = new JLabel ("27");
	JLabel phr27 = new JLabel ("28");
	JLabel phr28 = new JLabel ("29");
	JLabel phr29 = new JLabel ("30");
			
	
	JTextField typeIn = new JTextField(40);
	
	JLabel labAWP = new JLabel("Your AWP:  ");
	JLabel labGreatMsg = new JLabel("<html>When ready press<br> the Space bar <br>to auto start</html>");
	JButton btnStart = new JButton ("START");
	JButton btnReset = new JButton("RESET");
	JButton btnNext = new JButton("NEXT");	
	
	private void setLookAndFeel() {
		try{
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		}catch(Exception e) {
			//return to program
		}		
	}
	
	public typeNLearnToType() {
		super("On your mark's, ready, Type!");	
		addKeyListener(this);
		setLookAndFeel();
		setSize(1200,600);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		FlowLayout flowCenter = new FlowLayout(FlowLayout.CENTER, 5, 5);
		GridLayout LayoutCanvas = new GridLayout(3,1);
		BorderLayout boardLayout = new BorderLayout();
		
		setLayout(boardLayout);
		
		topText.setEditable(false);
		row1.setLayout(flowCenter);
		row1.add(topText);
		add((row1), BorderLayout.NORTH);
		
		
		GridLayout keyboarPane = new GridLayout(10 ,1);
		FlowLayout keyboarPaneLine = new FlowLayout();
		row2.setLayout(keyboarPane);
		
		
		keyRow1.setLayout(keyboarPaneLine);
		keyRow1.add(charTilda);
		keyRow1.add(char1);
		keyRow1.add(char2);
		keyRow1.add(char3);
		keyRow1.add(char4);
		keyRow1.add(char5);
		keyRow1.add(char6);
		keyRow1.add(char7);
		keyRow1.add(char8);
		keyRow1.add(char9);
		keyRow1.add(char0);
		keyRow1.add(charNeg);
		keyRow1.add(charEqual);
		keyRow1.add(charBackSpace);
		
		keyRow2.setLayout(keyboarPaneLine);
		keyRow2.add(charTab);
		keyRow2.add(charQ);
		keyRow2.add(charW);
		keyRow2.add(charE);
		keyRow2.add(charR);
		keyRow2.add(charT);
		keyRow2.add(charY);
		keyRow2.add(charU);
		keyRow2.add(charI);
		keyRow2.add(charO);
		keyRow2.add(charP);
		keyRow2.add(charOpenCap);
		keyRow2.add(charCloseCap);
		keyRow2.add(charBackSlash);
				
		keyRow3.setLayout(keyboarPaneLine);
		keyRow3.add(charCaps);
		keyRow3.add(charA);
		keyRow3.add(charS);
		keyRow3.add(charD);
		keyRow3.add(charF);
		keyRow3.add(charG);
		keyRow3.add(charH);
		keyRow3.add(charJ);
		keyRow3.add(charK);
		keyRow3.add(charL);
		keyRow3.add(charSemiColan);
		keyRow3.add(charQuote);
		keyRow3.add(charEnter);
		
		keyRow4.setLayout(keyboarPaneLine);
		keyRow4.add(charShiftLeft);
		keyRow4.add(charZ);
		keyRow4.add(charX);
		keyRow4.add(charC);
		keyRow4.add(charV);
		keyRow4.add(charB);
		keyRow4.add(charN);
		keyRow4.add(charM);
		keyRow4.add(charLessThen);
		keyRow4.add(charHigherThen);
		keyRow4.add(charFowardSlash);
		keyRow4.add(charShiftRight);
				
		keyRow5.setLayout(keyboarPaneLine);
		keyRow5.add(charCtrlLeft);
		keyRow5.add(charFN);
		keyRow5.add(charWinLeft);
		keyRow5.add(charAltRight);
		keyRow5.add(charSpace);
		keyRow5.add(charAltRight);
		keyRow5.add(charWinRight);
		keyRow5.add(charCtrlRight);
		
		phraseList.add(phr0);
		phraseList.add(phr1);
		phraseList.add(phr2);
		phraseList.add(phr3);
		phraseList.add(phr4);
		phraseList.add(phr5);
		phraseList.add(phr6);
		phraseList.add(phr7);
		phraseList.add(phr8);
		phraseList.add(phr8);
		phraseList.add(phr9);
		phraseList.add(phr10);
		phraseList.add(phr11);
		phraseList.add(phr12);
		phraseList.add(phr13);
		phraseList.add(phr14);
		phraseList.add(phr15);
		phraseList.add(phr16);
		phraseList.add(phr17);
		phraseList.add(phr18);
		phraseList.add(phr19);
		phraseList.add(phr20);
		phraseList.add(phr21);
		phraseList.add(phr22);
		phraseList.add(phr23);
		phraseList.add(phr24);
		phraseList.add(phr25);
		phraseList.add(phr26);
		phraseList.add(phr27);
		phraseList.add(phr28);
		phraseList.add(phr29);
		
		row2.add(phraseList);
		row2.add(keyRow1);
		row2.add(keyRow2);
		row2.add(keyRow3);
		row2.add(keyRow4);
		row2.add(keyRow5);
		JButton btnEmpty = new JButton();
		row2.add(btnEmpty);
		row2.add(btnEmpty);
		row2.add(btnEmpty);
		row2.add(btnEmpty);
		row2.add(btnEmpty);
		btnEmpty.setVisible(false);
		add(row2, boardLayout.CENTER);
		
		LessonPicker lessonPicker = new LessonPicker(this);
		lessonPicker.LessonListener();
		
		
		FlowLayout inputLayout = new FlowLayout(FlowLayout.CENTER, 5, 5);
		row3.setLayout(inputLayout);
		typeIn.setEditable(false);
		row3.add(typeIn);
		
		
		
		add((row3), boardLayout.SOUTH);
		
		GridLayout eastPanle = new GridLayout(6,1);
		eastP.setLayout(eastPanle);
		eastP.add(labAWP);
		eastP.add(labGreatMsg);
		eastP.add(btnStart);
		eastP.add(btnReset);
		eastP.add(btnNext);
		add((eastP), boardLayout.EAST);
		setVisible(true);
		
		
		typeIn.grabFocus();// make JText active for input text
		
		
		
		btnStart.addActionListener(new java.awt.event.ActionListener() {
		
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("you click the interface button START");
				threadbtnStart.checkWindow();
								 
			}
			
		});
		
		LightKey.lightKey(); // keep checking keyboard
		
		btnComfirm.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				// TODO Auto-generated method stub				
				JFtemp.dispose();
				typeIn.selectAll();
				typeIn.replaceSelection("");
				threadSync.message();
				typeIn.setEditable(true);
				typeIn.grabFocus();// make JText active for input text
				
			}
			
		});
		
		btnReset.addActionListener(new java.awt.event.ActionListener() {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				typeIn.setEditable(false);
				typeIn.selectAll();
				typeIn.replaceSelection("");
				labAWP.setText(" AWP Reseted");
				btnStart.setEnabled(true);
			}
			
		});
	
		System.out.println("Before we initize background thread");
		StartButton startBack01 = new StartButton(this);
		
		
		//startBack01.checkWindow();
		//btnStart.addItemListener(startBack01);
		//typeIn.grabFocus();// make JText active for input text
				
	}
		 	
	public static void main(String[] args) {
		typeNLearnToType start = new typeNLearnToType();
	}
	@Override
	public void run() {
	}
	@Override
	public void actionPerformed(ActionEvent arg0) {		
	}
	@Override
	public void itemStateChanged(ItemEvent arg0) {
	}

	@Override
	public void keyPressed(KeyEvent e) {	
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

}
