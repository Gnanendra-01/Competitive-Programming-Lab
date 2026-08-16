import java.io.*;
import java.util.*;

public class Solution {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String s = sc.nextLine();
    int mask = 0;
    for(char c : s.toCharArray()){
      int bit = 1 << (c - 'a'); 
      if((mask & bit) != 0){ 
        System.out.print(c + " ");
      }
      else
        mask |= bit;
    } 
    sc.close();
  }
}
