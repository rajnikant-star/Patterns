import java.util.Scanner;
public class TwoDSum {
    public  static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int[][] n= new int[x][y];
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                n[i][j] = sc.nextInt();
            }
        }
        int sum = 0;
        for(int i=0;i<n.length;i++){
            for(int j=0;j<n[i].length;j++){
                sum += n[i][j];
            }
        }
        System.out.print(sum);
    }
}
