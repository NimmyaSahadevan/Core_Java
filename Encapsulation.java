import java.util.Scanner;
public class Encapsulation
{

	public static void main(String[] args) 
	{
		
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

		Getset g=new Getset();
		g.setname(name,addr,cno,email,pt,pid);
		
		System.out.println("\nyour details are as follows:");
		System.out.println("\nName:"+g.getname());
		System.out.println("Address:"+g.getaddr());
		System.out.println("Contact Number:"+g.getcno());
		System.out.println("Email:"+g.getemail());
		System.out.println("Proof Type:"+g.getpt());
		System.out.println("Proof ID:"+g.getpid());
		
	}
}

 class Getset
 {
	 
	 String name,addr,cno,email,pt,pid;
	
	 public void setname( String name,String addr,String cno,String email,String pt,String pid)
	 {
		 
		this.name=name; 
		this.addr=addr;  
		this.cno=cno; 
		this.email=email;
		this.pt=pt;
		this.pid=pid;
	 }
	
	 
	public String getname()
	{
		return name;
	}
	public String getaddr()
	{
		return addr;
	}
	 
	public String getcno()
	{
		return cno;
	}
	 
	public String getemail()
	{
		return email;
	}
	public String getpt()
	{
		return pt;
	}
	  
	public String getpid()
	{
		return pid;
	}
 }
