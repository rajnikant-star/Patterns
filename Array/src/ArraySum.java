import java.util.Scanner;

public class ArraySum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        int sum = 0;
        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }
        for(int i=0;i<n.length;i++){
            sum += n[i];
        }
        System.out.print("Sum of Array is: "+ sum);
    }
}
