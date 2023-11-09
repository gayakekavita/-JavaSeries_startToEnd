/* Q:: print  following pattern ::
       0
       00
       000
       0000
       00000
  */
public class triangle_pattern
{
	public static void main(String[] args) {
		for(int i=0;i<5;i++)
		{
		    for(int j=0;j<i+1;j++)
		    {
		      System.out.print('0'+""); 
		    }
		    System.out.println();
		    
		}
	}
}

/* step 1: find out how many rows required in given problem
          in above program rows=5
   step 2:find out how many colums are required for each row
          in above question there are 5 rows so for i'th rows
           1'st row= 1 column
           2'nd row= 2 columns
           3'rd row= 3 columns
           4'th row= 4 columns
           5'th row= 5 columns 
           but as we know that index start from 0
           i'th (i=0) row= i+1 (i=0, columns=0+1=1) columns
           i'th (i=1) row= i+1 (i=1, columns=1+1=2)columns
           i'th (i=2) row= i+1 (i=2, columns=2+1=3)columns
           i'th (i=3) row= i+1 (i=3, columns=3+1=4)columns
           i'th (i=4) row= i+1 (i=4, columns=4+1=5) columns 
  step 3: Implementation of program 
  step 4: Execution of program
  step 5: Output:
       0
       00
       000
       0000
       00000

  */
           
    








