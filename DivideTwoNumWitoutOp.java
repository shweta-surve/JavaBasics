import java.util.Scanner;
public class DivideTwoNumWitoutOp {

	public static void main(String[] args) {
     int a,b,c,res=0;
     Scanner sc=new Scanner(System.in);
     System.out.println("Enter first number : ");
     a=sc.nextInt();
     System.out.println("Enter Second number : ");
     b=sc.nextInt();
     
     c=a+b;
     while(c>b)
     {
    	 c=c-b;
    	 res++;
     }
     System.out.println("Result is : "+res);
	}

}
