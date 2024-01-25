import java.util.Scanner;

public class Program511
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter String : ");
		String str = sobj.nextLine();

		StringBuffer sbobj = new StringBuffer(str);

		sbobj = sbobj.reverse();
		
	}	
}
