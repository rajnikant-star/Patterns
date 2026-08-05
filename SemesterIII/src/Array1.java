import java.util.Scanner;

public class Array1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i=0;i<n;i++){
            int j = sc.nextInt();
            arr[i] = j;
        }
        System.out.println("Target");
        int target = sc.nextInt();
        boolean found = false;
        for(int k=0;k<n;k++){
            if(arr[k] == target){
                System.out.println("Found");
                System.out.println("Index:"+ k);
                found = true;
                break;
            }
            if(!found){
                System.out.println("Not Found");
                break;
            }
        }
    }
}
