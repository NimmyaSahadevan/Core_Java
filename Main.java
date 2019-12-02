import java.util.Scanner;
public class Main {
 
	
	public static void main(String[] args) {
		
		
		Scanner sc=new Scanner(System.in);
		 String name,addr,cno,email,pt,pid;
		System.out.println("REGISTRATION");
		System.out.println("Enter your name:");
	    name=sc.nextLine();
		System.out.println("Enter your address:");
		addr=sc.nextLine();
		System.out.println("Enter your contact number:");
		cno=sc.nextLine();
		System.out.println("Enter your email:");
		email=sc.nextLine();
		System.out.println("Enter your prooftype:");
		pt=sc.nextLine();
		System.out.println("Enter your proofid:");
		pid=sc.nextLine();
		
		System.out.println("\nyour details are as follows:");
	    System.out.println("\nName:"+name);
		System.out.println("Address:"+addr);
		System.out.println("Contact Number:"+cno);
		System.out.println("Email:"+email);
		System.out.println("Proof type:"+pt);
		System.out.println("Proof id:"+pid);
	
	
		
		
	}

	
	
	

}
