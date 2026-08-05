import java.util.Scanner;

public class CheckElement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();

        boolean found = false;
        for(int num : arr) {
            if(num == x) {
                found = true;
                break;
            }
        }

        if(found) System.out.println(x + " exists in the array.");
        else System.out.println(x + " does not exist in the array.");
    }
}
