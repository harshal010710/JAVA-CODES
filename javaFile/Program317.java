import java.util.*;
import java.io.*;

class Program317
{
	public static void main(String[] args) throws Exception
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the name of Directory : ");
		String DirectoryFile = sobj.nextLine();
		
		boolean bret = false;
		File fobj = new File(DirectoryFile);
		
		bret = fobj.isDirectory();

		if(bret)
		{
			System.out.println("Directory name is present ");

			File Arr[] = fobj.listFiles();

			System.out.println("Number of files in the directory are : "+Arr.length);

			for(int i = 0; i < Arr.length; i++)
			{
				System.out.println("File name : "+Arr[i].getName() + "\nFile Size : " + Arr[i].length());
			}
		}
		else
		{
			System.err.println("Directory not found");
		}
	}
}