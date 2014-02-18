import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.util.Scanner;

public class test {
	public static void main(String[] args) throws AWTException {

		Scanner in = new Scanner(System.in);
		System.out.println("Enter some strings !");
		boolean loop = true;
		Robot robot = new Robot();
		while (loop) {
			
			String s = in.nextLine();
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.delay(500);
			if (s != "") {
				System.out.println(s);
			}
		}
	}
}