import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int dividend = scan.nextInt();
        int divisor = scan.nextInt();
        int low = 0, high = dividend, mid = 0;
        while(low < high){
          mid = low + (high - low) / 2;
          if(mid * divisor == dividend)break;
          else if(mid * divisor > dividend)high = mid - 1;
          else low = mid + 1;
        }
        System.out.println(mid);
    }
}
