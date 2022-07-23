package assistedproject2;

public class runnablethread implements Runnable{
    public static int count=0;
    public runnablethread() {
    	
    }
    public void run() {
    	while(runnablethread.count<=20) {
    		try {
    			System.out.println("Thread: "+(++runnablethread.count));
    			Thread.sleep(50);
    		}catch(InterruptedException iex) {
    			System.out.println("Exception: "+iex.getMessage());
    		}
    	}
    }
    public static void main(String[] args)
    {
    	System.out.println("Starting main thread....");
    	runnablethread h=new runnablethread();
    	Thread t=new Thread(h);
    	t.start();
    	while(runnablethread.count<=20) {
    		try {
    			System.out.println("Main thread: "+(++runnablethread.count));
    			Thread.sleep(100);
    		}catch(InterruptedException iex) {
    			System.out.println("Exception in main thread: "+iex.getMessage());
    		}
    	}
    	System.out.println("End of main thread...");
    }
}
