
public class DupEleArray {

	public static void main(String[] args) {
		int[] arr={1,2,2,6,5,6,7,8,9};
		System.out.println("Duplicates elements are : ");
		for(int i=0;i<arr.length-1;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println(arr[j]);
				}
			}
		}

	}

}
