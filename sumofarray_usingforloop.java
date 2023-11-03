public class sumofarray_usingforloop
{
	public static void main(String[] args) {
	  //sum of array elements
	  int[] arr={190,45,67,83,22};
	  int sum=0;
	  for(int i=0;i<arr.length;i++)
	  {
	      sum+=arr[i];
	  }
	  System.out.println("Sum of array elements is:"+sum);
	}
}
