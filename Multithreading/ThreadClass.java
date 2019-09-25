class ThreadClass extends Thread
{  int rev=0,b;
    public void Run()
    {
       try
       { 
             for(i=100;i<=1000;i++)
             {	
			   int n =i;
               while(n>0)
               {
			     b = n % 10;
                 rev = rev * 10 + b;
                 n = n/10;				 
			   }
			   if(rev == i)
			   {
			   System.out.println(i + " ");
			   }
			   rev = 0;
			   Thread.sleep(5);
		     } 
		}
       	catch(Exception e)
        {
		  System.out.println("Exception Caught Successfully");
		}
	}	
}			   
public class PalindromeViaThreads
{
  public static void main(String...args)
  {
    PalindromeViaThreads obj = new PalindromeViaThreads();
	obj.start();
  }
} 