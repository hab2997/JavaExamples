import java.io.*;
public class LineReading {

   public static void main(String args[])throws IOException {

       BufferedReader br = null;
       BufferedReader br2 = null;
       try{	
           br = new BufferedReader(new FileReader("E:\\Semester 3_2018\\Java\\Practical\\Unit 2\\File IO\\newfile.txt"));		

           //One way of reading the file
		   System.out.println("Reading the file using readLine() method:");
		   String contentLine = br.readLine();
		   while (contentLine != null) {
			  System.out.println(contentLine);
			  contentLine = br.readLine();
		   }

		   br2 = new BufferedReader(new FileReader("E:\\Semester 3_2018\\Java\\Practical\\Unit 2\\File IO\\newfile.txt"));

		   //Second way of reading the file
		   System.out.println("Reading the file using read() method:");
		   int num=0;
		   char ch;
		   while((num=br2.read()) != -1)
		   {	
				   ch=(char)num;
			   System.out.print(ch);
		   }

		   } 
		   catch (IOException ioe) 
		   {
		   ioe.printStackTrace();
		   } 
		   finally 
		   {
		     if (br != null)
			 br.close();
			  if (br2 != null)
			 br2.close();
		  	}
   }
}