import java.util.Scanner;

// Class containing Perfect Number logic
class PerfectNumber {

    // Method to check if a number is perfect
    boolean isPerfect(int num) {
        int sum = 0;

        // Sum of proper divisors
        for (int i = 1; i <= num / 2; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }

        return sum == num;
    }
}

class Exec5 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        PerfectNumber obj = new PerfectNumber();

        if (obj.isPerfect(num))
            System.out.println(num + " is a perfect number");
        else
            System.out.println(num + " is not a perfect number");

        sc.close();
    }
}
