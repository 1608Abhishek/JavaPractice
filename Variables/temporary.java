class temporary 
{ 
	int a=10;
	static void disp(temporary b)
	{
		System.out.println(b.a);
	}
	public static void main(String[] args) 
	{
		temporary T= new temporary();
		int i=10;
	    disp(T);
	}
}
