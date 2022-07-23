package assistedproject2;

public class throws1 {
	 void div() throws ArithmeticException
     {
         int a=10,b=0,c;
         c = a / b;
         System.out.print("Ans is"+c);
     }
      public static void main(String[] args)
     {
          throws1 t = new throws1();
          try
         {
             t.div();
         }
         catch(ArithmeticException e)
         {
             System.out.print("Error : " + e.getMessage());
         }
     }

}
