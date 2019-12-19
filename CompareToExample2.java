
public class CompareToExample2 
{

	public static void main(String[] args) 
	{
		String s1="hello";
		String s2="";
		String s3="me";
		System.out.println(s1.compareTo(s2));  // 5 because comparing with null string returns the length of 1st string
		System.out.println(s2.compareTo(s3));  // -2 because 2nd string is greater than 1st
	}

}
