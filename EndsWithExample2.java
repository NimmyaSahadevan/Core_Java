
public class EndsWithExample2 
{

	public static void main(String[] args)
	{
		String s="Welcome to FACE.in";
		System.out.println(s.endsWith("in")); //returns true
		if(s.endsWith(".com"))                //checks for string endswith .com
		{
			System.out.println("String ends with .com");
		}
		else
			System.out.println("It does not ends with .com");
	}

}
