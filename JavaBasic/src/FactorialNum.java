import java.util.Scanner;;
public class FactorialNum {

	public static void main(String[] args) {
		int fact=1,i=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter Number : ");
		int n=sc.nextInt();
		/*for(int i=1;i<=n;i++){
			fact=fact*i;
			
		}*/
		
		  while(n>=i)
		{
			fact=fact*i;
			i++;
		}
		 
		
		System.out.println("factorial is : "+fact);
		

	}

}


