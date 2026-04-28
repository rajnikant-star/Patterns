import java.util.Scanner;

public class Reverse {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        int[] y = new int[x];
        for(int i=0;i<n.length;i++) {
            y[i] = n[n.length - 1 - i];
        }
            for(int i=0;i<n.length;i++){
                System.out.print(y[i]);
            }
    }
}
