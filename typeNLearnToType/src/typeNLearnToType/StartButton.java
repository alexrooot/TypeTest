package typeNLearnToType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
 
//Interface class to start button
public class StartButton implements KeyListener, ItemListener, ActionListener, Runnable {
	typeNLearnToType uiDesing;
	Thread startWindowCheck;
	StringBuilder sb = new StringBuilder();
	String press = "?";
	Boolean StartButtonWindow = false;
	
	public StartButton(typeNLearnToType gui) {
		uiDesing = gui;
	}
			
	void checkWindow() {
		uiDesing.JFtemp.add(uiDesing.btnComfirm);
		uiDesing.JFtemp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		uiDesing.JFtemp.pack();
		uiDesing.JFtemp.setSize(175,125);
		uiDesing.JFtemp.setLocation(uiDesing.getMousePosition());
		uiDesing.JFtemp.setVisible(true); // show the confirm btn
		uiDesing.btnComfirm.setText("<html> <center>Press the Space-Bar <br> to Start <br>or<br> Click her </center> </html>");
		uiDesing.btnStart.setEnabled(false);// disable Interface Start btn
		//uiDesing.labGreatMsg.setText("we are going to the sysnc:");
		startWindowCheck = new Thread(this);
		startWindowCheck.start();				
	}		
		
	@Override
	public void run() { // Main Start Button		
		while (uiDesing.JFtemp.isVisible()) {
			//StartButtonWindow = uiDesing.JFtemp.isVisible();// looks if the JFram is visible or not
			System.out.println("Confrim windows is still Open");// console message that JFram is still open
			keyTypedCheck();// look for varString change to 1 space-bar	   
		}		
	}



	private void keyTypedCheck() {
			
		if (press == " ") {
			//Thread.currentThread().interrupt();
			System.out.print("We got a pacebar stop thread");
			uiDesing.btnStart.setEnabled(false);			
			uiDesing.JFtemp.dispose();// close the startButton JFram
			uiDesing.typeIn.grabFocus();// set focus on textBox
			
			//textSync temtextSync = new textSync(uiDesing);
		}
		 
	}






	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		String command = arg0.getActionCommand();
		
	}



	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		press = String.valueOf(e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyTyped(KeyEvent e) {//Listener for keyboard type and store as variable for "while thread loop"
		//press = e.toString(); // 
		
	}

}

