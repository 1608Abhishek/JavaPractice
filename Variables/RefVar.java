class RefVar 
{
	void Temp()
	{
		int a=5;
		int b=10;
	}
	public static void main(String[] args) 
	{
		RefVar R = new RefVar();
		Add(R);
		Multi(R);
	}
	static void Add(RefVar x)
	{
		int c=x.a+x.b;
		System.outprintln(c);
	}
	static void Multi(RefVar y)
	{
		int d=y.a*y.b;
		System.out.println(d);
	}
	
}

