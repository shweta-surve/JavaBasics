import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
    System.out.println("Enter year : ");
    int no=sc.nextInt();
    
    if(no%4==0 && no%100!=0 || no%400==0)
    {
    	System.out.println("Leap year");
    }
    else 
    {
    	System.out.println("not leap");
    }
	}

}
