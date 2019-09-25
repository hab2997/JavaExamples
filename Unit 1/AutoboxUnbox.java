// Java program to illustrate the concept
// of Autoboxing and Unboxing
import java.io.*;
 
class AutoboxUnbox
{
    public static void main (String[] args)
    {
        // creating an Integer Object
        // with value 10.
        Integer i = new Integer(10);
		Integer i2=15;
        // unboxing the Object
		System.out.println("Value through Integer through valueOf: "+ Integer.valueOf(i));
		System.out.println("Value through Integer through intValue: "+ i.intValue());
		
		//Direct reference
		int i1 = i;
        System.out.println("Value of i1: " + i1);
 
        //Autoboxing of char
        Character gfg = 'a';
 
        // Auto-unboxing of Character
        char ch = gfg;
        System.out.println("Value of ch: " + ch);
        System.out.println("Value of gfg: " + gfg);
 
    }
}
