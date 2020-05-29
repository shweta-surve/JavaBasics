import java.util.Scanner;
public class PaildromeNum {

	public static void main(String[] args) {
		int rev=0,idigit=0,temp=0;
		Scanner sc=new Scanner(System.in) ;
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		temp=n;
		while(n>0)
		{
			idigit=n%10;
			rev=(rev*10)+idigit;
			n=n/10;
		}
        if(temp==rev)
        	System.out.println("Num is palindrome");
        else
        	System.out.println("Not palindrome");
	}

}
