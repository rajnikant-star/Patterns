import java.util.Scanner;

public class Smallest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }
        int smallest = n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]<smallest){
                smallest = n[i];
            }
        }
        System.out.print("Largets Number in Array is :"+ smallest);
    }
}
