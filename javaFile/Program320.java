import java.util.*;
import java.io.*;

class Program320
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

			FileOutputStream fcombine = new FileOutputStream(PackedFile);

			int iRet = 0;

			byte Buffer[] = new byte[1024];

            for(int i = 0; i < Arr.length; i++)
            {
                FileInputStream fiobj = new FileInputStream(Arr[i]);

				while ((iRet = fiobj.read(Buffer)) != -1)
				{
					fcombine.write(Buffer,0,iRet);
				}
				fiobj.close();
            }
			fcombine.close();
        }
        else 
        {
            System.out.println("There is no such directory");
        }
    }
}
