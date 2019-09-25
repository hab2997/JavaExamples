// Java program implementing Singleton class
// with getInstance() method
class Singleton
{
    // static variable single_instance of type Singleton
    private static Singleton single_instance = null;
 
    // variable of type String
    public String s;
 
    // private constructor restricted to this class itself
    private Singleton()
    {
        s = "Hello I am a string part of Singleton class";
    }
	
	
	//static block initialization for exception handling
    /*static{
        try{
            single_instance = new Singleton();
        }catch(Exception e){
            throw new RuntimeException("Exception occured in creating singleton instance");
        }
    }*/
 
    // static method to create instance of Singleton class
    public static Singleton getInstance()
    {
        if (single_instance == null)
            single_instance = new Singleton();			//Lazy Loading
 
        return single_instance;
    }
	
	//Thread Safe Singleton
	/*public static synchronized Singleton getInstance(){		//Performance overhead. Needed for only first few 
        if (single_instance == null)							//threads creating seperate instance.
            single_instance = new Singleton();
        
		return single_instance;
    }*/
	
	
	//Double entrant locking check
	
	/*public static Singleton getInstance(){
    if(single_instance == null){
        synchronized (Singleton.class) {
            if(single_instance == null){
                single_instance = new Singleton();
            }
        }
    }
    return instance;
	}*/
	
}
 
// Driver Class
class SingletonMain
{
    public static void main(String args[])
    {
        // instantiating Singleton class with variable x
        Singleton x = Singleton.getInstance();
 
        // instantiating Singleton class with variable y
        Singleton y = Singleton.getInstance();
 
        // instantiating Singleton class with variable z
        Singleton z = Singleton.getInstance();
 
        // changing variable of instance x
        x.s = (x.s).toUpperCase();
 
        System.out.println("String from x is " + x.s);
        System.out.println("String from y is " + y.s);
        System.out.println("String from z is " + z.s);
        System.out.println("\n");
 
    }
}