package typeNLearnToType;

import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class LessonPicker implements  ItemListener, ActionListener, Runnable{
	Thread lesson ;
	typeNLearnToType uiDesing ;
	String TU = "Thank U!";
	
	public LessonPicker (typeNLearnToType gui) {
		uiDesing = gui;
		
		LessonListener();
		lessonDefault();
		colorModify();
	}
	
	
	/*
	 * JLables don't have ItemListeners so using MouseListener
	 * Needs
	 * import java.awt.event.MouseAdapter;
	 * import java.awt.event.MouseEvent;
	 */
	void LessonListener() {
		lesson = new Thread(this);
		lesson.start();
		
		uiDesing.phr0.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[0]);
				//uiDesing.phr0.setText(TU);
				uiDesing.intPhrase = 0;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		
		uiDesing.phr1.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[1]);
				uiDesing.intPhrase = 1;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		
		uiDesing.phr2.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[2]);
				uiDesing.intPhrase = 2;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr3.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[3]);
				uiDesing.intPhrase = 3;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
					 lessonDefault();
						colorModify();
				 }
			}
		});

		uiDesing.phr4.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[4]);
				uiDesing.intPhrase = 4;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});

		uiDesing.phr5.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[5]);
				uiDesing.intPhrase = 5;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});

		uiDesing.phr6.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[6]);
				uiDesing.intPhrase = 6;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});

		uiDesing.phr7.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[7]);
				uiDesing.intPhrase = 7;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});

		uiDesing.phr8.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[8]);
				uiDesing.intPhrase = 8;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});

		uiDesing.phr9.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[9]);
				uiDesing.intPhrase = 9 ;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr10.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[10]);
				uiDesing.intPhrase = 10;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr11.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[11]);
				uiDesing.intPhrase = 11;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr12.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[12]);
				uiDesing.intPhrase = 12;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		
		uiDesing.phr13.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[13]);
				uiDesing.intPhrase = 13;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});

		uiDesing.phr14.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[14]);
				uiDesing.intPhrase = 14;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr15.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[15]);
				uiDesing.intPhrase = 15;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr16.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[16]);
				uiDesing.intPhrase = 16;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr17.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[17]);
				uiDesing.intPhrase = 17;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr18.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[18]);
				uiDesing.intPhrase = 18;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr19.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[19]);
				uiDesing.intPhrase = 19;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr20.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[20]);
				uiDesing.intPhrase = 20;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr21.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[21]);
				uiDesing.intPhrase = 21;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr22.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[22]);
				uiDesing.intPhrase = 22;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr23.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[23]);
				uiDesing.intPhrase = 23;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr24.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[24]);
				uiDesing.intPhrase = 24;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr25.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[25]);
				uiDesing.intPhrase = 25;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr26.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[26]);
				uiDesing.intPhrase = 26;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		

		uiDesing.phr27.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[27]);
				uiDesing.intPhrase = 27;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		
		uiDesing.phr28.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[28]);
				uiDesing.intPhrase = 28;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
			}
		});
		
		uiDesing.phr29.addMouseListener(new MouseAdapter() {
			public void mouseClicked(MouseEvent e) {
				uiDesing.topText.selectAll();
				uiDesing.topText.replaceSelection(uiDesing.phrases[29]);				
				uiDesing.intPhrase = 29;
				lessonDefault();
				colorModify();
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
					 lessonDefault();
						colorModify();
				 }
			}
		});
		

		uiDesing.btnNext.addActionListener(new ActionListener()  {

			@Override
			public void actionPerformed(ActionEvent arg0) {
				if (uiDesing.intPhrase >= 29) {
					uiDesing.JFtemp.add(uiDesing.btnComfirm);
					uiDesing.JFtemp.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
					uiDesing.JFtemp.pack();
					uiDesing.JFtemp.setSize(175,125);
					uiDesing.JFtemp.setLocation(uiDesing.getMousePosition());
					uiDesing.JFtemp.setVisible(true); // show the confirm btn
					uiDesing.btnComfirm.setText("<html> <center>Sorry Your done <br> Practice old lessons <br>or<br> Cancle </center> </html>");
					
				}
				if (uiDesing.intPhrase < 29) {
					uiDesing.intPhrase++;
					lessonDefault();
					colorModify();
				
				uiDesing.topText.selectAll();
				//topText.replaceSelection(phrases[intPhrase]);
				if (uiDesing.phrases[uiDesing.intPhrase].length() > 100) {
					 uiDesing.topText.replaceSelection(""+ uiDesing.phrases[uiDesing.intPhrase].substring(0, uiDesing.phrases[uiDesing.intPhrase].length()/2) + " \n " + uiDesing.phrases[uiDesing.intPhrase].substring(uiDesing.phrases[uiDesing.intPhrase].length()/2, uiDesing.phrases[uiDesing.intPhrase].length()) );
				 }
				 else {
					 uiDesing.topText.replaceSelection(uiDesing.phrases[uiDesing.intPhrase]);
				 }
				}
				
			}
			
		});
		
	}
	
	
	

	void lessonDefault() {
		Color gray =  Color.DARK_GRAY;
		uiDesing.phr0.setForeground(gray);
		uiDesing.phr1.setForeground(gray);
		uiDesing.phr2.setForeground(gray);
		uiDesing.phr3.setForeground(gray);
		uiDesing.phr4.setForeground(gray);
		uiDesing.phr5.setForeground(gray);
		uiDesing.phr6.setForeground(gray);
		uiDesing.phr7.setForeground(gray);
		uiDesing.phr8.setForeground(gray);
		uiDesing.phr9.setForeground(gray);
		uiDesing.phr10.setForeground(gray);
		uiDesing.phr11.setForeground(gray);
		uiDesing.phr12.setForeground(gray);
		uiDesing.phr13.setForeground(gray);
		uiDesing.phr14.setForeground(gray);
		uiDesing.phr15.setForeground(gray);
		uiDesing.phr16.setForeground(gray);
		uiDesing.phr17.setForeground(gray);
		uiDesing.phr18.setForeground(gray);
		uiDesing.phr19.setForeground(gray);
		uiDesing.phr20.setForeground(gray);
		uiDesing.phr21.setForeground(gray);
		uiDesing.phr22.setForeground(gray);
		uiDesing.phr23.setForeground(gray);
		uiDesing.phr24.setForeground(gray);
		uiDesing.phr25.setForeground(gray);
		uiDesing.phr26.setForeground(gray);
		uiDesing.phr27.setForeground(gray);
		uiDesing.phr28.setForeground(gray);
		uiDesing.phr29.setForeground(gray);
				
	}
	
	void colorModify() {
		Color magenta = Color.MAGENTA;
		switch (uiDesing.intPhrase){
		case 0 :
			uiDesing.phr0.setForeground(magenta);
			break;
		case 1:
			uiDesing.phr1.setForeground(magenta);
			break;
		case 2:
			uiDesing.phr2.setForeground(magenta);
			break;
		case 3:
			uiDesing.phr3.setForeground(magenta);
			break;
		case 4:
			uiDesing.phr4.setForeground(magenta);
			break;
		case 5: 
			uiDesing.phr5.setForeground(magenta);
			break;
		case 6:
			uiDesing.phr6.setForeground(magenta);
			break;
		case 7:
			uiDesing.phr7.setForeground(magenta);
			break;
		case 8:
			uiDesing.phr8.setForeground(magenta);
			break;
		case 9:
			uiDesing.phr9.setForeground(magenta);
			break;
		case 10:
			uiDesing.phr10.setForeground(magenta);
			break;
		case 11 :
			uiDesing.phr11.setForeground(magenta);
			break;
		case 12:
			uiDesing.phr12.setForeground(magenta);
			break;
		case 13:
			uiDesing.phr13.setForeground(magenta);
			break;
		case 14:
			uiDesing.phr14.setForeground(magenta);
			break;
		case 15:
			uiDesing.phr15.setForeground(magenta);
			break;
		case 16:
			uiDesing.phr16.setForeground(magenta);
			break;
		case 17:
			uiDesing.phr17.setForeground(magenta);
			break;
		case 18:
			uiDesing.phr18.setForeground(magenta);
			break;
		case 19:
			uiDesing.phr19.setForeground(magenta);
			break;
		case 20:
			uiDesing.phr20.setForeground(magenta);
			break;
		case 21:
			uiDesing.phr21.setForeground(magenta);
			break;
		case 22 :
			uiDesing.phr22.setForeground(magenta);
			break;
		case 23:
			uiDesing.phr23.setForeground(magenta);
			break;
		case 24:
			uiDesing.phr24.setForeground(magenta);
			break;
		case 25:
			uiDesing.phr25.setForeground(magenta);
			break;
		case 26:
			uiDesing.phr26.setForeground(magenta);
			break;
		case 27:
			uiDesing.phr27.setForeground(magenta);
			break;
		case 28: 
			uiDesing.phr28.setForeground(magenta);
			break;
		case 29:
			uiDesing.phr29.setForeground(magenta);
			break;
			
			default:
				break;
		
		}
	}

	@Override
	public void run() {
		//do something
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void itemStateChanged(ItemEvent arg0) {
		// TODO Auto-generated method stub
		
	}

	

}
