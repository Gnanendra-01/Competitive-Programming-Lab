import java.io.*;
import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int n = scanner.nextInt();
        int[] counts = new int[100];
        
        for (int i = 0; i < n; i++) {
            int num = scanner.nextInt();
            counts[num]++;
        }
        
        int[] sortedArr = new int[n];
        int index = 0;
        
        for (int i = 0; i < 100; i++) {
            while (counts[i] > 0) {
                sortedArr[index++] = i;
                counts[i]--;
            }
        }
        
        for (int i = 0; i < n; i++) {
            System.out.print(sortedArr[i]);
            if (i < n - 1) {
                System.out.print(" ");
            }
        }
        System.out.println();
        
        scanner.close();
    }
}
