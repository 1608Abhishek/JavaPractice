class Try
{
	static int Fibonacci(int fib1,int fib2)
    {
		for (int i=1;i<=10 ;i++ )
		{
			int fib3 = fib1+fib2;
			fib1=fib2;
			fib3=fib2;
		}
		return fib3;
	}
	public static void main(String[] args) 
	{
	 int c= Fibonacci(0,1);
	 System.out.println(c);
	}
}
