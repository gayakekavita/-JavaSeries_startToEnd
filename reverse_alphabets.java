/* Print following pattern 
    E 
    D E 
    C D E 
    B C D E 
    A B C D E
*/
public class reverse_alphabets
{
	public static void main(String[] args) {
		
		int n=5;
		for(int i=0;i<n;i++)
		{
		    for(int j=i;j>=0;j--)
		    {
		        System.out.print((char)(65+(n-(j+1))) +" ");
		    }
		    System.out.println();
		}
	}
}
/* steps 
    step 1: find out how many rows required for printing given pattern 
    step 2: find how many characters will be printed for each rows 
    step 3: find out how many characters will be printed 
            In above  question 5 characters will be printed 
            A B C D E 
            so value of n=5
    step 4: Implemenentation of logic 
            System.out.print(65+(n-(j+1)))
            gives you result as :69 
            because at first iteration n =5 , j=0  so (65+ (5-(0+1))=69
            for getting character we simply typecast it
            System.out.print((char)65+(n-(j+1)))
            it gives result as : E at first iteration
   step 5: Output:
            E
            D E
            C D E
            B C D E 
            A B C D E
  */
     
