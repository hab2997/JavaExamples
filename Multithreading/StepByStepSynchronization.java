//1. No Synchronization
class First
{
/* synchronized */public void display(String msg)
 {
  System.out.print ("["+msg);
  try
  {
   Thread.sleep(1000);
  }
  catch(InterruptedException e)
  {
   e.printStackTrace();
  }
  System.out.println ("]");
 }
}

class Second extends Thread
{
 First fobj;
 String msg;
 
 Second (First fp,String str)
 {
  fobj = fp;
  msg = str;
  start();
 }
 public void run()
 {
  fobj.display(msg);
 }
 
 /*2. public void run()
 {
  synchronized(fobj)       //Synchronized block
  {
   fobj.display(msg);
  }
 }*/
}

public class StepByStepSynchronization
{
 public static void main (String[] args)
 {
  First fnew = new First();
  Second ss = new Second(fnew, "welcome");
  Second ss1= new Second (fnew,"to");
  Second ss2 = new Second(fnew, "multithreading");
 }
}