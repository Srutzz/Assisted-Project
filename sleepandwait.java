package assistedproject2;

public class sleepandwait {
    private static Object n=new Object();
    public static void main(String[] args) throws InterruptedException
    {
    	Thread.sleep(100);
    	System.out.println("Thread"+Thread.currentThread().getName()+"is woken after 1 sec");
    	synchronized(n)
    	{
    		n.wait(100);
    		System.out.println("Ojbect"+n+"is woken after waiting for 1 sec");
    	}
    }
}
