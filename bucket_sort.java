import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] arr = new double[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextDouble();
        }
        ArrayList<Double>[] buckets = new ArrayList[n];
        for (int i = 0; i < n; i++) {
            buckets[i] = new ArrayList<>();
        }
        for (int i = 0; i < n; i++) {
            int bucketIdx = (int) (n * arr[i]);
            if (bucketIdx >= n) {
                bucketIdx = n - 1;
            }
            buckets[bucketIdx].add(arr[i]);
        }
        for (int i = 0; i < n; i++) {
            Collections.sort(buckets[i]);
        }
        for (int i = 0; i < n; i++) {
            for (double num : buckets[i]) {
              System.out.printf("%.2f ", num);
            }
        }
}
}
