import java.util.Scanner;
public class PrimeNum {

	public static void main(String[] args) {
		int cnt=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number : ");
		int n=sc.nextInt();
        for(int i=2;i<n;i++)
        {
        	if(n%i==0)
        	{
        		cnt++;
        		break;
        	}
        }
        if(cnt==0)
        	System.out.println("Prime");
        else
        	System.out.println("not prime");
	}

}
