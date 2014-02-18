import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.StringTokenizer;

public class readDevice {

  public static void main(String[] a) throws Exception {
    System.out.println("here");
    readTapeToFile(new File("out1"));
  }

  static void readTapeToFile(
      File dstFile) throws FileNotFoundException,
      IOException {
    long start = System.currentTimeMillis();
    File srcFile = new File("/dev/hidraw0");
    InputStream inTape = new FileInputStream(srcFile);
    OutputStream outFile = new FileOutputStream(dstFile);
    try {
      byte[] buf = new byte[1024 * 64];
      int size;
      while ((size = inTape.read(buf)) >= 0) {
        outFile.write(buf, 0, size);
      }
    }
    finally {
      outFile.close();
      inTape.close();
    }
  }
}