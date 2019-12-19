
public class CharAtExample3 
{

	public static void main(String[] args) 
	{
		String str="Welcome to FACE portal";
		int l=str.length();
		
		//Fetching first character
		System.out.println("Character at 1st index is: "+str.charAt(0));
		
		//Fetching last character which is present at (stringlength-1)th index
		System.out.println("Character at last index is: "+str.charAt(l-1));
		}

}
