import java.util.Scanner;
public class SwapNumber {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Ener First number : ");
		int f=sc.nextInt();
		System.out.println("Ener second number : ");
		int s=sc.nextInt();
		
		f=f+s;
		s=f-s;
		f=f-s;
		
		System.out.println("After Swapping : "+f+" "+s);
		

	}

}
