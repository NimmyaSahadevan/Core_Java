import java.io.Console;
public class ConsoleClassExample_1 
{
	public static void main(String[] args)
	{
		Console console=System.console(); // creating console object
		if(console==null)
		{
			System.out.println("No console available");
			return;
		}
		String string1=console.readLine("Enter your name");
		System.out.print(string1);
		System.out.println("Enter the password");
		char[] ch=console.readPassword();       // password is stored in character array
		String password=String.copyValueOf(ch);
		System.out.println("Password is: "+password);
	}
}
