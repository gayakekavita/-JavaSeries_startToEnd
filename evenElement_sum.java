public class evenElement_sum
{
	public static void main(String[] args) {
	  //sum  of elements which are even in array
	  int[] arr={190,45,67,83,22};
	  
	  int sum=0;
	  int i=0;
	  do
	  {
	      if(arr[i]%2==0)
	      {
	         sum+=arr[i];
	      }
	      
	      i++;
	  }while(i<arr.length);
	  System.out.println("sum of  even numbers  in array:"+sum);
	}
}
