import java.util.Scanner;;
public class BubbleSort {

	public static void main(String[] args) {
		int[] a={36,19,29,12,5};
		int temp;
		//for loop for number of rounds
		for(int i=0;i<a.length;i++)
		{
			//for loop for adjecent ele
			for(int j=0;j<a.length-1;i++)
			{
				if(a[j]>a[j+1])
				{
				  temp=a[j];
				  a[j]=a[i+1];
				  a[j+1]=temp;
				  
				}
			}
		}
		for(int i=0;i<a.length;i++)
		{
		System.out.println(a[i]+" ");
		}
	}

}
