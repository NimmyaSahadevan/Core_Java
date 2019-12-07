

//INNER CLASS


public class OuterClass {
	
	private int a=101;
	
	 class InnerClass {
		
		public void display()
		{
			
			System.out.println(a);
			
		}
	}

	public static void main(String[] args) {
		
        //  OuterClass o=new OuterClass();
        //  OuterClass.InnerClass i=o.new InnerClass();
          OuterClass.InnerClass i=new OuterClass().new InnerClass();
          i.display();
	}

}
