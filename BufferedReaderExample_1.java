import java.io.*;
public class BufferedReaderExample_1 
{

	public static void main(String[] args) 
	{
		try
		{
			BufferedReader br=new BufferedReader(new InputStreamReader(System.in)); //creating bufferedreader object
			float a=Float.parseFloat(br.readLine()); // reading a float value
			double b=Double.parseDouble(br.readLine());// reading a double value
			System.out.println(a+"\n"+b);
		}
		catch(Exception e)
		{
		}
		

	}

}
