
public class ContainsExample1 
{

	public static void main(String[] args)
	{
		String name="what do you know about me";
		System.out.println(name.contains("do you know")); //returns true because string contains the substring
		System.out.println(name.contains("about"));       //returns true 
		System.out.println(name.contains("hello"));       //returns false 
	}

}
