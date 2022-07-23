package assistedproject2;

public class exceptionhandling {
	 public static void main(String args[]){
			try{
				System.out.println("Try block starting");
				throw new exception("Error Message");
			}
			catch(exception exp){
				System.out.println("Catch Block") ;
				System.out.println(exp) ;
			}
		   }
}
class exception extends Exception{
	   String s1;
	   exception(String s2) {
		s1=s2;
	   }
	   public String toString(){ 
		return ("Exception Occurred: "+s1) ;
	   }
	}

