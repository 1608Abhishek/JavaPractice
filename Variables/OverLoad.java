class OverLoad 
{
	static void send(int a)
	{
		System.out.println(a);
	}
	static void send(String n)
	{
		System.out.println(n);
	}
	static void send(String b,int c)
	{
		System.out.println(b+c);
	}
	static void send(int d,String f)
	{
		System.out.println(d+f);
	}
	public static void main(String[] args) 
	{
		send(03);
		send("Abhishek");
		send("Abhishek",03);
		send(03,"Abhishek");
	}
}
