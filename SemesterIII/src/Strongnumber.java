import java.util.Scanner;

public class Strongnumber {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        while (n > 0) {
            int digit = n%10;
            sum += factorial(digit);
            n = n/10;
        }
        if(sum==original){
            System.out.println("true");
        }
        else System.out.println("False");
    }

    private static int factorial(int n) {
        int fact=1;
        for(int i=1;i<=n;i++){
            fact *= i;
        }
        return fact;
    }
}