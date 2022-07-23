package assistedproject2;

public class trycatch {
    public static void main(String[] args)
    {
    	int a=5;
    	int b=0;
    	try
    	{
    		System.out.println(a/b);
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Divide by zero error");
    	}
    	finally
    	{
    		System.out.println("Ans is zero");
    	}
    }
}
