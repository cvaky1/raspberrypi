import java.io.Console;
import java.io.IOException;
import java.lang.System;
public class nieco {

	/**
	 * @param args
	 * @throws IOException 
	 * @throws InterruptedException 
	 */
	public static void main(String[] args) throws IOException, InterruptedException {
		// TODO Auto-generated method stub

		String[] cmd = {"/bin/sh", "-c", "stty raw </dev/tty"};
	    Runtime.getRuntime().exec(cmd).waitFor();
	}

}
