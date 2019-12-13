import java.util.Scanner;
public class Main
{
 
	String name,addr,cno,email,pt,pid;
	public static void main(String[] args)
	{
		Main obj=new Main();
		
		Scanner sc=new Scanner(System.in);
		// String name,addr,cno,email,pt,pid;
		System.out.println("REGISTRATION");
		System.out.println("Enter your name:");
	        obj.name=sc.nextLine();
		System.out.println("Enter your address:");
		obj.addr=sc.nextLine();
		System.out.println("Enter your contact number:");
		obj.cno=sc.nextLine();
		System.out.println("Enter your email:");
		obj.email=sc.nextLine();
		System.out.println("Enter your prooftype:");
		obj.pt=sc.nextLine();
		System.out.println("Enter your proofid:");
		obj.pid=sc.nextLine();
		
		System.out.println("\nyour details are as follows:");
	        System.out.println("\nName:"+obj.name);
		System.out.println("Address:"+obj.addr);
		System.out.println("Contact Number:"+obj.cno);
		System.out.println("Email:"+obj.email);
		System.out.println("Proof type:"+obj.pt);
		System.out.println("Proof id:"+obj.pid);
	}
}
