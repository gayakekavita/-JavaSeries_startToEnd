import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
     String str="";
     if(s.substring(0,2).equals("12") && s.contains("AM"))
     {
         str="00";
         str= str+s.substring(2,s.length()-2);
     }
     if(s.contains("PM"))
     {
         
         int h=Integer.parseInt(s.substring(0,2));
         if(h==12)
         {
             h=12;
         }
         if(h>0 && h<12)
         {
             h=h+12;
         }
         str=Integer.toString(h);
         str= str+s.substring(2,s.length()-2);
     }
      if(s.contains("AM"))
     {
         
         int h=Integer.parseInt(s.substring(0,2));
         if(h>0 && h<12)
         {
               if(h>0 && h<10)
               {
                   str="0"+Integer.toString(h);
               }
               else
               {
                   str=Integer.toString(h);
               }
              
              str= str+s.substring(2,s.length()-2);
         }
         
     }
     return str;

    }

}

public class TimeConversion {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
