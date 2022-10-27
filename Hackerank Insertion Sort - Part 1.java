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
     * Complete the 'insertionSort1' function below.
     *
     * The function accepts following parameters:
     *  1. INTEGER n
     *  2. INTEGER_ARRAY arr
     */

    public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
         int tmp = arr.get(arr.size()-1);
        for(int i = arr.size()-2; i  >=0; i--){
            if(tmp >= arr.get(i)){//Found where it goes
                arr.set(i+1,tmp);
                        printArray(arr);
                break;
            }
            arr.set(i+1, arr.get(i));//Shift to the right
         printArray(arr);        }
        if(tmp < arr.get(0)){
          arr.set(0, tmp);  
        printArray(arr);        } 

    }
        static void printArray(List<Integer> arr){
        for(int a: arr){
            System.out.print(a + " ");
        }
        System.out.println("");
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.insertionSort1(n, arr);

        bufferedReader.close();
    }
}
