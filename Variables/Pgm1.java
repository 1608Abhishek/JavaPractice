class Pgm1 
{
	int a=10;
	int b=20;
	public static void main(String[] args)
	{
		Pgm1 q=new Pgm1();
		add(q);
		multi(q);
	}
	static void add(Pgm1 x)
	{
		int c=x.a+x.b;
		System.out.println(c);
	}
	static void multi(Pgm1 y)
	{
		int d=y.a*y.b;
		System.out.println(d);
	}
}