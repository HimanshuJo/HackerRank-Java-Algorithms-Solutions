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
     * Complete the 'staircase' function below.
     *
     * The function accepts INTEGER n as parameter.
     */

    public static void staircase(int n) {
        Vector<Vector<Character>>vec=new Vector<>();
        for(int i=0; i<n; ++i){
            vec.add(new Vector<>());
            for(int j=0; j<n; ++j){
                vec.get(i).add(' ');
            }
        }
        for(int i=0; i<n; ++i){
            int count=i+1;
            for(int j=n-1; j>=0; --j){
                if(count==0) break;
                vec.get(i).set(j, '#');
                count--;
            }
        }
        for(int i=0; i<n; ++i){
            for(int j=0; j<n; ++j){
                System.out.print(vec.get(i).get(j));
            }
            System.out.println();
        }
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        Result.staircase(n);

        bufferedReader.close();
    }
}
