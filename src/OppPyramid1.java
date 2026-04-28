import java.util.Scanner;

public class OppPyramid1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int copy = n;
        for(int i=1;i<=(int)(n+1)/2;i++){   //rows
            for(int j=0;j<i-1;j++){        //Space
                System.out.print(" ");
            }
            for(int k=1;k<=copy;k++){    //Star
                System.out.print("*");
            }
            System.out.println();
            copy = copy - 2;
        }
    }
}
