import java.util.Scanner;

public class NumberSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        System.out.println("Enter Number to search:");
        int a = sc.nextInt();
        for(int i=0;i<n.length;i++){
            if(n[i]==a){
                System.out.println(n[i]);
            }
        }
    }
}
