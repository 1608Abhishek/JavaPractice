class NewClass 
{
		static void disp(String A)
	{
		System.out.println(A);
	}
		static void disp(int B)
	{
		System.out.println(B);
	}
		static void disp(int c, String A)
	{
		System.out.println(c+" "+A);
	}	
	public static void main(String[] args) 
	{
		disp("my name is Abhishek");
		disp(03);
		disp(23,"is my age");
	}
}
