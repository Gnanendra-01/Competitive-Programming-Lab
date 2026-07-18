import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int[] arr1 = new int[m];
        for(int i = 0;i < m;i++)
            arr1[i] = scan.nextInt();
        int n = scan.nextInt();
        int[] arr2 = new int[n];
        for(int i = 0;i < n;i++)
            arr2[i] = scan.nextInt();
        int[] res = new int[m + n];
        int i = 0,j = 0,k = 0;
        while(i < m && j < n){
            if(arr1[i] < arr2[j])
                res[k++] = arr1[i++];
            else
                res[k++] = arr2[j++];
        }
        while(i < m) res[k++] = arr1[i++];
        while(j < n) res[k++] = arr2[j++];
        for(i = 0; i < (m + n);i++)
            System.out.print(res[i] + " ");
        
        
    }
}
