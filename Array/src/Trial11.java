import java.util.Arrays;
import java.util.Scanner;

public class Trial11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    int k = sc.nextInt();
    int x = sc.nextInt();
    int[] arr = new int[x];
    for(int i=0;i<arr.length;i++){
        arr[i] = sc.nextInt();
        }
    int sum1 = 0;
    int sum2 = 0;
    Arrays.sort(arr);
    for(int i=arr.length-1; i>= arr.length-k;i--){
        sum1 += arr[i];
    }
    for(int i=0; i<k; i++){
        sum2 += arr[i];
    }
    System.out.println(sum1-sum2);
    }
}
