/*Q::Print following pattern
      1
      1 2
      1 2 3
      1 2 3 4
  */
public class triangle_pattern_numbers
{
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
		    for(int j=1;j<=i+1;j++)
		    {
		        System.out.print(j+" ");
		    }
		    System.out.println();
		}
	}
}

/* Steps::
     step 1: find out how many rows are required to print given pattern 
     step 2: find out how many columns are required for each rows 
             in above example we require columns=i+1 for each i'th rows
     step 3: Implementation of program
     step 4: Execution of program .
     step 5: output::
               1
               1 2 
               1 2 3
               1 2 3 4
  */
