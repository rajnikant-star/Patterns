import java.util.Scanner;

public class OppPyramid3 {
    public static void main(String[] args0){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=2;j<=i;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=n-i+1;k++){
                System.out.print("*");
            }
            for(int l=1;l<=n-i;l++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
