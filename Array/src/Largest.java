import java.util.Scanner;

public class Largest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }
        int largest = n[0];
        for(int i=0;i<n.length;i++){
            if(n[i]>largest){
                largest = n[i];
            }
        }
        System.out.print("Largets Number in Array is :"+ largest);
    }
}
