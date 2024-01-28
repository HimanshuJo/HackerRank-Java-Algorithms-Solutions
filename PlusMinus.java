/*
https://www.hackerrank.com/challenges/plus-minus/problem
*/

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
     * Complete the 'plusMinus' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void plusMinus(List<Integer> arr) {
        float countpos=0, countnegs=0, countzeros=0;
        int sz=arr.size();
        for(int i=0; i<sz; ++i){
            if(arr.get(i)>0) countpos++;
            else if(arr.get(i)<0) countnegs++;
            else countzeros++;
        }
        System.out.println(String.format("%.6f", countpos/sz)+"\n"+
                           String.format("%.6f", countnegs/sz)+"\n"+
                           String.format("%.6f", countzeros/sz));
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.plusMinus(arr);

        bufferedReader.close();
    }
}
