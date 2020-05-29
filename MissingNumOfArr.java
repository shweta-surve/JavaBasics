
public class MissingNumOfArr {

	public static void main(String[] args) {
		int a[]={1,2,4,5,6};
	int n=a.length+1;
		int sum;
		 sum=(n*(n+1)/2);
		 for(int i=0;i<a.length;i++)
		 {
			 sum=sum-a[i];
			 
		 }
		 System.out.println("missing number : "+sum);
		

	}

}
