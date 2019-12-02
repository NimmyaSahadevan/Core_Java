import java.util.Scanner;

public class Registration {
	 String name,addr,cno,email,pt,pid;
	
	
	public  void Registration(String name,String addr,String cno,String email,String pt,String pid)
	{
		  
		
		this.name=name;
		
		this.addr=addr;
		this.cno=cno;
		this.email=email;
		this.pt=pt;
		this.pid=pid;
		
		
	}
	
 public static void main(String[] args) {
		// TODO Auto-generated method stub
		
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
		Registration c=new Registration();
		c.display(name,addr,cno,email,pt,pid);
		
}

	void display(String name,String addr,String cno,String email,String pt,String pid)
	{
		
		System.out.println("\nyour details are as follows:");
	    System.out.println("\nName:"+name);
		System.out.println("Address:"+addr);
		System.out.println("Contact Number:"+cno);
		System.out.println("Email:"+email);
		System.out.println("Proof type:"+pt);
		System.out.println("Proof id:"+pid);
		
		
		
		
		
	}
	
	
	
	
	
	
	
	
	

}
