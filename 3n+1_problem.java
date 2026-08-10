import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan  = new Scanner(System.in);
        int i = scan.nextInt();
        int j = scan.nextInt();
        int max_length = 0;
        HashMap<Long,Integer> map = new HashMap<>();
        for(int k = i;k <= j;k++){
          long n = k;
          int length = 1;
          while(n != 1){
            if(map.containsKey(n)){
              length = length + map.get(n) - 1 ;
              break;
            }
            else{
              if(n % 2 == 0)
                n = n / 2;
              else
                n = 3 * n + 1;
              length++;
            }
          }
          // System.out.println(length);
          map.put((long)k,length);
          max_length = Math.max(max_length,length);
          
        }
        System.out.println(i + " "+ j + " " + max_length);
        
        scan.close();
    }
}
