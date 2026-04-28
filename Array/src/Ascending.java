import java.util.Scanner;

public class Ascending {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int[] n = new int[x];
        for(int i=0;i<n.length;i++){
            n[i]=sc.nextInt();
        }
        for(int i=0;i<n.length;i++){
            for(int j=i+1;j<n.length;j++){
                if(n[i]>n[j]){
                    int temp = n[i];
                    n[i] = n[j];
                    n[j] = temp;
                }
            }
        }
        for(int num : n){
            System.out.println(num+" ");
        }
    }
}
