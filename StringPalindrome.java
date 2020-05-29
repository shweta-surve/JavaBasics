import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
	
	
String str,temp="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		str=sc.nextLine();

		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
	
		if(str.equals(temp))
		{
		    System.out.println("palindrome");
		}
		else
		{
			System.out.println("not palindrome");
		}

	}

}
