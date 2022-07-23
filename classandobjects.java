package assistedproject2;

public class classandobjects {
    int no;
    String name;
    int mark;
    classandobjects(int no,String name, int mark)
    {
    	this.no=no;
    	this.name=name;
    	this.mark=mark;
    }
    public int getno()
    {
    	return no;
    }
    public String getname()
    {
    	return name;
    }
    public int getmark()
    {
    	return mark;
    }
    public String disp()
    {
    	return("Roll no: "+this.getno()+"\nName: "+this.getname()+"\nMark: "+this.getmark());
    }
    public static void main(String[] args)
    {
    	classandobjects jm=new classandobjects(12,"Jimin",98);
    	System.out.println(jm.disp());
    }
}
