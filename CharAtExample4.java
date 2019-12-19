
public class CharAtExample4 
{

	public static void main(String[] args) 
	{
		String s="Welcome to FACE portal";
		int count=0;
		for(int i=0;i<s.length()-1;i++)   //traverse from index 0 to stringlength-1
		{
			if(s.charAt(i)=='t')         // checks string characters matches 't'
			{
			count++;
			}
		}
	System.out.println("Frequency of t is: "+count);
	}
}
