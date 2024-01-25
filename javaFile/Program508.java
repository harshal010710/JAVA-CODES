import java.util.Scanner;

public class Program508 
{
	public static void main(String[] args) {
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str = sobj.nextLine();

		str = str.trim();

		str = str.replaceAll("\\s+", " ");

		String Arr[] = str.split(" ");

		int max = 0;

		String maxStr = "";

		for(String s : Arr)
		{
			if(s.length() > max)
			{
				max = s.length();
				maxStr = s;
			}
		}

		System.out.println("Largest word is : "+(maxStr));
	}	
}
