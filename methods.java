package calculator1;

public class methods {
	int n=10;
	public static void main(String[] args)
    {
    	
    	methods obj1=new methods();
    	int ans=obj1.num(1, 2);
    	System.out.println("Addition is "+ans);
    	methods obj2=new methods();
    	System.out.println("Before call by value, the value is "+obj2.n);
    	obj2.num1(100);
    	System.out.println("Before call by value, the value is "+obj2.n);
    	methods obj3=new methods();
    	obj3.num2(10,20);
    	obj3.num2(10);
    }
    public int num(int a,int b)
    {
    	int c=a+b;
    	return c;
    }
    int num1(int n)
    {
    	n=n*10/100;
    	return(n);
    }
    void num2(int x,int y)
    {
    	System.out.println("Sum: "+(x+y));
    }
    void num2(int z)
    {
    	System.out.println("Square: "+(z*z));
    }
}
