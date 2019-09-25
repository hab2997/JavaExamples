class ToString {  
    private double re, im;
 
    public ToString(double re, double im) {
        this.re = re;
        this.im = im;
    }
     
    /* Returns the string representation of this ToString number.
       The format of string is "Re + iIm" where Re is real part
       and Im is imagenary part.*/
    @Override
    public String toString() {
        return String.format(re + " + i" + im);
    }
}
 
// Driver class to test the ToString class
public class ToStringmain {
    public static void main(String[] args) {
        ToString c1 = new ToString(10, 15);
        System.out.println(c1);
    }
}