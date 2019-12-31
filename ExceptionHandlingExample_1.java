
public class ExceptionHandlingExample_1 
{
	static void check() throws ArithmeticException         // used to list all the exceptions are to be handled during execution
		{
			System.out.println("Inside check function");
			throw new ArithmeticException("FACE Kollam");  // used to throw an exception explicitly
		}
		public static void main(String[] args) 
		{
			//try-catch block is used for exception handling
			
			try                  
			{
				check();
			}
			catch(ArithmeticException e)
			{
				System.out.println("caught "+e);
			}
	    }

}
