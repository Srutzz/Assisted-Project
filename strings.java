package calculator1;

public class strings {
    public static void main(String[] args)
    {
    	String s1=new String("String");
    	String s2=new String(" methods");
    	System.out.println(s1.length());
    	System.out.println(s2.substring(2));
    	System.out.println(s1.compareTo(s2));
    	System.out.println(s1.isEmpty());
    	System.out.println(s1.toLowerCase());
    	String r=s2.replace('m','a');
    	System.out.println(r);
    	System.out.println(s1.equals(s2));
    	
    	StringBuffer s3=new StringBuffer("String buffer ");
		s3.append("code");
		System.out.println(s3);

		s3.insert(2, 'a');
		System.out.println(s3);

		StringBuffer s4=new StringBuffer("String Buffer 2");
		s4.replace(0, 5, "h");
		System.out.println(s4);

		s4.delete(0, 1);
		System.out.println(s4);

		System.out.println("StringBuilder");
		StringBuilder s5=new StringBuilder("abc");
		s5.append("def");
		System.out.println(s5);

		System.out.println(s5.delete(0, 1));

		System.out.println(s5.insert(1, "ghi"));

		System.out.println(s5.reverse());

		System.out.println("Converting StringBuffer to StringBuilder");
		
		String str = "jklmnop"; 

        StringBuffer s6 = new StringBuffer(str); 
        s6.reverse(); 
        System.out.println("String to StringBuffer");
        System.out.println(s6); 

        StringBuilder s7 = new StringBuilder(str); 
        s7.append("world"); 
        System.out.println("String to StringBuilder");
        System.out.println(s7);              		
	}

}
