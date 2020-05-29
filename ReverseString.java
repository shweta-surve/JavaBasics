import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		
	String str,temp="";
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter string : ");
		str=sc.nextLine();
	     temp=" ";
		int len=str.length();
		for(int i=len-1;i>=0;i--)
		{
			temp=temp+str.charAt(i);
		}
		System.out.println("string after reversing : "+temp);

	}

}
