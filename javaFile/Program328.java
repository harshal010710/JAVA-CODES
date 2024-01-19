import java.util.*;
import java.io.*;

class Program328 
{
	public static void main(String[] args) throws Exception
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the name of packed file that you want to unpack : ");
		String PackedFile = sobj.nextLine();

		File fobj = new File(PackedFile);
		FileInputStream fiobj = new FileInputStream(fobj);

		byte Header[] = new byte[100];

		fiobj.read(Header, 0, 100);

		String Hstr = new String(Hstr);

		System.out.println("Length of Header String is : "+Hstr.length());

		System.out.println(Header);

		

	}
}
