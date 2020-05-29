import java.util.Scanner;
public class ArmstrongNum {

	public static void main(String[] args) {
		int digit=0,rev=0,temp=0;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n =sc.nextInt();
		temp=n;
		while(n>0)
		{
			digit=n%10;
			rev=rev+digit*digit*digit;
			n=n/10;
		}
        if(temp==rev)
        	System.out.println("Armstrong");
        else
        	System.out.println("Not Armstrong");
	}

}
