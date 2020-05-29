
import java.util.Scanner;
public class StrDigitSum {

	public static void main(String[] args) {
   // Scanner sc=new Scanner(System.in);
   // System.out.println("Enter String : ");
    String str="Shweta12ram13st20jh";
    int sum=0;
	String num="";
    for(int i=0;i<str.length();i++)
    {
    	if(Character.isDigit(str.charAt(i)))
    	{
    		num=num+str.charAt(i);
    	}
    	else
    	{
    		if(!num.equals(""))
    		{
    			sum=sum+Integer.parseInt(num);
    			num="";
    		}
    	}
    }
    System.out.println("Sum is : "+sum);
    
	}

}
