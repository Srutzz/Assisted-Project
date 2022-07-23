package assistedproject2;

public class inheritance {
    public static void main(String[] args)
    {
    	bike b=new bike(1,"ktm","ducati");
    	System.out.println(b.disp());
    }
}
class vehicle
{
	int no;
	String name;
	public vehicle(int no,String name)
	{
		this.no=no;
		this.name=name;
	}
	public String disp()
	{
		return("Vehicle no: "+this.no+"\nVehicle name: "+this.name);
	}
	public int getno()
	{
		return no;
	}
	public String getname()
	{
		return name;
	}
}
class bike extends vehicle
{
	public String name;
	public bike(int n,String s,String name)
	{
		super(n,s);
	}
	public void setname(String n)
	{
		name=n;
	}
	public String disp()
	{
		return(super.disp()+"\nName: "+name);
	}
}