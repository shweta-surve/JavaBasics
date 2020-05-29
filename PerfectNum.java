import java.util.Scanner;

public class PerfectNum {

	public static void main(String[] args) {
		int sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
       for(int i=1;i<n;i++)
       {
    	   if(n%i==0)
    	   {
    		   sum=sum+i;
    	   }
    	   
       }
       if(sum==n)
       System.out.println("perfect num is : "+sum);
       else
    	   System.out.println("no perfect");
	}

}
