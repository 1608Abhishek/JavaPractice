class Palindrome
{
	public static void main (String args[])
	{
		int num = 121;
		int rev=0;
		while(num!=0)
		{
			rev=num%10;
			num=(rev*10)+rev;
			num=num/10;
		}
		if(num==rev)
		{
			System.out.println(num+"is palindrome");
		}
			else
		{
			System.out.println(num+"is not palindrome");
		}
	}
}
	

