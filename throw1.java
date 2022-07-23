package assistedproject2;

public class throw1 {
    public static void main(String[] args)
    {
    	int a=10,b=0;
    	try
    	{
    		if(b==0)
    			throw(new ArithmeticException("Divide by zero exception"));
    		else
    		{
    			int z=a/b;
    			System.out.println("value is"+z);
    		}
    	}
    	catch(ArithmeticException e)
    	{
    		System.out.println("Error"+e.getMessage());
    	}
    	
    }
}
