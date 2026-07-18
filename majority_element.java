import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = scan.nextInt();
        }
        Arrays.sort(arr);
        int candidate = arr[n / 2];
        int count = 0;
        for(int num:arr){
            if(num == candidate)count++;
        }
        System.out.print((count > n / 2)?candidate:-1);
    }
}
