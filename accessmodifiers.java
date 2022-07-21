package calculator1;

public class accessmodifiers {
    public static void main(String[] args)
    {
    	System.out.println("Default access specifier");
    	defaultaccessspecifier obj=new defaultaccessspecifier();
    	obj.display();
    	privateaccessspecifier obj1=new privateaccessspecifier();
    	//obj1.display();
    	protectedaccessspecifier obj2=new protectedaccessspecifier();
    	obj2.display();
    	publicaccessspecifier obj3=new publicaccessspecifier();
    	obj3.display();
    	
    }
}
class defaultaccessspecifier
{
	void display()
	{
		System.out.println("Using a default access specifier");
	}
}
class privateaccessspecifier
{
	private void display()
	{
		System.out.println("Using a private access specifier");
	}
}
class protectedaccessspecifier
{
	protected void display()
	{
		System.out.println("Using a protected access specifier");
	}
}
class publicaccessspecifier
{
	public void display()
	{
		System.out.println("Using a public access specifier ");
	}
}
	

