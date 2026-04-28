import java.util.Scanner;

class NumberTesting {

    String isPrime(int n) {

        if (n <= 1) {
            return "not prime";
        }

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return "not prime";
            }
        }

        return "prime";
    }
}



class Exec1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Create object of NumberTesting
        NumberTesting obj = new NumberTesting();

        // Call method
        String result = obj.isPrime(num);

        System.out.println(num + " is " + result);

        sc.close();
    }
}
