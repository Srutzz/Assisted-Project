package assistedproject2;
interface one
{
	default void s()
	{
		System.out.println("Default first");
	}
}
interface two
{
	default void s()
	{
		System.out.println("Default second");
	}
}
public class diamondprob implements one,two{
    public void s()
    {
    	one.super.s();
    	two.super.s();
    }
    public static void main(String[] args)
    {
    	diamondprob obj=new diamondprob();
    	obj.s();
    }
}
