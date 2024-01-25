import java.util.*;

class Program507
{
	public static void main(String[] args) 
	{
		Scanner sobj = new Scanner(System.in);
		
		System.out.println("Enter the String : ");

		String str = sobj.nextLine();

		str = str.trim();

		str = str.replaceAll("\\s+"," ");

		char Arr[] = str.toCharArray(); 

		int i = 0;
		int spaceCnt = 0;

		for(i = 0; i < Arr.length; i++)
		{
			if(Arr[i] == ' ')
			{
				spaceCnt++;
			}
		}

		System.out.println("number of words are : "+(spaceCnt+1));
	
		sobj.close();
	}
}