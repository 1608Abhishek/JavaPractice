class Palindrome
{
	public static void main (String args[])
	{
		int num = 121;
		int rev=0;
		while(num!=0)
		{
			rev=num%10;
			int sum=(sum*10)+rev;
			num=num/10;
		}
		if(num==sum)
		{
			System.out.Println(num+"is palindrome")
		}
			else
		{
			System.out.Println(num+"is not palindrome")
		}
	}
}
	

