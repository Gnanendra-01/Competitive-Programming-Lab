import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++)
            arr[i] = scan.nextInt();
        int minIndex = 0;
        int maxIndex = 0;
        for(int i = 0;i < n;i++){
            minIndex = (arr[minIndex] < arr[i])?minIndex:i;
            maxIndex = (arr[maxIndex] > arr[i])?maxIndex:i;
        }
        int temp = arr[minIndex];
        arr[minIndex] = arr[maxIndex];
        arr[maxIndex] = temp;
        for(int i = 0;i < n;i++){
            System.out.print(arr[i]+" ");
        }
            
    }
}
