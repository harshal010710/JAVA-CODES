import java.util.*;
import java.io.*;

class Program307
{
	public static void main(String[] args)
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the name of file : ");
		String FileName = sobj.nextLine();
		
		try
		{
			File fobj = new File(FileName);

			if(fobj.exists())
			{
				System.out.println("File is Present");
			}
			else
			{
				System.out.println("There is no such file");
			}
			
		}
		catch(Exception obj)
		{
			System.out.println("Error in creating a file");
		}

	}
}