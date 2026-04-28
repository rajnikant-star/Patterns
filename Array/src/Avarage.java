import java.util.Scanner;

public class Avarage {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        float sum = 0;
        float avg = 0;
        for(int i=0;i<n.length;i++){
            n[i] = sc.nextInt();
        }
        for(int i=0;i<n.length;i++){
            sum += n[i];
            avg = sum/x;
        }
        System.out.print("Avarage of Array is: "+ avg);
    }
}
