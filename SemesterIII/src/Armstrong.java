import java.util.Scanner;

import static java.lang.Math.log10;

public class Armstrong {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int original = n;
        int sum = 0;
        int m = (int) Math.log10(n)+1;
        while(n>0){
            int r = n%10;
            sum += (int)Math.pow(r,m);
            n=n/10;
        }
        if(sum == original){
            System.out.println("true");
        }
        else System.out.println("False");
    }
}
