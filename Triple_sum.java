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
     * Complete the 'triplets' function below.
     *
     * The function is expected to return a LONG_INTEGER.
     * The function accepts following parameters:
     *  1. INTEGER_ARRAY a
     *  2. INTEGER_ARRAY b
     *  3. INTEGER_ARRAY c
     */

   public static long triplets(List<Integer> a, List<Integer> b, List<Integer> c) {
    long count = 0;

    List<Integer> distinctA = removeDuplicatesAndSort(a);
    List<Integer> distinctB = removeDuplicatesAndSort(b);
    List<Integer> distinctC = removeDuplicatesAndSort(c);

    int indexA = 0;
    int indexC = 0;

    for (int numB : distinctB) {
        while (indexA < distinctA.size() && distinctA.get(indexA) <= numB) {
            indexA++;
        }

        while (indexC < distinctC.size() && distinctC.get(indexC) <= numB) {
            indexC++;
        }

        count += (long) indexA * indexC;
    }

    return count;
}

public static List<Integer> removeDuplicatesAndSort(List<Integer> list) {
    Set<Integer> set = new HashSet<>(list);
    List<Integer> result = new ArrayList<>(set);
    Collections.sort(result);
    return result;
}



}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String[] firstMultipleInput = bufferedReader.readLine().replaceAll("\\s+$", "").split(" ");

        int lena = Integer.parseInt(firstMultipleInput[0]);

        int lenb = Integer.parseInt(firstMultipleInput[1]);

        int lenc = Integer.parseInt(firstMultipleInput[2]);

        List<Integer> arra = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> arrb = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        List<Integer> arrc = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        long ans = Result.triplets(arra, arrb, arrc);

        bufferedWriter.write(String.valueOf(ans));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
