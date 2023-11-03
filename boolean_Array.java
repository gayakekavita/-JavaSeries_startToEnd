public class boolean_Array
{
	public static void main(String[] args) {
	//array is collection of similar type of elements
	/* declaration of an array
	   data_type[] array_name;
	   
	   initialization of an array
	   data_type[] array_name=new data_type[size_of_array];
	   
	   */
	   boolean [] arr;
	   arr=new boolean[5];
	   for(int i=0;i<5;i++)
	   {
	       arr[i]=true;
	   }
	   for(int i=0;i<5;i++)
	   {
	       System.out.println(arr[i]);
	   }
	}
}
