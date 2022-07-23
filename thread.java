package assistedproject2;

public class thread extends Thread {
    public void run()
    {
    	System.out.println("current thread started running");
    }
    public static void main(String[] args)
    {
    	thread t=new thread();
    	t.start();
    }
}
