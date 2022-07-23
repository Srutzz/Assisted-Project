package assistedproject2;

public class finally1 {
	public static void main(String[] args)
    {
        int a=10,b=0,c=0;
        try
        {
            c = a / b;
        }
        catch(ArithmeticException e)
        {
            System.out.print("Error : " + e.getMessage());
        }
        finally
        {
            System.out.print("Ans is"+c);
        }
    }

}
