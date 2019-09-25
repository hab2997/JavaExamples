import java.io.*;
import java.util.Date;

public class PrintWriterDemo {

   public static void main(String[] args) {
      Object obj1 = "Object";
      Object obj2 = 2;
      Date date = new Date(112, 2, 21);
      
      try {

         // create a new writer
         PrintWriter pw = new PrintWriter(System.out);

         // print object
         pw.println(obj1);

         // print another object
         pw.println(obj2);

         // print a date (it is an object)
         pw.print(date);

         // flush the writer
         pw.flush();

      } catch (Exception ex) {
         ex.printStackTrace();
      }
   }
}