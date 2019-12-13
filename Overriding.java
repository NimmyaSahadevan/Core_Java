import java.util.Scanner;


 class poly
 {
	
	
	 public void Area(int a)
		{
			System.out.println("Area of Square:\n"+(a*a));
			
		}
		
		public void Area(int a,int b)
		{
			System.out.println("\nArea of Rectangle:\n"+(a*b));
			
		}
		public void Area(float b,float h)
		{
			System.out.println("\nArea of Triangle:\n"+(0.5*b*h));
			
		}
		
		public void Area(float r)
		{
			System.out.println("\nArea of Circle:\n"+(3.14*(r*r)));
			
		}
	 
	 
	 
	 
}

public class Overriding extends poly
{
	
	public void Area(int a)
	{
		System.out.println("\nArea of Square:\n"+(a*a));
	}
	
	public void Area(int a,int b)
	{
		System.out.println("\nArea of Rectangle:\n"+(a*b));
	}
	public void Area(float b,float h)
	{
		System.out.printf("\nArea of Triangle:\n%.2f\n",(0.5*b*h));
	}
	

	
	public static void main(String[] args)
	{	
		 poly o=new poly();
		 poly p=new Overriding();
		 o.Area(5);
		 o.Area(5,7);
		 o.Area(5f,6f);
		 o.Area(5f);
			
		 p.Area(10);
		 p.Area(3,9);
		 p.Area(9.1f,7f);
		 p.Area(5.5f);
			
	}

}
