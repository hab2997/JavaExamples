class EqualsTest {
    private int var1, var2;    
     
    public EqualsTest(int var1, int var2) {
        this.var1 = var1;
        this.var2 = var2;
    }
}
 
// Driver class to test the Complex class
public class Equals {
    public static void main(String[] args) {
        EqualsTest c1 = new EqualsTest(10, 15);
        EqualsTest c2 = new EqualsTest(10, 15);
		EqualsTest c3 = c1;
		
		System.out.println("c1 == c3 " + (c1==c3));
		System.out.println("c1.equals(c3) " + c1.equals(c3));
		
		System.out.println("c1 == c2 "+ (c1==c2));
		System.out.println("c1.equals(c2) " + c1.equals(c2));
    }
}