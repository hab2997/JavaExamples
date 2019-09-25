import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class BufferedOutputStreamExample {

	    public static void main(String[] args) {

	        try {

	            BufferedOutputStream stream = new BufferedOutputStream
									(new FileOutputStream("E:\\2019\\Java\\Practical\\Unit 2\\File IO\\newfile.txt"));

	            stream.write("Hello, World!".getBytes());

				stream.write(System.lineSeparator().getBytes());

	            stream.write("I am writting into a file using BufferedOutputStream".getBytes());

	            stream.write(System.lineSeparator().getBytes());

	            stream.close();

	        } catch (IOException ex) {

	            ex.printStackTrace();

	        }

	    }

	 

	}