


//ANONYMOUS CLASS



abstract class Employee
{
	
	abstract void fun();
}

public class AnonymousClass 
{

	public static void main(String[] args)
	{
		Employee e=new Employee()
		{
	        	 public void fun()
	        	 {
				System.out.println("Hiiiiii");
	  		 }

		};
	
       e.fun();
	}
}
