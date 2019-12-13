
public class Overloading
{
	
	
	public void Area(int a)
	{
		System.out.println("Area of Square:\n"+(a*a));
	}
	
	public void Area(int a,int b)
	{
		System.out.println("Area of Rectangle:\n"+(a*b));
	}
	public void Area(float b,float h)
	{
		System.out.println("Area of Triangle:\n"+(0.5*b*h));
	}
	
	public void Area(float r)
	{
		System.out.println("Area of Circle:\n"+(3.14*(r*r)));
	}
	
	
	
	
	public static void main(String[] args) 
	{
		
 		Overloading o=new Overloading();
		o.Area(5);
		o.Area(5,7);
		o.Area(5f,6f);
		o.Area(5f);

	}
}
