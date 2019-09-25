class OneDeeArray{
	
	public static void main(String...args){
		int myArray[];
		myArray = new int[10];
		
		System.out.println("Initializing array...");

		for(int i=0; i<10; i++){
			myArray[i]=i;
		}

		System.out.println("Printing array now....");
		for(int i: myArray){
			System.out.println(i);
		}
	}
}