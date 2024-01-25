import java.util.Scanner;

public class Program509
{
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str = sobj.nextLine();

		str = str.trim();

		str = str.replaceAll("\\s+", " ");

		String Arr[] = str.split(" ");

		String strFrq = "";
		int count = 0;

		System.out.println("Enter word to be serached : ");
		strFrq = sobj.nextLine();

		for(String s : Arr)
		{
			if(s.equals(strFrq))
			{
				count++;
			}
		}

		System.out.println("Frequeency of word is : "+(count));
	}	
}
