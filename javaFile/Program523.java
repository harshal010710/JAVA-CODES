import java.util.Scanner;

public class Program523 
{
	public static void main(String[] args) {
		
		Scanner sobj = new Scanner(System.in);

		System.out.println("Enter the string : ");

		String str = sobj.nextLine();

		str = str.trim();

		str = str.replaceFirst("\\s+", " ");

		String Arr[] = str.split(" ");

		StringBuffer output = new StringBuffer();

		StringBuffer word = null;

		int iCnt = 0;

		for(int i = 0; i < Arr.length; i++)
		{
			word = new StringBuffer(Arr[iCnt]);
			output.append(word.reverse().append(" "));
		}

		System.out.println(output);
	}	
}
