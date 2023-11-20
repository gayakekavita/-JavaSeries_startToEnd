/* Q:: Print the following pattern
        1
        12
        123
        1234
        12345
  */
public class Half_Pyramid
{
	public static void main(String[] args) {
	    int n=5;// n=number of rows you want to print in given pattern
		for(int i=1;i<=n;i++)
		{
		    for(int j=1;j<i+1;j++)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}
/*
    step 1:find out how many rows are required to print given pattern 
            let's say rows=n
    step 2:find out how many columns required for each i'th rows 
           columns from 1 to <i+1 (j=columns)
    step 3: find out what to print in rows
            value=j
    step 4:Implementation and execution
    step 5: output::
           1
           12
           123
           1234
           12345
    
*/
