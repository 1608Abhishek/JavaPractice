class whatsapp_v1
{
	void chat()
	{
		System.out.println("hi");
	}
}
class whatsapp_v2
{
	void chat()
	{
		System.out.println("hi+HELLO");
	}	
}
class Overridding
{
	public static void main(String[] args) 
	{
		whatsapp_v2 V=new whatsapp_v2();
		V.chat();
	}
}
