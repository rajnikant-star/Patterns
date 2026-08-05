import java.util.Scanner;

public class Pyramid1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=0;j<i;j++){
                System.out.print(" ");
            }
            for(int k=n;k>(2*i-2);k--){
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
