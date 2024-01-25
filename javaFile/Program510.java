import java.util.Scanner;

public class Program510
{
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str = sobj.nextLine();

		str = str.trim();

		str = str.replaceAll("\\s+", " ");

		String Arr[] = str.split(" ");

		String strFrq = "";
		String demoString = "";
		int count = 0;

		System.out.println("Enter word to be serached : ");
		strFrq = sobj.nextLine();

		for(String s : Arr)
		{
			if(!s.equals(strFrq))
			{
				demoString.concat(s);
				demoString.concat(" ");
			}
		}

		demoString = demoString.trim();

		System.out.println("replaced of string  is : "+(demoString));
	}	
}
