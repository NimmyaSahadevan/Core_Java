


interface Example
{
	
	void method1();
	void method2();
	void method3();
}

class InterfaceExample implements Example {
	 
	 
	 public void method1()
	 {
		 
		 System.out.println("method 1");
	 }
	 public void method2()
	 {
		 
		 System.out.println("method 2");
	 }
	 public void method3()
	 {
		 
		 System.out.println("method 3");
	 }

	public static void main(String[] args) {
		Example e=new InterfaceExample();
		e.method1();
		e.method2();
		e.method3();
		

	}

}
