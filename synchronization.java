package assistedproject2;
import java.io.*;
import java.util.*;

class send{
	public void abc(String s)
    {
    	System.out.println("Sending\t"+s);
    	try
    	{
    		Thread.sleep(100);
    	}
    	catch(Exception e)
    	{
    		System.out.println("Thread interrupted");
    	}
    	System.out.println("\n"+s+"sent");
    }
}
class threadedsend extends Thread
{
	private String a;
	private Thread t;
	send ss;
	threadedsend(String m,send obj)
	{
		a=m;
		ss=obj;
	}
	public void run()
	{
		synchronized(ss)
		{
			ss.abc(a);
		}
	}
}
public class synchronization {
    public static void main(String[] args)
    {
    	send s=new send();
    	threadedsend s1=new threadedsend("Hi",s);
    	threadedsend s2=new threadedsend("Bye",s);
    	s1.start();
    	s2.start();
    	try
    	{
    		s1.join();
    		s2.join();
    	}
    	catch(Exception e)
    	{
    		System.out.println("Interrupted");
    	}
    }
}
