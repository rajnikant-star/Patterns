import java.util.Scanner;

public class CountElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to count: ");
        int x = sc.nextInt();

        int count = 0;
        for(int num : arr) {
            if(num == x) count++;
        }

        System.out.println(x + " appears " + count + " times.");
    }
}
