class Palindrome
{
	public static void main(String args[])
	{
		int limit=200;
		int rev=0;
		for(int i=100;i<=limit;i++)
		{
			n=i;
			while(n>0)
			b = n % 10;
			rev = rev * 10 + b;
			n = n / 10;
			if(rev==1)
			{
				System.out.println(i+ " ");
			}
			rev=0;
		}
	}
}