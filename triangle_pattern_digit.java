/* Q:: print following pattern
               1
             1 2
          1  2 3
        1  2 3 4
      1  2 3 4 5
*/
public class triangle_pattern_digit
{
	public static void main(String[] args) {
	    int n=5;
	    
		
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<=(n-i-1);j++)
		    {
		          System.out.print("  ");
		        
		    }
		    for(int j=1;j<=i+1;j++)
		    {
		        System.out.print(j);
		    }
		    System.out.println();
		}
	}
}

/* steps:
   step 1: find out how many rows are required to print given pattern
   step 2 :find out how many columns are requied for each i'th rows
   step 3: find out how many spaces will be printed in each rows
          spaces for each rows in above example are :  n-i-1
   step 4: Implemenatation of program 
   step 5: Output
*/
