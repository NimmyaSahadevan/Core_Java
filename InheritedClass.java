

 public class InheritedClass extends AbstractionClass {
  
	public void add(int a,int b)
	{
		System.out.println("Sum = "+(a+b));
	}
	public void sub(int a,int b)
	{
		
		super.sub(a,b);
	}
	
}
