import java.util.concurrent.atomic.AtomicInteger;
public class AtomicIntegerDemo {
    private final AtomicInteger counter = new AtomicInteger(0);
     
    public int getValue() {
        return counter.get();
    }
    public void increment() {
		int i=0;
        while(true) {
            int existingValue = getValue();
            int newValue = existingValue + 1;
            if(counter.compareAndSet(existingValue, newValue)) {
                return;
            }
        }
    }
	
	public static void main(String...args){
		
		AtomicIntegerDemo obj = new AtomicIntegerDemo();
		
		System.out.println("Value of counter = "+ obj.getValue());
		obj.increment();
		System.out.println("Value of counter after increment = "+ obj.getValue());

	}
}