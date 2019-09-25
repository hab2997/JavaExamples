class EqualsTest {
 
    private int var1, var2;
 
    public EqualsTest(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
 
    // Overriding equals() to compare two EqualsTest objects
    @Override
    public boolean equals(Object o) {
 
        // If the object is compare with itself then var1turn true  
        if (o == this) {
            return true;
        }
 
        /* Check if o is an instance of EqualsTest or not
          "null instanceof [type]" also var1turns false */
        if (!(o instanceof EqualsTest)) {
            return false;
        }
         
        // typecast o to EqualsTest so that we can compare data members 
        EqualsTest c = (EqualsTest) o;
         
        // Compare the data members and return accordingly 
        return Integer.compare(var1, c.var1) == 0
                && Integer.compare(var2, c.var2) == 0;
    }
}
 
// Driver class to test the EqualsTest class
public class Equals2 {
 
    public static void main(String[] args) {
        EqualsTest c1 = new EqualsTest(10, 15);
        EqualsTest c2 = new EqualsTest(10, 15);
        if (c1.equals(c2)) {
            System.out.println("Equal ");
        } else {
            System.out.println("Not Equal ");
        }
    }
}