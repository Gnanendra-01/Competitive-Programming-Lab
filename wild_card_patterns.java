import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        String str = scan.nextLine();
        String pat = scan.nextLine();
        int n = str.length();
        int m = pat.length();
        int index = 0;
        for(int i = 0;i < n;i++){
          if(index == m){
            System.out.println(0);
            return;
          }
          if(pat.charAt(index) == '?' || pat.charAt(index) == str.charAt(i)){
            index++;
            continue;
          }
          else if(pat.charAt(index) == '*'){
            char ch = str.charAt(i);
            while(i < n && str.charAt(i) == ch) i++;
            index++;
          }
          else{
            System.out.println(0);
            return;
          }
        }
        System.out.println(1);
    }
}
