class ToStringTest {
    private int re, im;         
 
    public ToStringTest(int re, int im) {
        this.re = re;
        this.im = im;
    }
}
  
// Driver class to test the ToStringTest class
public class ToStringDemo {
    public static void main(String[] args) {
        ToStringTest c1 = new ToStringTest(10, 15);
        System.out.println(c1);
    }
}