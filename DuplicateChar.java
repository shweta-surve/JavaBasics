import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class DuplicateChar {

	public static void main(String[] args) {
		HashMap< Character ,Integer> hm=new HashMap<>();
	     Scanner sc=new Scanner(System.in);
	     System.out.println("Enter String : ");
	      String str=sc.nextLine();
	      //String str="javajee";
	   //  String[] s=str.split(" ");
	      for(int i=0;i<str.length();i++)
	      {
	      char c=str.charAt(i);
	      if(hm.get(c)!=null)
	      {
	    	  hm.put(c, hm.get(c)+1);
	    	  
	      }
	      else{
	      hm.put(c, 1);
	      }
		}
      Iterator<Character> ss= hm.keySet().iterator();
		     System.out.println("duplicates charcters are : ");
		     while (ss.hasNext()) {
			Character s1= ss.next();
				if(hm.get(s1)>1)
				{
					System.out.println(s1+" : "+hm.get(s1));
				}
			}  // System.out.println(hm);
	
	}
}
