import java.io.*;

public class RandomAccessFileDemo {

   public static void main(String[] args) {
   
      try {
      
         // create a new RandomAccessFile with filename test
         RandomAccessFile raf = new RandomAccessFile("E:\\Semester 3_2018\\Java\\Practical\\Unit 2\\File IO\\test.txt", "rw");

         // write something in the file
         raf.writeUTF("Hello World");

         // set the file pointer at 0 position
         raf.seek(0);

         // print the line
         System.out.println("" + raf.readLine());

         // set the file pointer at 0 position
         raf.seek(0);

         // write something in the file
         raf.writeUTF("This is an example \n Hello World");

         raf.seek(0);
         // print the line
         System.out.println("" + raf.readLine());
         
      } catch (IOException ex) {
         ex.printStackTrace();
      }
   }
}