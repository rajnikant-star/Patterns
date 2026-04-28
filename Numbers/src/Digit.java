import java.util.Scanner;

public class Digit {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int length = 0;
        while(n!=0){
            length++;
            n/=10;
        }
        System.out.println(length);
    }
}
