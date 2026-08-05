import java.util.Scanner;

class ArmStrong {

    boolean isArmStrong(int num) {
        int original = num;
        int sum = 0;
        int digits = 0;
        int temp = num;

        while (temp > 0) {
            temp /= 10;
            digits++;
        }

        temp = num;

        while (temp > 0) {
            int digit = temp % 10;
            sum += Math.pow(digit, digits);
            temp /= 10;
        }

        return sum == original;
    }
}
class Exec3 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        ArmStrong obj = new ArmStrong();

        if (obj.isArmStrong(num))
            System.out.println(num + " is an Armstrong number");
        else
            System.out.println(num + " is not an Armstrong number");

        sc.close();
    }
}
