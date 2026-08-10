import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] nums = new int[n];
        for(int i = 0;i < n;i++){
            nums[i] = scan.nextInt();
        }
        Arrays.sort(nums);
        int target = scan.nextInt();
        int count = 0;
        for(int i = 0;i < n - 2;i++){
            if(i > 0 && nums[i] == nums[i-1])continue;
            int left = i + 1, right = n - 1;
            long sum = 0;
            while(left < right){
                sum = (long)nums[i] + (long)nums[left] + (long)nums[right];
                if(sum < target) left++;
                else if(sum > target) right--;
                else{
                    System.out.println(nums[i] + " " + nums[left] + " " + nums[right]);
                    count++;
                    int leftValue = nums[left];
                    int rightValue = nums[right];
                    while(left < right && nums[left] == leftValue)left++;
                    while(left < right && nums[right] == rightValue)right--;
                }
            }
        }
        if(count == 0)System.out.println("No Triplet Found");
        
    }
}
