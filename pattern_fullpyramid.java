/* print the following pattern 
   Q::    1 
        2 3 2 
      3 4 5 4 3
    4 5 6 7 6 5 4 
  5 6 7 8 9 8 7 6 5 
  */

public class pattern_fullpyramid
  {
	public static void main(String[] args) {
	  int n=5;
	  for(int i=1;i<=n;i++)
	  {
	      for(int j=i;j<n;j++)
	      {
	          System.out.print(" ");
	      }
	      for(int j=i;j<=i*2-1;j++)
	      {
	          System.out.print(j);
	      }
	      for(int j=(i*2-1)-1;j>=i;j--)
	      {
	          System.out.print(j);
	      }
	      System.out.println();
	  }
	}
  }

/* steps
    1. Find out how many rows are required to print given pattern 
         -In the given question we require n rows. :: rows=i (i=n)
          rows=5
    2. Find out how many columns are required to print given pattern 
         -In the given question we require n*2-1 columns  means rows*2-1 columns 
            columns=5*2-1=9
    3.find out what to print for each i'th rows (i=0 to n)
           3.1 find out how many spaces should be printed for i'th row 
                -In the given question we require spaces = i to n-1 
           3.2 find out what to print 
                - In the given question we are printing digits  for each i'th rows 
                   j=i to j<i*2-1 increment by  j 1 for each iteration 
                      print (j);
                   and 
                   j=(i*2-1)-1 to j>= i decrement j by 1 for each iteration 
                   print(j)
   */
         
   
  
     
  
         
