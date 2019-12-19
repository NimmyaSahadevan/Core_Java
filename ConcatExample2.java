
public class ConcatExample2
{
	public static void main(String[] args) 
	{
		String s1="Hello";
		String s2="Face@2.0";
		String s3="Reader";
		String s4=s1.concat(s2);  //concatenating one string
		System.out.println(s4);
		String s5=s1.concat(s2).concat(s3);  //concatenating multiple string
		System.out.println(s5);
	}

}
