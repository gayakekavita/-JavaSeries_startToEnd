/*Print Following pattern ::
     1
    232
   34543 
  4567654
*/

public class space_digit
{
	public static void main(String[] args) {
		int n=4;
		for(int i=0;i<n;i++)
		{
		    for(int j=0;j<(n-i-1);j++)
		    {
		        System.out.print(" ");
		    }
		    for(int j=i+1;j<(2*i+1);j++)
		    {
		        System.out.print(j);
		    }
		   
		    for(int j=(2*i+1);j>=i+1;j--)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	
	}
}

/* steps:
    step 1: find out how many rows are required to print given pattern
            rows=n  , n=4
    step 2: find out how many columns required for each i'th rows
             columns required in above questions are :
                  from 0 to (n-i-1) +   from i+1 to (2*i+1) + from (2*i+1) to i+1
                   where i= i'th rows
    step 3: for(int j=0;j<(n-i-1);j++) 
            this statement will create the spaces required for printing the given pattern
    step 4:  for(int j=i+1;j<(2*i+1);j++)
             for(int j=(2*i+1);j>=i+1;j--)
               these two statement will print the remaining digits in the given pattern 
    step 4: output::
             1
            232
           34543 
          4567654
   */       
