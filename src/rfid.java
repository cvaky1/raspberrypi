import java.io.IOException;
import java.io.InputStreamReader;


public class rfid {
	public static void main(String[] args) throws IOException {
		InputStreamReader reader = new InputStreamReader(System.in);
		
		boolean exit = false;
		while (!exit) {
			if (reader.ready()) {
				// read a character and process it
				
			}

			// edit, lets not hog any cpu time
			try {
				Thread.sleep(50);
			} catch (InterruptedException ex) {
				// can't do much about it can we? Ignoring
			}
		}
	}
}