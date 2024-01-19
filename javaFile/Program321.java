import java.util.*;
import java.io.*;

class Program321
{
    public static void main(String arg[]) throws Exception
    {
        Scanner sobj = new Scanner(System.in);

        System.out.println("Enter the name of Directory : ");
        String DirectoryName = sobj.nextLine();

		System.out.println("Enter the name of packed file thart you want to create : ");
		String PackedFile = sobj.nextLine();

		File fobjpack = new File(PackedFile);

		boolean bret = fobjpack.createNewFile();
		if(!bret)
		{
			System.out.println("unable to create packed file");
			return;
		}

        File fobj = new File(DirectoryName);

        bret = fobj.isDirectory();

        if(bret == true)
        {
            System.out.println("Directory is present");

            File Arr[] = fobj.listFiles();
            System.out.println("Number of files in the directory are : "+Arr.length);

			String Header = null;

            for(int i = 0; i < Arr.length; i++)
            {
                Header = Arr[i].getName() + " " + Arr[i].length();

				System.out.println(Header);
            }
			
        }
        else 
        {
            System.out.println("There is no such directory");
        }
    }
}
