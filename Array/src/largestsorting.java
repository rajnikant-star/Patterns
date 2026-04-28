import java.util.Arrays;
import java.util.Scanner;

public class largestsorting {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }
        Arrays.sort(n);
        int largest = n[n.length-1];
        System.out.println(largest);
    }
}
