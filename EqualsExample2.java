import java.util.ArrayList;
public class EqualsExample2 
{

	public static void main(String[] args) 
	{
		String s1="FACENXT";
		ArrayList<String> list=new ArrayList<>();
		list.add("FACE");
		list.add("FACEPREP");
		list.add("FACENXT");
		list.add("FACENOW");
		for(String s : list)
		{
			if(s.contentEquals(s1))	
			{
				System.out.println("FACENXT is present");
			}
		}
	}

}
