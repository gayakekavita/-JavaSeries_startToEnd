public class evenelements_array
{
	public static void main(String[] args) {
	  //number of elements which are even in array
	  int[] arr={190,45,67,83,22};
	  int count=0;
	  int i=0;
	  do
	  {
	      if(arr[i]%2==0)
	      {
	         count++; 
	      }
	      
	      i++;
	  }while(i<arr.length);
	  System.out.println("number of elements which are even in array:"+count);
	}
}
