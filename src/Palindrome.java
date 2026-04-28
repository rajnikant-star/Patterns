import java.util.Scanner;

// Class containing Palindrome logic
class Palindrome {

    // Method to check if a number is palindrome
    boolean isPalindrome(int num) {
        int original = num;
        int reversed = 0;

        while (num > 0) {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }

        return reversed == original;
    }
}

class Exec4 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Palindrome obj = new Palindrome();

        if (obj.isPalindrome(num))
            System.out.println(num + " is a palindrome number");
        else
            System.out.println(num + " is not a palindrome number");

        sc.close();
    }
}
