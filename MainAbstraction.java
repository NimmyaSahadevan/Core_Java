import java.util.Scanner;
public class MainAbstraction {
	int a,b;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b= sc.nextInt();
		AbstractionClass i=new InheritedClass();
		i.add(a,b);
		i.sub(a,b);
		
	}

}
