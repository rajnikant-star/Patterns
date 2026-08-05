import java.util.Scanner;

public class Max_Secmax {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] nums = new int[n];
        for(int i=0;i<n;i++){
            nums[i] = sc.nextInt();
        }
        int s = Integer.MIN_VALUE;
        int ss = Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            if(nums[i]>s){
                ss = s;
                s = nums[i];
            }
            else if(nums[i]>ss && nums[i]!=s){
                ss = nums[i];
            }
        }
        if(s==Integer.MIN_VALUE){
            System.out.println("Nolargest or second laregst found");
        }
        else if(ss==Integer.MIN_VALUE){
            System.out.println(" largest : "+s+" and second laregst not found");
        }
        else{
            System.out.println("largest : "+s+" second largest : "+ss);
        }
    }
}
