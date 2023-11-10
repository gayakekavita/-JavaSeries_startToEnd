/* Q:: Print following pattern:
       A
       B B
       C C C
       D D D D
*/

public class triangle_pattern_alphabets
{
	public static void main(String[] args) {
		for(int i=0;i<4;i++)
		{
		    for(int j=0;j<i+1;j++)
		    {
		        System.out.print((char)(65+i)+" ");
		    }
		    System.out.println();
		}
	}
}
/* Steps:
   step 1: find how many rows are required to print given pattern 
   step 2: find out how many columns are required for each i'th rows
           columns=i+1
   step 3: find out what to print
           In above question we have to print characters or alphabets
   step 4: Implementation of program
           In above program we used char() function which converts integer value into ascii characters
           for example integer 65= A in char(65)
   step 4: Execution of progaram
   step 5: Output
           A
           B B 
           C C C 
           D D D D
*/
