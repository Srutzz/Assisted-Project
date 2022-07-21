package calculator1;

public class typecasting {
    public static void main(String[] args)
    {
    	System.out.println("Implicit typecasting");
    	char a=7;
    	System.out.println("Char value "+a);
    	int b=a;
    	System.out.println("Int value "+b);
    	float c=b;
    	System.out.println("Float value "+c);
    	double d=c;
    	System.out.println("Double value "+d);
    	
    	System.out.println("Explicit typecasting");
    	double e=1.2;
        System.out.println("Double value "+e);
        float f=(float)e;
        System.out.println("Double value "+f);
        int g=(int)f;
        System.out.println("Double value "+g);
        char h=(char)g;
        System.out.println("Char value "+h);
    }
}
