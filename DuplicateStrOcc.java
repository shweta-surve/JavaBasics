import java.util.HashMap;
import java.util.Scanner;
public class DuplicateStrOcc {

	public static void main(String[] args) {
		// 1.split the str by split method
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
    	  }else
    	  {
    
    	 hm.put(s[i], 1);
    	  }
      }
      System.out.println(hm);
	}

}
