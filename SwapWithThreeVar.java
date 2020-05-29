import java.util.Scanner;
public class SwapWithThreeVar {

	public static void main(String[] args) {
		int t;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter first Number : ");
		int n1=sc.nextInt();
		System.out.println("Enter second Number : ");
		int n2=sc.nextInt();
		
		t=n1;
		n1=n2;
		n2=t;
		
		System.out.println("After swapping : "+n1+" "+n2);

	}

}
