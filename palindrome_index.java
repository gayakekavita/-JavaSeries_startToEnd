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
     * Complete the 'palindromeIndex' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts STRING s as parameter.
     */

    public static int palindromeIndex(String s) {
    // Write your code here
    int n=s.length();
    int palindromeindex=-1;
    for(int i=0;i<n/2;i++)
    {
        if(s.charAt(i)!= s.charAt(n-i-1))
        {
            if(i+1<n)
            {
                boolean ispalindrome=validstr(s.substring(i+1, n-i));
                if(ispalindrome)
                {
                    return i;
                }
                return n-i-1;
            }
        }
    }
     return palindromeindex;
    }
    public static boolean validstr(String str)
    {
        int n=str.length();
        for(int i=0;i<n;i++)
        {
            if(str.charAt(i)!=str.charAt(n-i-1))
            {
                return false;
            }
        }
        return true;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = Integer.parseInt(bufferedReader.readLine().trim());

        IntStream.range(0, q).forEach(qItr -> {
            try {
                String s = bufferedReader.readLine();

                int result = Result.palindromeIndex(s);

                bufferedWriter.write(String.valueOf(result));
                bufferedWriter.newLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        });

        bufferedReader.close();
        bufferedWriter.close();
    }
}
