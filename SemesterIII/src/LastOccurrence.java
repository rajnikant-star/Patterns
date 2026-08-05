import java.util.Scanner;

public class LastOccurrence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        System.out.print("Enter number to find: ");
        int x = sc.nextInt();

        int index = -1;
        for(int i=0; i<n; i++) {
            if(arr[i] == x) {
                index = i;
            }
        }

        if(index != -1) System.out.println("Last occurrence at index: " + index);
        else System.out.println("Number not found.");
    }
}
