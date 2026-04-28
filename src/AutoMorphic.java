import java.util.Scanner;

// Class containing Automorphic Number logic
class Automorphic {

    // Method to check if a number is Automorphic
    boolean isAutomorphic(int num) {
        int square = num * num;
        int temp = num;

        // Check if last digits of square match the number
        while (temp > 0) {
            if (temp % 10 != square % 10)
                return false;
            temp /= 10;
            square /= 10;
        }

        return true;
    }
}


class Exec6 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        Automorphic obj = new Automorphic();

        if (obj.isAutomorphic(num))
            System.out.println(num + " is an Automorphic number");
        else
            System.out.println(num + " is not an Automorphic number");

        sc.close();
    }
}
