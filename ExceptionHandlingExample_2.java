class Test extends Exception{}
public class ExceptionHandlingExample_2 
{
	public static void main(String[] args) 
	{
		try
		{
			throw new Test();   //throw an exception explicitly
		}
		catch(Test t)
		{
			System.out.println("Got the Test Exception");
		}
		
		//finally block always get executed whether an exception occurs or not
		finally    
		{
			System.out.println("Inside finally block");
		}
	}

}
