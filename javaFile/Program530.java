import java.util.Scanner;

public class Program530 
{
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the string : ");

		String str = sobj.nextLine();

		str = str.trim();

		str = str.replaceFirst("\\s+", " ");

		String Arr[] = str.split(" ");

		
	}	
}
