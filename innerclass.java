package calculator1;

public class innerclass {
    private String a="Inner class";
    class inner{
    	void abc()
    	{
    		System.out.println(a+" method");
    	}	
    }
    void display(){  
   	 class Inner{  
   		 void msg(){
   			 System.out.println(a);
   		 }  
     }  
     
     Inner l=new Inner();  
     l.msg();  
    }  
    abstract class AnonymousInnerClass {
 	   public abstract void display();
 	}

    public static void main(String[] args)
	{
		innerclass obj=new innerclass();
		innerclass.inner in=obj.new inner();
		in.abc();
		innerclass obj1=new innerclass();
		obj1.display();
		innerclass obj2=new innerclass() {
			public void disp() {
				System.out.println("Anonymous inner class");
			}
		};
		obj2.display();
	}
    
}
