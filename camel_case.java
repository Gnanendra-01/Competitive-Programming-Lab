import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        scan.nextLine();
        String dict = scan.nextLine();
        String pattern = scan.nextLine();
        ArrayList<String> res = new ArrayList<>();
        String word  = "";
        int index = 0;
        for(int i = 0;i < dict.length() - 1;i++){
            char ch = dict.charAt(i);
            if('A' <= ch && ch <= 'Z' && index < pattern.length() && ch == pattern.charAt(index))
              index++;
            word += ch;
            if(dict.charAt(i+1) == ','){
              if(index == pattern.length()) res.add(word);
              word = "";
              index = 0;
              i += 1;
            }
            
        }
        if(res.isEmpty()) System.out.print("No match found");
        for(int i = 0;i < res.size();i++){
            System.out.println(res.get(i));
        }
        scan.close();
    }
}
