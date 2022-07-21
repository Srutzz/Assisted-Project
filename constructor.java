package calculator1;

public class constructor {
    public static void main(String[] args)
    {
    	student1 s1=new student1(65,"abc");
    	student2 s2=new student2();
    	s1.disp();
    	s2.disp();
    }
}
class student1
{
	int regno;
	String name;
	student1(int i,String s)
	{
		regno=i;
		name=s;
	}
	void disp() {
		System.out.println("Register number: "+regno+" Name: "+name);
	}
}
class student2
{
	int regno;
	String name;
	void disp() {
		System.out.println("Register number: "+regno+" Name: "+name);
	}
}

