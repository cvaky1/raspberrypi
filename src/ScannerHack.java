import java.util.*;
import java.lang.reflect.*;
import java.nio.CharBuffer;

public class ScannerHack implements Runnable {

	public static void main(String[] args) {
		(new ScannerHack()).test();
	}

	public void test() {

		scanner = new Scanner(System.in);

		// reflection
		try {

			Field field = (scanner.getClass()).getDeclaredField("buf");
			field.setAccessible(true);
			Object obj = field.get(scanner);
			cb = (CharBuffer) obj;

		} catch (Exception e) {
			e.printStackTrace();
		}

		// thread
		Thread thread = new Thread(this);
		thread.start();

		while (true) {
			String input = scanner.nextLine();
		}
	}

	public void run() {

		try {
			while (true) {

				if (cb.length() > 0) {
					System.out.print("nacitalo: " + cb.toString());
				}

				Thread.sleep(500);

			}
		} catch (Exception e) {
			e.printStackTrace();
		}

	}

	Scanner scanner;
	CharBuffer cb;

}