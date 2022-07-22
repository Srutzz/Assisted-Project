package calculator1;

public class arrays {
    public static void main(String[] args)
    {
    	int a[]= {1,2,3,4,5};
    	int[][] b= {{1,2,3},{4,5,6}};
    	System.out.println("Single dimentional array elements are ");
    	for(int i=0;i<5;i++)
    	{
    		System.out.println(a[i]+" ");
    	}
    	System.out.println("Multi dimentional array elements are ");
    	for(int i=0;i<=2;i++)
    	{
    		for(int j=0;j<=2;j++)
    		{
    			System.out.println(b[i][j]);
    		}
    	}
    }
}
