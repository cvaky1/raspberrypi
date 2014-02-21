import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;


public class readFile {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BufferedReader br = null;
		 
		try {
 
			Byte sCurrentLine;
 
			br = new BufferedReader(new FileReader("C:\\nieco2"));
 
			
		while (br.ready()){
//			System.out.print(br.read());
			System.out.print(String.format("%x", br.read()));
			
		}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
 
		
	}

}
