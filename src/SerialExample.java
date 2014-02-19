/**
 * Parallax RFID Reader Basics
 * Stephen J. Mason
 * http://stephenjam.es/wp/raspberry-pi-rfid-reader-with-java-and-pi4j-part-1/ 
 * dev@stephenjam.es
 */

import com.pi4j.io.serial.Serial;
import com.pi4j.io.serial.SerialDataEvent;
import com.pi4j.io.serial.SerialDataListener;
import com.pi4j.io.serial.SerialFactory;

class RFIDReaderBasic
{
    // - Get an instance of Serial for COM interaction
    private final Serial serial = SerialFactory.createInstance();

    public RFIDReaderBasic()
    {
        // - Change this to the COM port of your RFID reader
        String comPort = "/dev/hidraw0";

        // - Create and add a SerialDataListener
        serial.addListener(new SerialDataListener()
        {
            @Override
            public void dataReceived(SerialDataEvent event)
            {
                // - Get byte array from SerialDataEvent
                byte[] data = event.getData().getBytes();
                
                // - Iterate byte array print a readable representation of each byte
                for ( int i=0; i < data.length; i++ )
                {
                    System.out.printf( "0x%02x ", data[i] );
                }

                // - Line break to represent end of data for this event
                System.out.println();
            }
        });


        // - Attempt to open the COM port
        serial.open( comPort, 2400 );

     

        // - When you are done, ensure you close the port
        // To demonstrate, I am waiting 20 seconds and then closing the port.
        try
        {
            // - Sleep for 20 seconds, (in ms)
            Thread.sleep(20000);

            // - Close port
            serial.close();
            System.out.println("COM port closed.");
        }
        catch ( Exception ex )
        {
            // - I am intentionally ignoring any exception.
        }
        
        // - And terminate
        System.exit(0);
    }

    public static void main( String[] args )
    {
        new RFIDReaderBasic();
    }
}