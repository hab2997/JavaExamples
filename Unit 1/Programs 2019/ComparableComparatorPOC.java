import java.util.*;  
import java.io.*;  

class Fruit implements Comparable<Fruit>{
	
	private String fruitName;
	private String fruitDesc;
	private int quantity;
	
	public Fruit(String fruitName, String fruitDesc, int quantity) {
		super();
		this.fruitName = fruitName;
		this.fruitDesc = fruitDesc;
		this.quantity = quantity;
	}
	
	public String getFruitName() {
		return fruitName;
	}
	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}
	public String getFruitDesc() {
		return fruitDesc;
	}
	public void setFruitDesc(String fruitDesc) {
		this.fruitDesc = fruitDesc;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	public int compareTo(Fruit compareFruit) {
	
		int compareQuantity = ((Fruit) compareFruit).getQuantity(); 
		
		//ascending order
		return this.quantity - compareQuantity;
		
		//descending order
		//return compareQuantity - this.quantity;
		
	}	
	
	public static Comparator<Fruit> FruitNameComparator 
                          = new Comparator<Fruit>() {

	    public int compare(Fruit fruit1, Fruit fruit2) {
	    	
	      String fruitName1 = fruit1.getFruitName().toUpperCase();
	      String fruitName2 = fruit2.getFruitName().toUpperCase();
	      
	      //ascending order
	      return fruitName1.compareTo(fruitName2);
	      
	      //descending order
	      //return fruitName2.compareTo(fruitName1);
	    }
`
	};
	
}

class QuantityComparator implements Comparator<Fruit>{  
	public int compare(Fruit f1,Fruit f2){  
		if(f1.getQuantity()==f2.getQuantity())  
			return 0;  
		else if(f1.getQuantity()>f2.getQuantity())  
			return 1;  
		else  
			return -1;  
	}  
}
class ComparableComparatorPOC{
	
	public void simpleSort(){
			
		String[] fruits = new String[] {"Pineapple","Apple", "Orange", "Banana"}; 
		
		Arrays.sort(fruits);
			
		int i=0;
		for(String temp: fruits){
			System.out.println("fruits " + ++i + " : " + temp);
		}			
	}
	
	public static void main(String...args){
		
		//1. Simple Sorting
		//ComparableComparatorPOC obj = new ComparableComparatorPOC();
		//obj.simpleSort();
		
		Fruit[] fruits = new Fruit[4];
		
		Fruit pineappale = new Fruit("Pineapple", "Pineapple description",70); 
		Fruit apple = new Fruit("Pineapple", "Pineapple description",70); 
		Fruit orange = new Fruit("Orange", "Orange description",80); 
		Fruit banana = new Fruit("Banana", "Banana description",90); 
		
		fruits[0]=pineappale;
		fruits[1]=apple;
		fruits[2]=orange;
		fruits[3]=banana;
		
		//2. Comparable Example
		Arrays.sort(fruits);

		 ArrayList<Fruit> fs = new ArrayList<Fruit>(); 
		 fs.add(new Fruit("Pineapple", "Pineapple description",70));
		 fs.add(new Fruit("Orange", "Orange description",80)); 
		 fs.add(new Fruit("Banana", "Banana description",90));
		
		//3. Seperate Comparator Class
		Collections.sort(fs,new QuantityComparator());  
		
		//4. Comparator Static Nested Class
		//Arrays.sort(fruits, Fruit.FruitNameComparator);
		
		int i=0;
		for(Fruit temp: fruits){
		   System.out.println("fruits " + ++i + " : " + temp.getFruitName() + 
			", Quantity : " + temp.getQuantity());
		}
		
	}
	
}