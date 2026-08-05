import java.util.Scanner;
public class CountPrime {
    public static boolean isPrime(int num) {
        if(num <= 1) return false;
        for(int i=2; i<=Math.sqrt(num); i++) {
            if(num % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter size of array: ");
        int n = sc.nextInt();
        int[] arr = new int[n];

        System.out.println("Enter elements:");
        for(int i=0; i<n; i++) arr[i] = sc.nextInt();

        int count = 0;
        for(int num : arr) {
            if(isPrime(num)) count++;
        }

        System.out.println("Number of primes: " + count);
    }
}
