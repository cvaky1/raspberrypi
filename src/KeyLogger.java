import java.awt.event.KeyEvent;
import System;
import java.awt.event.KeyListener;

public class KeyLogger implements KeyListener {

	/** Handle the key typed event from the text field. */
	public void keyTyped(KeyEvent e) {
		display(e, "KEY TYPED: ");
	}

	/** Handle the key-pressed event from the text field. */
	public void keyPressed(KeyEvent e) {
		display(e, "KEY PRESSED: ");
	}

	/** Handle the key-released event from the text field. */
	public void keyReleased(KeyEvent e) {
		display(e, "KEY RELEASED: ");
	}
	h**p://stackoverflow.com/questions/696170/java-keylistener-without-window-being-open/4394398
	private void display(KeyEvent e, String keyStatus) {

		// You should only rely on the key char if the event
		// is a key typed event.
		int id = e.getID();
		String keyString;
		if (id == KeyEvent.KEY_TYPED) {
			char c = e.getKeyChar();
			keyString = "key character = '" + c + "'";
		} else {
			int keyCode = e.getKeyCode();
			keyString = "key code = " + keyCode + " ("
					+ KeyEvent.getKeyText(keyCode) + ")";
		}// end of if
		System.out.println(keyString);
	}// end of display
	public static void main(String[] args) {
		while(1){
			ConsoleKeyInfo keypress;
			keypress = Console.ReadKey();
		}
		
	}
}