import java.util.Scanner;
public class FibonacciSeries {

	public static void main(String[] args) {
		int a=0,b=1,c=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
		System.out.println("First"+n+"Terms");
		for(int i=0;i<n;i++)
		{
			System.out.println(a+" ");
			c=a+b;
			a=b;
			b=c;
		}

	}

}
