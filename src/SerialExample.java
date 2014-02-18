import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

class SerialExample {
	public static void main(String[] args) throws IOException {
		BufferedReader in = new BufferedReader(new FileReader("/dev/hidraw0"));
		for (int i = 0; i < 10; i++) {
		    System.out.print(in.read() + " vypis ");
		}
		System.out.println();
		in.close();
	}
}