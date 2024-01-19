import java.util.*;
import java.io.*;

class Program311
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the name of file : ");
		String FileName = sobj.nextLine();
		
		try
		{
				System.out.println("Enter the data that you want to write in the file");
				
				String Data = sobj.nextLine();

				FileWriter fwobj = new FileWriter(FileName);

				fwobj.write(Data);
			
		}
		catch(Exception obj)
		{
			System.out.println("Error in creating a file");
		}
	}
}