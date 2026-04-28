import java.util.Scanner;

public class Diamond {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for (int i = 1; i <= n; i++) {
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (2 * i - 1); k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int l = 2; l <= n; l++) {
            for (int m = 2; m <= l; m++) {
                System.out.print(" ");
            }
            for (int o = 1; o <= n - l + 1; o++) {
                System.out.print("*");
            }
            for (int p = 1; p <= n - l; p++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
