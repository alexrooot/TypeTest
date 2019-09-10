package typeNLearnToType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LighKey implements KeyListener, Runnable {
	String keyevent = "";
	KeyEvent keyData;
	Thread light ;
	typeNLearnToType gUI;
	Color dColor = Color.BLACK;
	
	

	public LighKey(typeNLearnToType typeNLearnToType) {
		gUI = typeNLearnToType;
	}
	
	void lightKey () {
		keyFont();
		gUI.addKeyListener(this);
		gUI.typeIn.addKeyListener(this);
		//gUI.panel.setFocusable(true);
		//gUI.typeIn.setEditable(true);
		light = new Thread(this);
		light.start();
	}	

	@Override
	public void keyPressed(KeyEvent e) {
		keyevent = String.valueOf(e.getKeyChar());
		keyData = e;
		lightChar(e.getKeyChar());
	}

	@Override
	public void keyReleased(KeyEvent ee) {
		
		
	}
	void keyFont() {
		Font keyFontBold = new Font("sansserif",Font.BOLD, 14);
		
		gUI.topText.setFont(new Font("sansserif", Font.BOLD, 16));
		
		gUI.charTilda.setFont(keyFontBold);
		gUI.char1.setFont(keyFontBold);
		gUI.char2.setFont(keyFontBold);
		gUI.char3.setFont(keyFontBold);
		gUI.char4.setFont(keyFontBold);
		gUI.char5.setFont(keyFontBold);
		gUI.char6.setFont(keyFontBold);
		gUI.char7.setFont(keyFontBold);
		gUI.char8.setFont(keyFontBold);
		gUI.char9.setFont(keyFontBold);
		gUI.char0.setFont(keyFontBold);
		gUI.charNeg.setFont(keyFontBold);
		gUI.charEqual.setFont(keyFontBold);
		gUI.charBackSpace.setFont(keyFontBold);
		gUI.charTab.setFont(keyFontBold);
		gUI.charQ.setFont(keyFontBold);
		gUI.charW.setFont(keyFontBold);
		gUI.charE.setFont(keyFontBold);
		gUI.charR.setFont(keyFontBold);
		gUI.charT.setFont(keyFontBold);
		gUI.charY.setFont(keyFontBold);
		gUI.charU.setFont(keyFontBold);
		gUI.charI.setFont(keyFontBold);
		gUI.charO.setFont(keyFontBold);
		gUI.charP.setFont(keyFontBold);
		gUI.charOpenCap.setFont(keyFontBold);
		gUI.charCloseCap.setFont(keyFontBold);
		gUI.charBackSlash.setFont(keyFontBold);
		gUI.charCaps.setFont(keyFontBold);
		gUI.charA.setFont(keyFontBold);
		gUI.charS.setFont(keyFontBold);
		gUI.charD.setFont(keyFontBold);
		gUI.charD.setFont(keyFontBold);
		gUI.charF.setFont(keyFontBold);
		gUI.charG.setFont(keyFontBold);
		gUI.charH.setFont(keyFontBold);
		gUI.charJ.setFont(keyFontBold);
		gUI.charK.setFont(keyFontBold);
		gUI.charL.setFont(keyFontBold);
		gUI.charSemiColan.setFont(keyFontBold);
		gUI.charQuote.setFont(keyFontBold);
		gUI.charEnter.setFont(keyFontBold);
		gUI.charShiftLeft.setFont(keyFontBold);
		gUI.charShiftRight.setFont(keyFontBold);
		gUI.charZ.setFont(keyFontBold);
		gUI.charX.setFont(keyFontBold);
		gUI.charC.setFont(keyFontBold);
		gUI.charV.setFont(keyFontBold);
		gUI.charB.setFont(keyFontBold);
		gUI.charN.setFont(keyFontBold);
		gUI.charM.setFont(keyFontBold);
		gUI.charLessThen.setFont(keyFontBold);
		gUI.charHigherThen.setFont(keyFontBold);
		gUI.charFowardSlash.setFont(keyFontBold);
		gUI.charCtrlLeft.setFont(keyFontBold);
		gUI.charCtrlRight.setFont(keyFontBold);
		gUI.charWinLeft.setFont(keyFontBold);
		gUI.charWinRight.setFont(keyFontBold);
		gUI.charAltLeft.setFont(keyFontBold);
		gUI.charAltRight.setFont(keyFontBold);
		gUI.charFN.setFont(keyFontBold);
		gUI.charSpace.setFont(keyFontBold);
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent eee) {
		
	}
	void lightChar(char strChar) {
		switch (strChar) {
		case '`':
			gUI.charTilda.setForeground(Color.CYAN);
			break;
		case '1':
			gUI.char1.setForeground(Color.CYAN);
			break;
		case '2':
			gUI.char2.setForeground(Color.CYAN);
			break;
		case '3':
			gUI.char3.setForeground(Color.CYAN);
			break;
		case '4':
			gUI.char4.setForeground(Color.CYAN);
			break;
		case '5':
			gUI.char5.setForeground(Color.CYAN);
			break;
		case '6':
			gUI.char6.setForeground(Color.CYAN);
			break;
		case '7':
			gUI.char7.setForeground(Color.CYAN);
			break;
		case '8':
			gUI.char8.setForeground(Color.CYAN);
			break;
		case '9':
			gUI.char9.setForeground(Color.CYAN);
			break;
		case '0':
			gUI.char0.setForeground(Color.CYAN);
			break;
		case '-':
			gUI.charNeg.setForeground(Color.CYAN);
			break;
		case '=':
			gUI.charEqual.setForeground(Color.CYAN);
			break;
		 case 'A':
			gUI.charA.setForeground(Color.CYAN);
			break; 
		case 'a':
			gUI.charA.setForeground(Color.CYAN);
			break; 
		case'B':
			gUI.charB.setForeground(Color.CYAN);
			break; 
		case'b':
			gUI.charB.setForeground(Color.CYAN);
			break; 
		case 'C':
			gUI.charC.setForeground(Color.CYAN);
			break; 
		case 'c' :
			gUI.charC.setForeground(Color.CYAN);
			break; 
		case 'D':
			gUI.charD.setForeground(Color.CYAN);
			break; 
		case 'd':
			gUI.charD.setForeground(Color.CYAN);
			break; 
		case 'E':
			gUI.charE.setForeground(Color.CYAN);
			break; 
		case 'e':
			gUI.charE.setForeground(Color.CYAN);
			break; 
		case 'F':
			gUI.charF.setForeground(Color.CYAN);
			break; 
		case 'f':
			gUI.charF.setForeground(Color.CYAN);
			break;
		case 'G':
			gUI.charG.setForeground(Color.CYAN);
			break; 
		case 'g':
			gUI.charG.setForeground(Color.CYAN);
			break; 
		case 'H':
			gUI.charH.setForeground(Color.CYAN);
			break; 
		case 'h':
			gUI.charH.setForeground(Color.CYAN);
			break; 
		case 'I':
			gUI.charI.setForeground(Color.CYAN);
			break; 
		case 'i':
			gUI.charI.setForeground(Color.CYAN);
			break; 
		case 'J':
			gUI.charJ.setForeground(Color.CYAN);
			break; 
		case 'j':
			gUI.charJ.setForeground(Color.CYAN);
			break; 
		case 'K':
			gUI.charK.setForeground(Color.CYAN);
			break;
		case 'k':
			gUI.charK.setForeground(Color.CYAN);
			break;
		case 'L':
			gUI.charL.setForeground(Color.CYAN);
			break;
		case 'l':
			gUI.charL.setForeground(Color.CYAN);
			break;
		case 'M':
			gUI.charM.setForeground(Color.CYAN);
			break;
		case 'm':
			gUI.charM.setForeground(Color.CYAN);
			break;
		case 'N':
			gUI.charN.setForeground(Color.CYAN);
			break;
		case 'n':
			gUI.charN.setForeground(Color.CYAN);
			break;
		case 'O':
			gUI.charO.setForeground(Color.CYAN);
			break;
		case 'o':
			gUI.charO.setForeground(Color.CYAN);
			break;
		case 'P':
			gUI.charP.setForeground(Color.CYAN);
			break;
		case 'p':
			gUI.charP.setForeground(Color.CYAN);
			break;
		case 'Q':
			gUI.charQ.setForeground(Color.CYAN);
			break;
		case'q':
			gUI.charQ.setForeground(Color.CYAN);
			break;
		case 'R':
			gUI.charR.setForeground(Color.CYAN);
			break;
		case 'r':
			gUI.charR.setForeground(Color.CYAN);
			break;
		case 'S':
			gUI.charS.setForeground(Color.CYAN);
			break;
		case 's':
			gUI.charS.setForeground(Color.CYAN);
			break;
		case 'T':
			gUI.charT.setForeground(Color.CYAN);
			break;
		case 't':
			gUI.charT.setForeground(Color.CYAN);
			break;
		case 'U':
			gUI.charU.setForeground(Color.CYAN);
			break;
		case 'u' :
			gUI.charU.setForeground(Color.CYAN);
			break;
		case 'V':
			gUI.charV.setForeground(Color.CYAN);
			break;
		case 'v':
			gUI.charV.setForeground(Color.CYAN);
			break;
		case 'W':
			gUI.charW.setForeground(Color.CYAN);
			break;
		case 'w':
			gUI.charW.setForeground(Color.CYAN);
			break;
		case 'X':
			gUI.charX.setForeground(Color.CYAN);
			break;
		case 'x':
			gUI.charX.setForeground(Color.CYAN);
			break;
		case 'Y':
			gUI.charY.setForeground(Color.CYAN);
			break;
		case 'y':
			gUI.charY.setForeground(Color.CYAN);
			break;
		case 'Z':
			gUI.charZ.setForeground(Color.CYAN);
			break;
		case 'z':
			gUI.charZ.setForeground(Color.CYAN);
			break;		
		case '[':
			gUI.charOpenCap.setForeground(Color.CYAN);break;
		case '{':
			gUI.charOpenCap.setForeground(Color.CYAN);break;
		case ']':
			gUI.charCloseCap.setForeground(Color.CYAN);break;
		case '\\':
		gUI.charBackSlash.setForeground(Color.CYAN);break;
		case ':':
			gUI.charSemiColan.setForeground(Color.CYAN);break;
		case ';':
			gUI.charSemiColan.setForeground(Color.CYAN);break;
		case ',':
			gUI.charLessThen.setForeground(Color.CYAN);break;
		case '\'':
			gUI.charQuote.setForeground(Color.CYAN);break;
		case '"':
			gUI.charQuote.setForeground(Color.CYAN); break;
		case '<':
		gUI.charLessThen.setForeground(Color.CYAN);break;
		case '.':
			gUI.charHigherThen.setForeground(Color.CYAN);break;
		case '>' :
			gUI.charHigherThen.setForeground(Color.CYAN);break;
		case '/':
			gUI.charFowardSlash.setForeground(Color.CYAN); break;			
			default:
			//do nothing
		}
		if (keyData.getKeyCode() == KeyEvent.VK_BACK_SPACE) {
			gUI.charBackSpace.setForeground(Color.CYAN);
		}
		if (keyData.getKeyCode() == KeyEvent.VK_SPACE) {
			gUI.charSpace.setForeground(Color.CYAN);
		}
	}
	void keyColordefault() {
		// make all keybuttons back to devalult color
		gUI.charTilda.setForeground(dColor);
		gUI.char1.setForeground(dColor);
		gUI.char2.setForeground(dColor);
		gUI.char3.setForeground(dColor);
		gUI.char4.setForeground(dColor);
		gUI.char5.setForeground(dColor);
		gUI.char6.setForeground(dColor);
		gUI.char7.setForeground(dColor);
		gUI.char8.setForeground(dColor);
		gUI.char9.setForeground(dColor);
		gUI.char0.setForeground(dColor);
		gUI.charNeg.setForeground(dColor);
		gUI.charEqual.setForeground(dColor);
		gUI.charBackSpace.setForeground(dColor);
		gUI.charTab.setForeground(dColor);
		gUI.charQ.setForeground(dColor);
		gUI.charW.setForeground(dColor);
		gUI.charE.setForeground(dColor);
		gUI.charR.setForeground(dColor);
		gUI.charT.setForeground(dColor);
		gUI.charY.setForeground(dColor);
		gUI.charU.setForeground(dColor);
		gUI.charI.setForeground(dColor);
		gUI.charO.setForeground(dColor);
		gUI.charP.setForeground(dColor);
		gUI.charOpenCap.setForeground(dColor);
		gUI.charCloseCap.setForeground(dColor);
		gUI.charCaps.setForeground(dColor);
		gUI.charA.setForeground(dColor);
		gUI.charS.setForeground(dColor);
		gUI.charD.setForeground(dColor);
		gUI.charF.setForeground(dColor);
		gUI.charG.setForeground(dColor);
		gUI.charH.setForeground(dColor);
		gUI.charJ.setForeground(dColor);
		gUI.charK.setForeground(dColor);
		gUI.charL.setForeground(dColor);
		gUI.charSemiColan.setForeground(dColor);
		gUI.charQuote.setForeground(dColor);
		gUI.charShiftLeft.setForeground(dColor);
		gUI.charShiftRight.setForeground(dColor);
		gUI.charZ.setForeground(dColor);
		gUI.charX.setForeground(dColor);
		gUI.charC.setForeground(dColor);
		gUI.charV.setForeground(dColor);
		gUI.charB.setForeground(dColor);
		gUI.charN.setForeground(dColor);
		gUI.charM.setForeground(dColor);
		gUI.charLessThen.setForeground(dColor);
		gUI.charHigherThen.setForeground(dColor);
		gUI.charFowardSlash.setForeground(dColor);
		gUI.charSpace.setForeground(dColor);
		
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		while(true){
			try {
				gUI.repaint();
				Thread.sleep(250);
				keyColordefault();
				System.out.println("got"+ keyevent +keyevent + keyevent );
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}