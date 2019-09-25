class PlayWithEquals{
	
	public static void main(String...args){
		
		String s1, s2;
		s1 = "tanya";
		s2 = "tanya";
		
		String str1= new String("java");
		String str2= new String("java");
		
		System.out.println(s1==s2);
		System.out.println(str1==str2);
		System.out.println(str1.equals(str2));
		System.out.println(str2==str2);
	}
	
}