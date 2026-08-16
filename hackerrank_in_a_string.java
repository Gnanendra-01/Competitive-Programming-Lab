import java.util.*;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        String target = "hackerrank";
        int targetLen = target.length();
        int pointer = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == target.charAt(pointer)) {
                pointer++;
            }
            if (pointer == targetLen) {
                System.out.println("YES");
            }
        }
        if(pointer != targetLen)System.out.println("NO");
        scanner.close();
    }
}
