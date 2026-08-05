import java.util.Scanner;

public class Divisibleby3and5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int count = 0;
        for(int num : arr) {
            if(num % 3 == 0 && num % 5 == 0) count++;
        }

        System.out.println("Count of numbers divisible by both 3 and 5: " + count);
    }
}
