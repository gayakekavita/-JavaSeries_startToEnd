/*Q:: print following pattern
      55555
      4444
      333
      22
      1
*/

public class reverse_digit
{
	public static void main(String[] args) {
	    int n=5;
	    
		
		for(int i=n;i>=0;i--)
		{
		   for(int j=0;j<i;j++)
		   {
		       System.out.print(i);
		   }
		    System.out.println();
		}
	}
}

/*steps
  step 1: find out how many rows are required for printing given pattern 
          n=5 (n=rows)
  step 2 : find out how many columns are required for i'th rows 
            columns= n-i 
  step 3: find out what to print at i'th row
          output=i
  step 4: Implemenatation of program
  step 5: Execution of program 
  step 6: Output
          55555
          4444
          333
          22
          1
*/
