import java.util.Scanner;

public class UniqueCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        boolean unique = true;
        for(int i=0; i<n; i++) {
            for(int j=i+1; j<n; j++) {
                if(arr[i] == arr[j]) {
                    unique = false;
                    break;
                }
            }
        }

        if(unique) System.out.println("All elements are unique.");
        else System.out.println("Array has duplicates.");
    }
}
