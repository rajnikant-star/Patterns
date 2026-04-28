import java.util.Scanner;

public class Strong {
    String isStrong(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += factorial(digit);
            number /= 10;
        }

        if (sum == originalNumber) {
            return "Strong";
        } else {
            return "Not Strong";
        }
    }

    private static int factorial(int n) {
        int fact = 1;
        for (int i = 1; i <= n; i++) {
            fact *= i;
        }
        return fact;
    }

}
class Exec2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Create object of NumberTesting
        Strong obj = new Strong();

        // Call method
        String result = obj.isStrong(num);

        System.out.println(num + " is " + result);

        sc.close();
    }
}
