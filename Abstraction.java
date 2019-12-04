
public class Abstraction {

	public static void main(String[] args) {
		
		
		Racoon r=new Racoon("Racoon");
		r.eat();
		r.breathe();

	}
}

	abstract class Animal
	{
		private String name;
		public Animal(String name)
		{
			
			this.name=name;
		}
		
	public abstract void eat();
	public abstract void breathe();
	public String getName()
	{
		
		return name;
	}
	}
	class Racoon extends Animal
	{
		public Racoon(String name)
		{
			
			super(name);
		}
		
		public void eat()
		{
			
			System.out.println(getName()+" is eating");
		}
	
	public void breathe()
	{
		
		System.out.println("Breathe in,breathe out,repeat");
	}
	
}
