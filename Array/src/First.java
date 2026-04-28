import java.util.Scanner;

public class First {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }
        for(int i=0;i<n.length;i++){
            System.out.print(n[i] + " ");
        }
    }
}
