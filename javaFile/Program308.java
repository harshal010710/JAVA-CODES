import java.util.*;
import java.io.*;

class Program308
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
				System.out.println("Name of File is : "+fobj.getName());
				System.out.println("Absolute path of file is : "+ fobj.getAbsolutePath());
				System.out.println("File size is : "+ fobj.length());
				System.out.println("Can we read from file : "+fobj.canRead());
				System.out.println("Can we write into file "+fobj.canWrite());
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