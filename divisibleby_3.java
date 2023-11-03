public class divisibleby_3
{
	public static void main(String[] args) {
	  //number divisible by 3 in Array
	  int[] arr={190,45,67,83,22};
	  
	  int count=0;
	  int i=0;
	  do
	  {
	      if(arr[i]%3==0)
	      {
	         count++;
	         
	      }
	      
	      i++;
	  }while(i<arr.length);
	  System.out.println("number of elements  divisible by 3 in Array:"+count);
	}
}
