package typeNLearnToType;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import javax.swing.*;
import java.awt.*;

public class textSync implements KeyListener, ItemListener, ActionListener, Runnable {
	
	
	typeNLearnToType uiDesing;
	Thread typingTest;
	String lastStr = "";
	long sTime;
	long eTime;
	char lastKey;
	char[] charPhrase;
	boolean check ;
	
	Font fontkeyPress = new Font("sansserif", Font.ITALIC, 24);
	JButton btnkeyPressed = new JButton(" ");
	
	Thread.UncaughtExceptionHandler h = new Thread.UncaughtExceptionHandler() {
	    public void uncaughtException(Thread th, Throwable ex) {
	        System.out.println("Uncaught exception: " + ex);
	    }
	};
	
	public textSync(typeNLearnToType ui) {
		uiDesing = ui;
		
	}
	
	
	 void message() {	
		 	startTime();
		 	btnkeyPressed.setFont(fontkeyPress);
		 	btnkeyPressed.setVisible(true);
			uiDesing.row3.add(btnkeyPressed);		
		typingTest = new Thread(this);
		typingTest.start();
	 }
	
	@Override
	public void run() {
		lastStr = "";// clear the flag for backspace
		 uiDesing.topText.setEditable(false);
		 uiDesing.topText.selectAll();
		 uiDesing.typeIn.selectAll();
		 if (uiDesing.phrases[23].length() > 100) {
			 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
		 }
		 else {
			 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
		 }
		 //uiDesing.topText.replaceSelection(uiDesing.phrases[1]);
		 charPhrase = uiDesing.topText.getText().toCharArray();  //get what ever is in the topTextBox
		System.out.println("before the while loop");
		while (uiDesing.typeIn.getText().length() != charPhrase.length) {
			
		
		
		while (uiDesing.typeIn.isEditable()) {
			System.out.println("Inside while loop line 1");
			int boxPosition = uiDesing.typeIn.getCaretPosition();
			String boxlastStr = uiDesing.typeIn.getText().toString();
			System.out.println("Inside while loop line 2");
			if ( uiDesing.typeIn.getText().length() > 0) {
				System.out.println("Inside while loop line 3");
				lastKey = uiDesing.typeIn.getText().charAt(uiDesing.typeIn.getText().length()-1);
				//uiDesing.labAWP.setText( "sended 4 test function "+ "last char in textbox:" + lastKey + "Array :" +uiDesing.typeIn.getCaretPosition() );
				System.out.println("method test fail");
				test(lastKey, uiDesing.typeIn.getCaretPosition());
				//System.out.println(lastKey);
			}
			/*
			 * prevent caret position to move on reverse
			 */
			 if (uiDesing.typeIn.getCaretPosition() != uiDesing.typeIn.getText().length()) {
				 System.out.println("caret and string out place");
				 uiDesing.typeIn.setCaretPosition(uiDesing.typeIn.getText().toString().length());
			 }
			
			//uiDesing.labAWP.setText(""+lastKey);
		}
		}
		 
	}

	void showKey(char ke, Boolean bolAccuracy) {
		btnkeyPressed.setText(String.valueOf(ke));
		if (bolAccuracy == false) {
			System.out.println("red");
			btnkeyPressed.setForeground(Color.RED);
		}	
		if(bolAccuracy) {
			System.out.println("gree");
			btnkeyPressed.setForeground(Color.green);
		}
		
	}
	void test(char ke, int intCaret) {
		System.out.println("inside Text");
		 
		 System.out.println("Before if Test ke is: "+ ke + " intvalue was " + intCaret); // we are getting -1 at startup??
		 System.out.println("user text is :" + uiDesing.typeIn.getText().length() + " top text is: "+ charPhrase.length);
		//Prone to logic error System.out.println(charPhrase[intCaret]);
		 if (uiDesing.typeIn.getText().length() == charPhrase.length  || uiDesing.typeIn.getText().length() >= charPhrase.length ) {
			uiDesing.typeIn.setEditable(false);
			btnkeyPressed.setVisible(false);
			uiDesing.btnStart.setEnabled(true);
			endTime();
			elapsedTime();
			typingTest.interrupt();
		 }
		 if (intCaret == -1 || intCaret == 0) {
			 intCaret = 0;
		 }else {
			 intCaret--;
		 }
		 
		 System.out.println(charPhrase[intCaret]);
		 if ( charPhrase[intCaret] == ke) {
			 System.out.println("true test");
			 showKey(ke, true);
		 }
		 if ( charPhrase[intCaret] != ke) {
			 System.out.println("false test");
			 showKey(ke, false);
		 }
		
	}
	void elapsedTime() {
		//5 char is consider a word long
		//your words per min = ((char).length() / 5 )/ (elapsedSeconds/60)
		long elapsedTime = eTime - sTime;
		double elapsedSeconds = (double) (elapsedTime / 1000);
		int totalwords = charPhrase.length / 5;
		double awp =  ((charPhrase.length / 5 ) / (elapsedSeconds/60));
		System.out.println("we are going to write to labAWP");		
		double intElapsed =  elapsedSeconds/60;
		uiDesing.labAWP.setText("Your Speed is: " + Math.round(awp) );
	}
	void startTime() {
		sTime = System.currentTimeMillis();
	}
	void endTime() {
		eTime = System.currentTimeMillis();
	}
	
	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
	
	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent ke) {
		 if(ke.getKeyCode() == KeyEvent.VK_BACK_SPACE)
		    {  
		        lastStr = "BACK_SPACE";
		    }

		    if(ke.getKeyCode() == KeyEvent.VK_ESCAPE)
		    {
		        lastStr = "ESCAPE";
		    }
		   
		
	}

}
