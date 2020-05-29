import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class StrDuplicateCnt {

	public static void main(String[] args) {
		HashMap< String ,Integer> hm=new HashMap<>();
	      Scanner sc=new Scanner(System.in);
	      System.out.println("Enter String : ");
	      String str=sc.nextLine();
	      
	      String[] s=str.split(" ");
	      for(int i=0;i<s.length;i++)
	      {
	    	  if(hm.get(s[i])!=null)
	    	  {
	    		  hm.put(s[i], hm.get(s[i])+1);
	    	  }
	    	  else
	    	  {
	    
	    	  hm.put(s[i], 1);
	    	  }
	      }
	     Iterator<String> ss= hm.keySet().iterator();
	     System.out.println("duplicates string are : ");
	     while (ss.hasNext()) {
		String s1= ss.next();
			if(hm.get(s1)>1)
			{
				System.out.println(s1+" : "+hm.get(s1));
			}
		}
		}

	}


