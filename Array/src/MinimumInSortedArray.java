import java.util.Arrays;
import java.util.Scanner;

public class MinimumInSortedArray{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i< n; i++){
            nums[i] = sc.nextInt();
        }
        int j = 0;
        for(int i=0;i<n;i++){
            if(nums[i]!=nums[j]){
                j++;
                nums[i] = nums[j];
            }
        }
        Arrays.sort(nums);
        for(int i=0;i<nums.length;i++){
            System.out.print(nums[i]);
            System.out.print(" ");
        }
    }
}