import java.io.*;
import java.util.*;

public class Solution {

    static float median(int[] a,int[] b){
      float res;
      int size = a.length + b.length;
      int[] merged = new int[size];
      int i = 0,j = 0,index=0;
      while(i < a.length && j < b.length){
        merged[index++] = (a[i] < b[j])?a[i++]:b[j++];
      }
      while(i < a.length)merged[index++] = a[i++];
      while(j < b.length)merged[index++] = b[j++];
      if(size % 2 == 1){
        res = merged[size/2];
      }
      else{
        res = ((float)merged[size/2 - 1] + (float)merged[size/2]) / 2;
      }
      return res;
    }
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr1 = new int[n];
        int[] arr2 = new int[m];
        for(int i = 0;i < n;i++){
          arr1[i] = scan.nextInt();
        }
        for(int i = 0;i < m;i++){
          arr2[i] = scan.nextInt();
        }
        System.out.println(median(arr1, arr2));
        scan.close();
    }
}
