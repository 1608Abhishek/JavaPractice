class Apple 
{
	String Emp_name;
	int Emp_sal;
	Apple(String Emp_name,int Emp_sal)
	{
		this.Emp_name=Emp_name;
		this.Emp_sal=Emp_sal;
	}
}
	class RedApple
	{
	public static void main(String[] args) 
	{
		Apple A=new Apple("abhishek",11000);
		System.out.println(A.Emp_name);
		System.out.println(A.Emp_sal);
	}
}
