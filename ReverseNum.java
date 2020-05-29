import java.util.Scanner;;
public class ReverseNum {

	public static void main(String[] args) {
		int rev=0,digit=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		while(n>0)
		{
			digit=n%10;
			rev=rev*10+digit;
			n=n/10;
		}
		System.out.println("Reverse numberis : "+rev);
	}

}
