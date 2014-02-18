import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class rfid {
	public static void main(String[] args) throws IOException, AWTException {

		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));
		Robot robot = new Robot();
		robot.setAutoDelay(500);
	
		System.out.print("Please enter user name : ");
		String username = null;
		while (true) {
			try {

				username = reader.readLine();
				robot.keyPress(KeyEvent.VK_ENTER);
			} catch (IOException e) {
				e.printStackTrace();
			}
			if (username.length() > 0) {
				System.out.println("You entered : " + username);
				
			}
		}
	}

}