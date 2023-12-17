/* print following pattern
      1
      1 2
      1    3
      1       4
      1 2  3  4 5 */
  
public class pyramid_spaceanddigits {
    public static void main(String args[]) {
      int n=5;
      System.out.println(1);
      for(int i=1;i<n;i++)
      {
          if (i!= n-1) 
          {
          System.out.print(1+" ");
           
                   for(int k=0;k<=(i-2);k++)
                   {
                     System.out.print("  ");  
                   }
          System.out.print(i+1);
          }
          else{
              for(int j=1;j<=n;j++)
              {
                  System.out.print(j +" ");
              }
          }
               
           
           
          System.out.println();
      }
    }
}
