
public class CharAtExample2 
{

	public static void main(String[] args) 
	{
		String name="NIMMYA T.S";
		char c=name.charAt(10);    //returns the char value at 4th index
		System.out.println(c);    // thows StringIndexOutOfBounds Exception
	}

}
