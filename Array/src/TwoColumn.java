import java.util.Scanner;

public class TwoColumn {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] n= new int[x][y];
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                n[i][j] = sc.nextInt();
            }
        }
        for(int i=0;i<n.length;i++){
            System.out.println(n[i][i]);
        }
    }
}
