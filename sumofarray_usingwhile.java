public class sumofarray_usingwhile
{
	public static void main(String[] args) {
	  //sum of array elements
	  int[] arr={190,45,67,83,22};
	  int sum=0;
	  int i=0;
	  while(i<arr.length)
	  {
	      sum+=arr[i];
	      i++;
	  }
	  System.out.println("Sum of array elements is:"+sum);
	}
}
