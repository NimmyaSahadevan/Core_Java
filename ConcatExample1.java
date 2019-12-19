
public class ConcatExample1
{

	public static void main(String[] args)
	{
		String s1="java string";
		s1.concat("is immutable");   //concatenate new value to end of s1,but changes not stored into s1
		System.out.println(s1);     //prints the value of initial s1,because no change is stored in s1
		s1=s1.concat(" is immutable so assign explicitly"); 
		// gets concatenated because change is stored in s1
		System.out.println(s1);

	}

}
