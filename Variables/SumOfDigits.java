class SumOfDigits 
{
	public static void main(String[] args) 
	{
		int num = 137;
		int sum=0;
		while (num!=0)
		{
			int rem=num%10;
			sum=sum+rem;
			num=num/10;
		}
		System.out.println(sum);
	}
}
