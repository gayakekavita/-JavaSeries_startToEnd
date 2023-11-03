public class sumofarray_usingdoWhile
{
	public static void main(String[] args) {
	  //sum of array elements
	  int[] arr={190,45,67,83,22};
	  int sum=0;
	  int i=0;
	  do
	  {
	      sum+=arr[i];
	      i++;
	  }while(i<arr.length);
	  System.out.println("Sum of array elements is:"+sum);
	}
}
