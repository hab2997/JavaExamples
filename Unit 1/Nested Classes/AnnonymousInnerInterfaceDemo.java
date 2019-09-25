interface Hello {
    void show();
}

class AnnonymousInnerInterfaceDemo{
 
    // An anonymous class that implements Hello interface
    Hello h = new Hello() {
        public void show() {
            System.out.println("I am in anonymous class");
        }
    };
 
	public void call(){
		
		h.show();
	}
    public static void main(String[] args) {
        AnnonymousInnerInterfaceDemo obj = new AnnonymousInnerInterfaceDemo();
		obj.call();
    }
}
