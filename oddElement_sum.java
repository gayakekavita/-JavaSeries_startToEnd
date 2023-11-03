public class oddElement_sum
{
	public static void main(String[] args) {
	  //sum of elements which are odd in array
	  int[] arr={190,45,67,83,22};
	  
	  int sum=0;
	  int i=0;
	  do
	  {
	      if(arr[i]%2==1)
	      {
	         sum+=arr[i];
	      }
	      
	      i++;
	  }while(i<arr.length);
	  System.out.println("sum of  odd  numbers  in array:"+sum);
	}
}
