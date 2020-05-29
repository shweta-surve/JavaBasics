import java.util.Scanner;

public class RemoveDigits {

	public static void main(String[] args) {
		String str,temp;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
	 str=sc.nextLine();
	 temp=" ";
		for(int i=0;i<str.length();i++)
		{
		   char ch=str.charAt(i);
		   if(!(ch>47 && ch<57))
		   {
			   temp=temp+ch;
		   }
		}
		System.out.println("String After remove digits : "+temp);
	}

}
 